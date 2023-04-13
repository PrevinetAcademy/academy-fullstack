package it.previnet.academy.fullstack.application.port;

import it.previnet.academy.fullstack.bean.Operazione;
import it.previnet.academy.fullstack.bean.Polizza;

import java.time.LocalDateTime;
import java.util.List;

public interface PolizzaManager {

    List<Polizza> fetch(String indStatoPolizza, String numPolizza);

    List<Operazione> fetchOperazioni(Integer tokenPolizza);

    /*
     * ESERCIZIO 1
     * Selezione delle polizze la cui data decorrenza polizza sia superiore al parametro di filtro
     */
    List<Polizza> esercizio1(LocalDateTime dataDecorrenza);

    /*
     * ESERCIZIO 2
     * Selezione delle polizze con un'operazione di sottoscrizione ('0')  la cui data decorrenza sia superiore al parametro di filtro
     */
    List<Polizza> esercizio2(LocalDateTime dataDecorrenza);
}
