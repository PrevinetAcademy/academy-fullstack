package it.previnet.academy.fullstack.application.adapter;

import it.previnet.academy.fullstack.application.adapter.mapper.RecapitoNominativoMapper;
import it.previnet.academy.fullstack.application.adapter.mapper.TipoRecapitoNominativoMapper;
import it.previnet.academy.fullstack.application.port.RecapitoNominativoManager;
import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.bean.RecapitoNominativo;
import it.previnet.academy.fullstack.bean.TipoRecapitoNominativo;
import it.previnet.academy.fullstack.model.NominativoEntity;
import it.previnet.academy.fullstack.model.RecapitoNominativoEntity;
import it.previnet.academy.fullstack.model.TipoRecapitoNominativoEntity;
import it.previnet.academy.fullstack.repository.port.NominativoRepository;
import it.previnet.academy.fullstack.repository.port.RecapitoNominativoRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class RecapitoNominativoManagerImpl implements RecapitoNominativoManager {
    private static final Logger logger = Logger.getLogger(RecapitoNominativoManagerImpl.class);

    @Inject
    RecapitoNominativoRepository recapitoNominativoRepository;

    @Inject
    NominativoRepository nominativoRepository;

    @Inject
    RecapitoNominativoMapper recapitoNominativoMapper;

    @Inject
    TipoRecapitoNominativoMapper tipoRecapitoNominativoMapper;

    @Override
    public List<RecapitoNominativo> fetch(Integer tokenNominativo) {
        logger.info("called MANAGER fetch");

        if (tokenNominativo == null) {
            return null;
        }

        List<RecapitoNominativoEntity> recapitoNominativoEntities = recapitoNominativoRepository.fetch(tokenNominativo);
        return recapitoNominativoMapper.mapEntitiesToBeans(recapitoNominativoEntities);
    }

    @Override
    public List<RecapitoNominativo> fetch(Nominativo nominativo) {
        return fetch(nominativo.getTokenNominativo());
    }

    @Override
    public RecapitoNominativo save(Integer tokenNominativo, RecapitoNominativo recapitoNominativo) {
        logger.info("called MANAGER save");
        if (recapitoNominativo.getTokenNominativo() != null && !recapitoNominativo.getTokenNominativo().equals(tokenNominativo)) {
            logger.error("token nominativo mismatch!");
            return null;
        }

        RecapitoNominativoEntity recapitoNominativoEntity = null;
        if (recapitoNominativo.getTokenRecapitoNominativo() != null) {
            recapitoNominativoEntity = recapitoNominativoRepository.findByToken(recapitoNominativo.getTokenRecapitoNominativo());
        }

        RecapitoNominativoEntity entityToSave = recapitoNominativoMapper.mapBeanToEntity(recapitoNominativo, recapitoNominativoEntity);

        if (recapitoNominativoEntity == null) {
            entityToSave.setTokenRecapitoNominativo(null);

            NominativoEntity nominativoEntity = nominativoRepository.findByToken(tokenNominativo);
            entityToSave.setNominativo(nominativoEntity);

            recapitoNominativoRepository.persist(entityToSave);
        } else {
            recapitoNominativoRepository.merge(entityToSave);
        }

        return recapitoNominativoMapper.mapEntityToBean(entityToSave);
    }

    @Override
    public List<TipoRecapitoNominativo> fetchTipoRecapito() {
        List<TipoRecapitoNominativoEntity> tipoRecapitoNominativoEntities = recapitoNominativoRepository.fetchTipoRecapito();
        return tipoRecapitoNominativoMapper.mapEntitiesToBeans(tipoRecapitoNominativoEntities);
    }
}
