package it.previnet.academy.fullstack.application.port;

import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.bean.TipoSesso;
import it.previnet.academy.fullstack.bean.request.NominativoRequest;

import java.io.InputStream;
import java.util.List;

public interface NominativoManager {

    List<Nominativo> fetch(String cognome, String nome, String tipoSesso);

    Nominativo save(Nominativo nominativo);

    Nominativo uploadNominativo(NominativoRequest request, InputStream file) throws Exception;

    List<TipoSesso> fetchTipoSesso();
}
