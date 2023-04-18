package it.previnet.academy.fullstack.application.adapter;

import it.previnet.academy.fullstack.application.adapter.mapper.NominativoMapper;
import it.previnet.academy.fullstack.application.adapter.mapper.TipoSessoMapper;
import it.previnet.academy.fullstack.application.port.NominativoManager;
import it.previnet.academy.fullstack.bean.DocumentoIdentificazione;
import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.bean.RecapitoNominativo;
import it.previnet.academy.fullstack.bean.TipoSesso;
import it.previnet.academy.fullstack.bean.enums.TipoDocumentoIdentificazione;
import it.previnet.academy.fullstack.bean.enums.TipoRecapitoNominativo;
import it.previnet.academy.fullstack.bean.request.NominativoRequest;
import it.previnet.academy.fullstack.model.DocumentoIdentificazioneEntity;
import it.previnet.academy.fullstack.model.NominativoEntity;
import it.previnet.academy.fullstack.model.TipoSessoEntity;
import it.previnet.academy.fullstack.repository.port.DocumentoIdentificazioneRepository;
import it.previnet.academy.fullstack.repository.port.NominativoRepository;
import it.previnet.academy.fullstack.repository.port.RecapitoNominativoRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static it.previnet.academy.fullstack.bean.enums.TipoDocumentoIdentificazione.CARTA_IDENTITA;
import static it.previnet.academy.fullstack.bean.enums.TipoDocumentoIdentificazione.PASSAPORTO;
import static it.previnet.academy.fullstack.bean.enums.TipoDocumentoIdentificazione.PATENTE;
import static it.previnet.academy.fullstack.bean.enums.TipoDocumentoIdentificazione.VISURA_CAMERALE;
import static it.previnet.academy.fullstack.bean.enums.TipoRecapitoNominativo.INVIO_CORRISPONDENZA;
import static it.previnet.academy.fullstack.bean.enums.TipoRecapitoNominativo.RESIDENZA;
import static it.previnet.academy.fullstack.bean.enums.TipoRecapitoNominativo.SEDE_AMMINISTRATIVA;
import static it.previnet.academy.fullstack.bean.enums.TipoRecapitoNominativo.SEDE_LEGALE;
import static it.previnet.academy.fullstack.bean.enums.TipoSesso.FEMMINA;
import static it.previnet.academy.fullstack.bean.enums.TipoSesso.GIURIDICO;
import static it.previnet.academy.fullstack.bean.enums.TipoSesso.MASCHIO;
import static org.apache.commons.io.IOUtils.toByteArray;
import static org.apache.commons.lang3.StringUtils.isAnyBlank;

@ApplicationScoped
public class NominativoManagerImpl implements NominativoManager {
    private static final Logger logger = Logger.getLogger(NominativoManagerImpl.class);

    @Inject
    NominativoRepository nominativoRepository;

    @Inject
    DocumentoIdentificazioneRepository documentoIdentificazioneRepository;

    @Inject
    RecapitoNominativoRepository recapitoNominativoRepository;

    @Inject
    NominativoMapper nominativoMapper;

    @Inject
    TipoSessoMapper tipoSessoMapper;

    @Override
    public List<Nominativo> fetch(String cognome, String nome, String tipoSesso) {
        logger.info("called MANAGER fetch");
        List<NominativoEntity> nominativoEntities = nominativoRepository.fetch(cognome, nome, tipoSesso);
        return nominativoMapper.mapEntitiesToBeans(nominativoEntities);
    }

    @Override
    public Nominativo save(Nominativo nominativo) {
        logger.info("called MANAGER save");

        NominativoEntity nominativoEntity = null;
        if (nominativo.getTokenNominativo() != null) {
            nominativoEntity = nominativoRepository.findByToken(nominativo.getTokenNominativo());
        }

        NominativoEntity entityToSave = nominativoMapper.mapBeanToEntity(nominativo, nominativoEntity);

        if (nominativoEntity == null) {
            // per sicurezza si annullano i token (chiavi) per il persist
            entityToSave.setTokenNominativo(null);
            if (entityToSave.getRecapitoNominativo() != null) {
                entityToSave.getRecapitoNominativo().forEach(r -> r.setTokenRecapitoNominativo(null));
            }
            if (entityToSave.getDocumentoIdentificazione() != null) {
                entityToSave.getDocumentoIdentificazione().forEach(d -> d.setTokenDocumentoIdentificazion(null));
            }

            nominativoRepository.persist(entityToSave);
        } else {
            nominativoRepository.merge(entityToSave);
        }

        return nominativoMapper.mapEntityToBean(entityToSave);
    }

    @Override
    public Nominativo uploadNominativo(NominativoRequest request, InputStream file) throws Exception {
        logger.info("called MANAGER uploadNominativo");

        it.previnet.academy.fullstack.bean.enums.TipoSesso tipoSesso = it.previnet.academy.fullstack.bean.enums.TipoSesso.lookup(request.getTipoSesso());
        TipoRecapitoNominativo tipoRecapitoNominativo = TipoRecapitoNominativo.lookup(request.getTipoRecapitoNominativo());
        TipoDocumentoIdentificazione tipoDocumentoIdentificazione = TipoDocumentoIdentificazione.lookup(request.getTipoDocumentoIdentificazione());

        logger.debug("request is: " + request);

        boolean personaFisica = !isAnyBlank(request.getDenCognome(), request.getDenNome(), request.getCodFiscale());
        boolean personaGiuridica = !isAnyBlank(request.getDenRagioneSociale(), request.getCodPartitaIva());

        List<String> errors = new ArrayList<>();

        if (!personaFisica && !personaGiuridica) {
            errors.add("Dati anagrafici mancanti");
        }

        if (personaFisica && personaGiuridica) {
            errors.add("Dati anagrafici incoerenti");
        }

        if (personaFisica && !(tipoSesso == MASCHIO || tipoSesso == FEMMINA)) {
            errors.add("Tipo sesso non valido per la persona fisica");
        }

        if (personaFisica && request.getDataNascita() == null) {
            errors.add("Data nascita mancante per la persona fisica");
        }

        if (personaFisica && !(tipoRecapitoNominativo == RESIDENZA || tipoRecapitoNominativo == INVIO_CORRISPONDENZA)) {
            errors.add("Tipo recapito non valido per la persona fisica");
        }

        if (personaFisica && !(tipoDocumentoIdentificazione == CARTA_IDENTITA || tipoDocumentoIdentificazione == PATENTE || tipoDocumentoIdentificazione == PASSAPORTO)) {
            errors.add("Tipo documento non valido per la persona fisica");
        }

        if (personaGiuridica && tipoSesso != GIURIDICO) {
            errors.add("Tipo sesso non valido per la persona giuridica");
        }

        if (personaGiuridica && !(tipoRecapitoNominativo == SEDE_LEGALE || tipoRecapitoNominativo == SEDE_AMMINISTRATIVA)) {
            errors.add("Tipo recapito non valido per la persona giuridica");
        }

        if (personaGiuridica && tipoDocumentoIdentificazione != VISURA_CAMERALE) {
            errors.add("Tipo documento non valido per la persona fisica");
        }

        Nominativo nominativo = new Nominativo();
        nominativo.setCodFiscale(request.getCodFiscale());
        nominativo.setCodPartitaIva(request.getCodPartitaIva());
        nominativo.setDenCognome(request.getDenCognome());
        nominativo.setDenNome(request.getDenNome());
        nominativo.setDenRagioneSociale(request.getDenRagioneSociale());
        nominativo.setTipoSesso(tipoSesso);
        nominativo.setDataNascita(request.getDataNascita());
        nominativo.setCodProvinciaIstatNascita(request.getCodProvinciaNascita());
        nominativo.setDenComuneNascita(request.getDenComuneNascita());
        nominativo.setCodNazioneCittadinanza(request.getCodNazioneCittadinanza());
        nominativo.setDataTimestamp(LocalDateTime.now());
        nominativo.setDenLogin("UPLOAD");

        RecapitoNominativo recapitoNominativo = new RecapitoNominativo();
        recapitoNominativo.setTipoRecapitoNominativo(tipoRecapitoNominativo);
        recapitoNominativo.setDenPresso(request.getDenPresso());
        recapitoNominativo.setDenNumeroCivico(request.getDenNumeroCivico());
        recapitoNominativo.setCodCap(request.getCodCap());
        recapitoNominativo.setDenLocalita(request.getDenLocalita());
        recapitoNominativo.setCodProvincia(request.getCodProvincia());
        recapitoNominativo.setCodNazione(request.getCodNazione());
        recapitoNominativo.setDenIndirizzo(request.getDenIndirizzo());
        recapitoNominativo.setDataInizio(LocalDateTime.now());
        recapitoNominativo.setDataTimestamp(LocalDateTime.now());
        recapitoNominativo.setDenLogin("UPLOAD");
        nominativo.addRecapitoNominativo(recapitoNominativo);

        DocumentoIdentificazione documentoIdentificazione = new DocumentoIdentificazione();
        documentoIdentificazione.setTipoDocumentoIdentificazione(tipoDocumentoIdentificazione);
        documentoIdentificazione.setCodDocumentoIdentificazione(request.getCodDocumentoIdentificazione());
        documentoIdentificazione.setDataRilascio(request.getDataRilascio());
        documentoIdentificazione.setDataScadenza(request.getDataScadenza());
        documentoIdentificazione.setDenEnteRilascio(request.getDenEnteRilascio());
        documentoIdentificazione.setCodSiglaProvinciaRilascio(request.getCodSiglaProvinciaRilascio());
        documentoIdentificazione.setCodNazione(request.getCodNazioneRilascio());
        documentoIdentificazione.setDataInizio(LocalDateTime.now());
        documentoIdentificazione.setDataTimestamp(LocalDateTime.now());
        documentoIdentificazione.setDenLogin("UPLOAD");
        nominativo.addDocumentoIdentificazione(documentoIdentificazione);

        NominativoEntity nominativoEntity = nominativoMapper.mapBeanToEntity(nominativo);
        Optional<DocumentoIdentificazioneEntity> documentoIdentificazioneEntity = nominativoEntity.getDocumentoIdentificazione().stream().findFirst();
        if (documentoIdentificazioneEntity.isPresent()) {
            documentoIdentificazioneEntity.get().setContent(toByteArray(file));
        }

        if (errors.isEmpty()) {
            nominativoRepository.persist(nominativoEntity);
            nominativoEntity.getRecapitoNominativo().forEach(rn -> {
                rn.setNominativo(nominativoEntity);
                recapitoNominativoRepository.persist(rn);
            });
            nominativoEntity.getDocumentoIdentificazione().forEach(di -> {
                di.setNominativo(nominativoEntity);
                documentoIdentificazioneRepository.persist(di);
            });


            return nominativoMapper.mapEntityToBean(nominativoEntity);
        }

        throw new Exception("cannot upload nominativo");
    }

    @Override
    public List<TipoSesso> fetchTipoSesso() {
        List<TipoSessoEntity> tipoSessoEntities = nominativoRepository.fetchTipoSesso();
        return tipoSessoMapper.mapEntitiesToBeans(tipoSessoEntities);
    }
}
