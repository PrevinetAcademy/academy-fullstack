package it.previnet.academy.fullstack.repository.port;

import it.previnet.academy.fullstack.model.PolizzaEntity;

import java.util.List;

public interface PolizzaRepository extends AbstractRepository<PolizzaEntity> {

    List<PolizzaEntity> fetch(String indStatoPolizza);
}
