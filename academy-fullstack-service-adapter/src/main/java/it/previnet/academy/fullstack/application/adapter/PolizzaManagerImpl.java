package it.previnet.academy.fullstack.application.adapter;

import it.previnet.academy.fullstack.application.adapter.mapper.PolizzaMapper;
import it.previnet.academy.fullstack.application.port.PolizzaManager;
import it.previnet.academy.fullstack.bean.Polizza;
import it.previnet.academy.fullstack.model.PolizzaEntity;
import it.previnet.academy.fullstack.repository.port.PolizzaRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PolizzaManagerImpl implements PolizzaManager {
    private static final Logger logger = Logger.getLogger(PolizzaManagerImpl.class);

    @Inject
    PolizzaRepository polizzaRepository;

    @Inject
    PolizzaMapper polizzaMapper;

    @Override
    public List<Polizza> fetch(String indStatoPolizza) {
        logger.info("called MANAGER fetch");

        List<PolizzaEntity> polizzaEntities = polizzaRepository.fetch(indStatoPolizza);

        logger.info("repository fetc result size: " + polizzaEntities.size());

        return polizzaMapper.mapEntitiesToBeans(polizzaEntities);
    }
}
