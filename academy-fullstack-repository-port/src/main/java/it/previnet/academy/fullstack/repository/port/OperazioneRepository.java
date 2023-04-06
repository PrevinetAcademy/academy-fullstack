package it.previnet.academy.fullstack.repository.port;

import it.previnet.academy.fullstack.model.OperazioneEntity;

import java.util.List;

public interface OperazioneRepository extends AbstractRepository<OperazioneEntity> {

    List<OperazioneEntity> fetch(Integer tokenPolizza);
}
