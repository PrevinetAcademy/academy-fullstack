package it.previnet.academy.fullstack.application.port;

import it.previnet.academy.fullstack.bean.Operazione;
import it.previnet.academy.fullstack.bean.Polizza;

import java.util.List;

public interface PolizzaManager {

    List<Polizza> fetch(String indStatoPolizza, String numPolizza);

    List<Operazione> fetchOperazioni(Integer tokenPolizza);
}
