package it.previnet.academy.fullstack.application.adapter;

import it.previnet.academy.fullstack.application.adapter.mapper.NominativoMapper;
import it.previnet.academy.fullstack.application.port.NominativoManager;
import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.model.NominativoEntity;
import it.previnet.academy.fullstack.repository.port.NominativoRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class NominativoManagerImpl implements NominativoManager {
    private static final Logger logger = Logger.getLogger(NominativoManagerImpl.class);

    @Inject
    NominativoRepository nominativoRepository;

    @Inject
    NominativoMapper nominativoMapper;

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
}
