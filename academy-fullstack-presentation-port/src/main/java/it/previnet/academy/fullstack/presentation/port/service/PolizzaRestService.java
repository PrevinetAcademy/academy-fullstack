package it.previnet.academy.fullstack.presentation.port.service;

import it.previnet.academy.fullstack.bean.Operazione;
import it.previnet.academy.fullstack.bean.Polizza;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("polizza")
public interface PolizzaRestService {

    @GET
    @Path("fetch")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<Polizza> fetch(@QueryParam("stato") String indStatoPolizza, @QueryParam("numPolizza") String numPolizza);

    @GET
    @Path("operazione/fetch/{tokenPolizza}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<Operazione> fetchOperazioni(@PathParam("tokenPolizza") Integer tokenPolizza);

    /*
     * ESERCIZIO 1
     * Selezione delle polizze la cui data decorrenza polizza sia superiore al parametro di filtro
     */
    @GET
    @Path("esercizio1")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<Polizza> esercizio1(@QueryParam("dataDecorrenza") String dataDecorrenza);

    /*
     * ESERCIZIO 2
     * Selezione delle polizze con un'operazione di sottoscrizione ('0')  la cui data decorrenza sia superiore al parametro di filtro
     */
    @GET
    @Path("esercizio2")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<Polizza> esercizio2(@QueryParam("dataDecorrenza") String dataDecorrenza);
}
