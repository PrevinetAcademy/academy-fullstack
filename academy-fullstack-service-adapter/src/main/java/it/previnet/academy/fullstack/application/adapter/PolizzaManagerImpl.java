package it.previnet.academy.fullstack.application.adapter;

import it.previnet.academy.fullstack.application.adapter.mapper.OperazioneMapper;
import it.previnet.academy.fullstack.application.adapter.mapper.PolizzaMapper;
import it.previnet.academy.fullstack.application.port.PolizzaManager;
import it.previnet.academy.fullstack.bean.Operazione;
import it.previnet.academy.fullstack.bean.Polizza;
import it.previnet.academy.fullstack.model.OperazioneEntity;
import it.previnet.academy.fullstack.model.PolizzaEntity;
import it.previnet.academy.fullstack.repository.port.OperazioneRepository;
import it.previnet.academy.fullstack.repository.port.PolizzaRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class PolizzaManagerImpl implements PolizzaManager {
    private static final Logger logger = Logger.getLogger(PolizzaManagerImpl.class);

    @Inject
    PolizzaRepository polizzaRepository;

    @Inject
    PolizzaMapper polizzaMapper;

    @Inject
    OperazioneRepository operazioneRepository;

    @Inject
    OperazioneMapper operazioneMapper;

    @Override
    public List<Polizza> fetch(String indStatoPolizza, String numPolizza) {
        logger.info("called MANAGER fetch");

        List<PolizzaEntity> polizzaEntities = polizzaRepository.fetch(indStatoPolizza, numPolizza);

        logger.info("repository fetch result size: " + polizzaEntities.size());

        return polizzaMapper.mapEntitiesToBeans(polizzaEntities);
    }

    @Override
    public List<Operazione> fetchOperazioni(Integer tokenPolizza) {
        logger.info("called MANAGER fetchOperazioni");

        List<OperazioneEntity> operazioneEntities = operazioneRepository.fetch(tokenPolizza);
        return operazioneMapper.mapEntitiesToBeans(operazioneEntities);
    }

    @Override
    public List<Polizza> esercizio1(LocalDateTime dataDecorrenza) {
        logger.info("called MANAGER esercizio1");

        List<PolizzaEntity> polizzaEntities = polizzaRepository.esercizio1(dataDecorrenza);
        return polizzaMapper.mapEntitiesToBeans(polizzaEntities);
    }

    @Override
    public List<Polizza> esercizio2(LocalDateTime dataDecorrenza) {
        logger.info("called MANAGER esercizio2");

        List<PolizzaEntity> polizzaEntities = polizzaRepository.esercizio2(dataDecorrenza);
        return polizzaMapper.mapEntitiesToBeans(polizzaEntities);
    }
}
