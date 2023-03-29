package it.previnet.academy.fullstack.presentation.adapter.service;

import it.previnet.academy.fullstack.presentation.port.service.CoreRestService;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import java.util.Date;

@ApplicationScoped
public class CoreRestServiceImpl implements CoreRestService {

    private static final Logger logger = Logger.getLogger(CoreRestServiceImpl.class);

    @Context
    private UriInfo uriInfo;

    @Override
    public String ping() {
        return "PONG at " + new Date();
    }

}
