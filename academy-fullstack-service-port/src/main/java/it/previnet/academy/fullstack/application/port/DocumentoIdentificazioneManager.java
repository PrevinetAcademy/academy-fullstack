package it.previnet.academy.fullstack.application.port;

import it.previnet.academy.fullstack.bean.DocumentoIdentificazione;

import java.util.List;

public interface DocumentoIdentificazioneManager {

    List<DocumentoIdentificazione> fetch(Integer tokenNominativo);

    DocumentoIdentificazione save(Integer tokenNominativo, DocumentoIdentificazione documentoIdentificazione);

    DocumentoIdentificazione upload(Integer tokenDocumento, byte[] bytes);

    byte[] getContent(Integer tokenDocumento);
}
