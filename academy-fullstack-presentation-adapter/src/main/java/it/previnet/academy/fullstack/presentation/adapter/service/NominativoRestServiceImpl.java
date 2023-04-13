package it.previnet.academy.fullstack.presentation.adapter.service;

import it.previnet.academy.fullstack.application.port.DocumentoIdentificazioneManager;
import it.previnet.academy.fullstack.application.port.NominativoManager;
import it.previnet.academy.fullstack.application.port.RecapitoNominativoManager;
import it.previnet.academy.fullstack.bean.DocumentoIdentificazione;
import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.bean.RecapitoNominativo;
import it.previnet.academy.fullstack.presentation.port.service.NominativoRestService;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class NominativoRestServiceImpl implements NominativoRestService {
    private static final Logger logger = Logger.getLogger(NominativoRestServiceImpl.class);

    @Inject
    NominativoManager nominativoManager;

    @Inject
    RecapitoNominativoManager recapitoNominativoManager;

    @Inject
    DocumentoIdentificazioneManager documentoIdentificazioneManager;

    @Override
    public List<Nominativo> fetch(String cognome, String nome, String tipoSesso) {
        logger.info("called REST SERVICE fetch");
        return nominativoManager.fetch(cognome, nome, tipoSesso);
    }

    @Override
    public Nominativo save(Nominativo nominativo) {
        logger.info("called REST SERVICE save");
        return nominativoManager.save(nominativo);
    }

    @Override
    public List<RecapitoNominativo> fetchRecapiti(Integer tokenNominativo) {
        logger.info("called REST SERVICE fetchRecapiti");
        return recapitoNominativoManager.fetch(tokenNominativo);
    }

    @Override
    public RecapitoNominativo saveRecapito(Integer tokenNominativo, RecapitoNominativo recapitoNominativo) {
        logger.info("called REST SERVICE saveRecapito");
        return recapitoNominativoManager.save(tokenNominativo, recapitoNominativo);
    }

    @Override
    public List<DocumentoIdentificazione> fetchDocumenti(Integer tokenNominativo) {
        logger.info("called REST SERVICE fetchDocumenti");
        return documentoIdentificazioneManager.fetch(tokenNominativo);
    }

    @Override
    public DocumentoIdentificazione saveDocumento(Integer tokenNominativo, DocumentoIdentificazione documentoIdentificazione) {
        logger.info("called REST SERVICE saveDocumento");
        return documentoIdentificazioneManager.save(tokenNominativo, documentoIdentificazione);
    }

    @Override
    public DocumentoIdentificazione uploadDocumento(Integer tokenDocumento, byte[] imageBytes) {
        logger.info("called REST SERVICE uploadDocumento");
        return documentoIdentificazioneManager.upload(tokenDocumento, imageBytes);
    }

    @Override
    public byte[] getDocumento(Integer tokenDocumento) {
        logger.info("called REST SERVICE getDocumento");
        return documentoIdentificazioneManager.getContent(tokenDocumento);
    }
}
