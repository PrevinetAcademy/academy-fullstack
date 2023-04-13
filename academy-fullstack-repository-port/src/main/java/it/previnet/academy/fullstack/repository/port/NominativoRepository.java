package it.previnet.academy.fullstack.repository.port;

import it.previnet.academy.fullstack.model.NominativoEntity;

import java.util.List;

public interface NominativoRepository extends AbstractRepository<NominativoEntity> {

    List<NominativoEntity> fetch(String cognome, String nome, String tipoSesso);
}
