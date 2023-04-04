package it.previnet.academy.fullstack.repository.port;

import it.previnet.academy.fullstack.model.DocumentoIdentificazioneEntity;

import java.util.List;

public interface DocumentoIdentificazioneRepository extends AbstractRepository<DocumentoIdentificazioneEntity> {

    List<DocumentoIdentificazioneEntity> fetch(Integer tokenNominativo);
}
