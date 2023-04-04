package it.previnet.academy.fullstack.application.port;

import it.previnet.academy.fullstack.bean.Nominativo;

import java.util.List;

public interface NominativoManager {

    List<Nominativo> fetch(String cognome, String nome, String tipoSesso);

    Nominativo save(Nominativo nominativo);
}
