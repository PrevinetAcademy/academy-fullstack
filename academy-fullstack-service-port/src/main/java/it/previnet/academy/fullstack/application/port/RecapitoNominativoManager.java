package it.previnet.academy.fullstack.application.port;

import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.bean.RecapitoNominativo;
import it.previnet.academy.fullstack.bean.TipoRecapitoNominativo;

import java.util.List;

public interface RecapitoNominativoManager {

    List<RecapitoNominativo> fetch(Integer tokenNominativo);

    List<RecapitoNominativo> fetch(Nominativo nominativo);

    RecapitoNominativo save(Integer tokenNominativo, RecapitoNominativo recapitoNominativo);

    List<TipoRecapitoNominativo> fetchTipoRecapito();
}
