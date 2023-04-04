package it.previnet.academy.fullstack.repository.port;

import it.previnet.academy.fullstack.model.RecapitoNominativoEntity;

import java.util.List;

public interface RecapitoNominativoRepository extends AbstractRepository<RecapitoNominativoEntity> {

    List<RecapitoNominativoEntity> fetch(Integer tokenNominativo);
}
