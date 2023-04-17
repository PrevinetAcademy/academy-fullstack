package it.previnet.academy.fullstack.bean;

import it.previnet.academy.fullstack.bean.enums.TipoSesso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Nominativo {

    private Integer tokenNominativo;
    private String codFiscale;
    private String codPartitaIva;
    private String denCognome;
    private String denNome;
    private TipoSesso tipoSesso;
    private LocalDateTime dataNascita;
    private String codProvinciaIstatNascita;
    private String denComuneNascita;
    private String codNazioneCittadinanza;
    private String descProfessione;
    private String descTitolo;
    private String denNazionalita;
    private String denNominativo;
    private String denRagioneSociale;
    private String denRagioneSocialeBreve;
    private LocalDateTime dataTimestamp;
    private String denLogin;
    private String flagPrivacy;
    private String flagPrivacy2;
    private String flagPrivacy3;
    private String flagPrivacy4;
    private LocalDateTime dataFirmaPrivacy;
    private List<RecapitoNominativo> recapitoNominativo;
    private List<DocumentoIdentificazione> documentoIdentificazione;

    public Integer getTokenNominativo() {
        return tokenNominativo;
    }

    public void setTokenNominativo(Integer tokenNominativo) {
        this.tokenNominativo = tokenNominativo;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }

    public String getCodPartitaIva() {
        return codPartitaIva;
    }

    public void setCodPartitaIva(String codPartitaIva) {
        this.codPartitaIva = codPartitaIva;
    }

    public String getDenCognome() {
        return denCognome;
    }

    public void setDenCognome(String denCognome) {
        this.denCognome = denCognome;
    }

    public String getDenNome() {
        return denNome;
    }

    public void setDenNome(String denNome) {
        this.denNome = denNome;
    }

    public TipoSesso getTipoSesso() {
        return tipoSesso;
    }

    public void setTipoSesso(TipoSesso tipoSesso) {
        this.tipoSesso = tipoSesso;
    }

    public LocalDateTime getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDateTime dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getCodProvinciaIstatNascita() {
        return codProvinciaIstatNascita;
    }

    public void setCodProvinciaIstatNascita(String codProvinciaIstatNascita) {
        this.codProvinciaIstatNascita = codProvinciaIstatNascita;
    }

    public String getDenComuneNascita() {
        return denComuneNascita;
    }

    public void setDenComuneNascita(String denComuneNascita) {
        this.denComuneNascita = denComuneNascita;
    }

    public String getCodNazioneCittadinanza() {
        return codNazioneCittadinanza;
    }

    public void setCodNazioneCittadinanza(String codNazioneCittadinanza) {
        this.codNazioneCittadinanza = codNazioneCittadinanza;
    }

    public String getDescProfessione() {
        return descProfessione;
    }

    public void setDescProfessione(String descProfessione) {
        this.descProfessione = descProfessione;
    }

    public String getDescTitolo() {
        return descTitolo;
    }

    public void setDescTitolo(String descTitolo) {
        this.descTitolo = descTitolo;
    }

    public String getDenNazionalita() {
        return denNazionalita;
    }

    public void setDenNazionalita(String denNazionalita) {
        this.denNazionalita = denNazionalita;
    }

    public String getDenNominativo() {
        return denNominativo;
    }

    public void setDenNominativo(String denNominativo) {
        this.denNominativo = denNominativo;
    }

    public String getDenRagioneSociale() {
        return denRagioneSociale;
    }

    public void setDenRagioneSociale(String denRagioneSociale) {
        this.denRagioneSociale = denRagioneSociale;
    }

    public String getDenRagioneSocialeBreve() {
        return denRagioneSocialeBreve;
    }

    public void setDenRagioneSocialeBreve(String denRagioneSocialeBreve) {
        this.denRagioneSocialeBreve = denRagioneSocialeBreve;
    }

    public LocalDateTime getDataTimestamp() {
        return dataTimestamp;
    }

    public void setDataTimestamp(LocalDateTime dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }

    public String getDenLogin() {
        return denLogin;
    }

    public void setDenLogin(String denLogin) {
        this.denLogin = denLogin;
    }

    public String getFlagPrivacy() {
        return flagPrivacy;
    }

    public void setFlagPrivacy(String flagPrivacy) {
        this.flagPrivacy = flagPrivacy;
    }

    public String getFlagPrivacy2() {
        return flagPrivacy2;
    }

    public void setFlagPrivacy2(String flagPrivacy2) {
        this.flagPrivacy2 = flagPrivacy2;
    }

    public String getFlagPrivacy3() {
        return flagPrivacy3;
    }

    public void setFlagPrivacy3(String flagPrivacy3) {
        this.flagPrivacy3 = flagPrivacy3;
    }

    public String getFlagPrivacy4() {
        return flagPrivacy4;
    }

    public void setFlagPrivacy4(String flagPrivacy4) {
        this.flagPrivacy4 = flagPrivacy4;
    }

    public LocalDateTime getDataFirmaPrivacy() {
        return dataFirmaPrivacy;
    }

    public void setDataFirmaPrivacy(LocalDateTime dataFirmaPrivacy) {
        this.dataFirmaPrivacy = dataFirmaPrivacy;
    }

    public List<RecapitoNominativo> getRecapitoNominativo() {
        return recapitoNominativo;
    }

    public void setRecapitoNominativo(List<RecapitoNominativo> recapitoNominativo) {
        this.recapitoNominativo = recapitoNominativo;
    }

    public void addRecapitoNominativo(RecapitoNominativo recapitoNominativo) {
        if (this.recapitoNominativo == null) {
            this.recapitoNominativo = new ArrayList<>();
        }
        this.recapitoNominativo.add(recapitoNominativo);
    }

    public List<DocumentoIdentificazione> getDocumentoIdentificazione() {
        return documentoIdentificazione;
    }

    public void setDocumentoIdentificazione(List<DocumentoIdentificazione> documentoIdentificazione) {
        this.documentoIdentificazione = documentoIdentificazione;
    }

    public void addDocumentoIdentificazione(DocumentoIdentificazione documentoIdentificazione) {
        if (this.documentoIdentificazione == null) {
            this.documentoIdentificazione = new ArrayList<>();
        }
        this.documentoIdentificazione.add(documentoIdentificazione);
    }
}
