package it.previnet.academy.fullstack.presentation.adapter.service;

import it.previnet.academy.fullstack.application.port.PolizzaManager;
import it.previnet.academy.fullstack.bean.Polizza;
import it.previnet.academy.fullstack.presentation.port.service.PolizzaRestService;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PolizzaRestServiceImpl implements PolizzaRestService {
    private static final Logger logger = Logger.getLogger(PolizzaRestServiceImpl.class);

    @Inject
    PolizzaManager polizzaManager;

    @Override
    public List<Polizza> fetch(String indStatoPolizza) {
        logger.info("called REST SERVICE fetch");
        return polizzaManager.fetch(indStatoPolizza);
    }
}
