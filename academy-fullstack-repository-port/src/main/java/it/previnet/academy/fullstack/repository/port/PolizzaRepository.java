package it.previnet.academy.fullstack.repository.port;

import it.previnet.academy.fullstack.model.PolizzaEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface PolizzaRepository extends AbstractRepository<PolizzaEntity> {

    List<PolizzaEntity> fetch(String indStatoPolizza, String numPolizza);

    /*
     * ESERCIZIO 1
     * Selezione delle polizze la cui data decorrenza polizza sia superiore al parametro di filtro
     */
    List<PolizzaEntity> esercizio1(LocalDateTime dataDecorrenza);

    /*
     * ESERCIZIO 2
     * Selezione delle polizze con un'operazione di sottoscrizione ('0')  la cui data decorrenza sia superiore al parametro di filtro
     */
    List<PolizzaEntity> esercizio2(LocalDateTime dataDecorrenza);
}
