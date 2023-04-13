package it.previnet.academy.fullstack.repository.port;

import it.previnet.academy.fullstack.model.DocumentoIdentificazioneEntity;
import it.previnet.academy.fullstack.model.TipoDocumentoIdentificazioneEntity;

import java.util.List;

public interface DocumentoIdentificazioneRepository extends AbstractRepository<DocumentoIdentificazioneEntity> {

    List<DocumentoIdentificazioneEntity> fetch(Integer tokenNominativo);

    List<TipoDocumentoIdentificazioneEntity> fetchTipoDocumento();
}
