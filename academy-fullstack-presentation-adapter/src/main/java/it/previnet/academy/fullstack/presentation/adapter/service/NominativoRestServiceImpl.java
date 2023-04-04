package it.previnet.academy.fullstack.presentation.adapter.service;

import it.previnet.academy.fullstack.application.port.NominativoManager;
import it.previnet.academy.fullstack.bean.Nominativo;
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
}
