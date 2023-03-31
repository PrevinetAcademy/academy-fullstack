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
    public List<Nominativo> fetch(String cognome, String nome, String tipoSesso, boolean documento) {
        logger.info("called MANAGER fetch");
        List<NominativoEntity> nominativoEntities = nominativoRepository.fetch(cognome, nome, tipoSesso, documento);
        return nominativoMapper.mapEntitiesToBeans(nominativoEntities);
    }
}
