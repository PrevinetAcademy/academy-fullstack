package it.previnet.academy.fullstack.presentation.port.service;

import it.previnet.academy.fullstack.bean.DocumentoIdentificazione;
import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.bean.RecapitoNominativo;
import it.previnet.academy.fullstack.bean.TipoDocumentoIdentificazione;
import it.previnet.academy.fullstack.bean.TipoRecapitoNominativo;
import it.previnet.academy.fullstack.bean.TipoSesso;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

    @POST
    @Path("upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    Nominativo uploadNominativo(MultipartFormDataInput input) throws Exception;

    @GET
    @Path("recapito/{tokenNominativo}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<RecapitoNominativo> fetchRecapiti(@PathParam("tokenNominativo") Integer tokenNominativo);

    @POST
    @Path("recapito/{tokenNominativo}")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    RecapitoNominativo saveRecapito(@PathParam("tokenNominativo") Integer tokenNominativo, RecapitoNominativo recapitoNominativo);

    @GET
    @Path("documento/{tokenNominativo}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<DocumentoIdentificazione> fetchDocumenti(@PathParam("tokenNominativo") Integer tokenNominativo);

    @POST
    @Path("documento/{tokenNominativo}")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    DocumentoIdentificazione saveDocumento(@PathParam("tokenNominativo") Integer tokenNominativo, DocumentoIdentificazione documentoIdentificazione);

    @POST
    @Path("documento/upload/{tokenDocumento}")
    @Consumes({"image/*"})
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    DocumentoIdentificazione uploadDocumento(@PathParam("tokenDocumento") Integer tokenDocumento, byte[] imageBytes);

    @GET
    @Path("documento/get/{tokenDocumento}")
    @Produces({"image/png", "image/jpg"})
    byte[] getDocumento(@PathParam("tokenDocumento") Integer tokenDocumento);

    @GET
    @Path("tipo/sesso")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<TipoSesso> fetchTipoSesso();

    @GET
    @Path("tipo/recapito")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<TipoRecapitoNominativo> fetchTipoRecapito();

    @GET
    @Path("tipo/documento")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    List<TipoDocumentoIdentificazione> fetchTipoDocumento();
}
