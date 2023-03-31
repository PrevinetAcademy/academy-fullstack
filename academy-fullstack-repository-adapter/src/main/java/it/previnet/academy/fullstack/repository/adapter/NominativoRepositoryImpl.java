package it.previnet.academy.fullstack.repository.adapter;

import it.previnet.academy.fullstack.model.NominativoEntity;
import it.previnet.academy.fullstack.repository.port.NominativoRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class NominativoRepositoryImpl extends AbstractRepositoryImpl<NominativoEntity> implements NominativoRepository {
    private static final Logger logger = Logger.getLogger(NominativoRepositoryImpl.class);

    @Override
    public List<NominativoEntity> fetch(String cognome, String nome, String tipoSesso, boolean documento) {
        logger.info("called REPOSITORY fetch");
        return null;
    }
}
