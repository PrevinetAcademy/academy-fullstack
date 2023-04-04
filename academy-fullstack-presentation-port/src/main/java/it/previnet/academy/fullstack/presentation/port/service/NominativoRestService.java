package it.previnet.academy.fullstack.presentation.port.service;

import it.previnet.academy.fullstack.bean.Nominativo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("nominativo")
public interface NominativoRestService {

    @GET
    @Path("fetch")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<Nominativo> fetch(@QueryParam("cognome") String cognome, @QueryParam("nome") String nome, @QueryParam("tipoSesso") String tipoSesso);

    @POST
    @Path("save")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    Nominativo save(Nominativo nominativo);
}
