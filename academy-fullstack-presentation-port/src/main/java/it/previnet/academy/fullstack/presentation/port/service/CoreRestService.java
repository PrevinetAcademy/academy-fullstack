package it.previnet.academy.fullstack.presentation.port.service;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("core")
public interface CoreRestService {

    @GET
    @Path("/ping")
    @Produces(MediaType.TEXT_PLAIN + ";charset=UTF-8")
    @PermitAll
    String ping();

}
