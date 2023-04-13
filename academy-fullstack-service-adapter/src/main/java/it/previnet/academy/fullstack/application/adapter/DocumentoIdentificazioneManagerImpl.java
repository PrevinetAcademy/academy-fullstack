package it.previnet.academy.fullstack.application.adapter;

import it.previnet.academy.fullstack.application.adapter.mapper.DocumentoIdentificazioneMapper;
import it.previnet.academy.fullstack.application.port.DocumentoIdentificazioneManager;
import it.previnet.academy.fullstack.bean.DocumentoIdentificazione;
import it.previnet.academy.fullstack.model.DocumentoIdentificazioneEntity;
import it.previnet.academy.fullstack.model.NominativoEntity;
import it.previnet.academy.fullstack.repository.port.DocumentoIdentificazioneRepository;
import it.previnet.academy.fullstack.repository.port.NominativoRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class DocumentoIdentificazioneManagerImpl implements DocumentoIdentificazioneManager {
    private static final Logger logger = Logger.getLogger(DocumentoIdentificazioneManagerImpl.class);

    @Inject
    DocumentoIdentificazioneRepository documentoIdentificazioneRepository;

    @Inject
    DocumentoIdentificazioneMapper documentoIdentificazioneMapper;

    @Inject
    NominativoRepository nominativoRepository;

    @Override
    public List<DocumentoIdentificazione> fetch(Integer tokenNominativo) {
        logger.info("called MANAGER fetch");

        if (tokenNominativo == null) {
            return null;
        }

        List<DocumentoIdentificazioneEntity> documentoIdentificazioneEntities = documentoIdentificazioneRepository.fetch(tokenNominativo);
        return documentoIdentificazioneMapper.mapEntitiesToBeans(documentoIdentificazioneEntities);
    }

    @Override
    public DocumentoIdentificazione save(Integer tokenNominativo, DocumentoIdentificazione documentoIdentificazione) {
        logger.info("called MANAGER save");
        if (documentoIdentificazione.getTokenNominativo() != null && !documentoIdentificazione.getTokenNominativo().equals(tokenNominativo)) {
            logger.error("token nominativo mismatch!");
            return null;
        }

        DocumentoIdentificazioneEntity documentoIdentificazioneEntity = null;
        if (documentoIdentificazione.getTokenDocumentoIdentificazion() != null) {
            documentoIdentificazioneEntity = documentoIdentificazioneRepository.findByToken(documentoIdentificazione.getTokenDocumentoIdentificazion());
        }

        DocumentoIdentificazioneEntity entityToSave = documentoIdentificazioneMapper.mapBeanToEntity(documentoIdentificazione, documentoIdentificazioneEntity);

        if (documentoIdentificazioneEntity == null) {
            entityToSave.setTokenDocumentoIdentificazion(null);

            NominativoEntity nominativoEntity = nominativoRepository.findByToken(tokenNominativo);
            entityToSave.setNominativo(nominativoEntity);

            documentoIdentificazioneRepository.persist(entityToSave);
        } else {
            documentoIdentificazioneRepository.merge(entityToSave);
        }

        return documentoIdentificazioneMapper.mapEntityToBean(entityToSave);
    }

    @Override
    public DocumentoIdentificazione upload(Integer tokenDocumento, byte[] bytes) {
        logger.info("called MANAGER upload");

        DocumentoIdentificazioneEntity documentoIdentificazioneEntity = documentoIdentificazioneRepository.findByToken(tokenDocumento);
        if (documentoIdentificazioneEntity == null) {
            return null;
        }

        documentoIdentificazioneEntity.setContent(bytes);
        documentoIdentificazioneRepository.merge(documentoIdentificazioneEntity);

        return documentoIdentificazioneMapper.mapEntityToBean(documentoIdentificazioneEntity);
    }

    @Override
    public byte[] getContent(Integer tokenDocumento) {
        logger.info("called MANAGER getContent");

        DocumentoIdentificazioneEntity documentoIdentificazioneEntity = documentoIdentificazioneRepository.findByToken(tokenDocumento);
        if (documentoIdentificazioneEntity == null) {
            return null;
        }

        return documentoIdentificazioneEntity.getContent();
    }
}
