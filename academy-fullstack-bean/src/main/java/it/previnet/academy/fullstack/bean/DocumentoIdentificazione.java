package it.previnet.academy.fullstack.bean;

import it.previnet.academy.fullstack.bean.enums.TipoDocumentoIdentificazione;

import java.time.LocalDateTime;

public class DocumentoIdentificazione {
    private Integer tokenDocumentoIdentificazion;
    private Integer tokenNominativo;
    private TipoDocumentoIdentificazione tipoDocumentoIdentificazione;
    private String codDocumentoIdentificazione;
    private LocalDateTime dataRilascio;
    private String denEnteRilascio;
    private String denLocalitaRilascio;
    private String codSiglaProvinciaRilascio;
    private String denTipoDocumento;
    private String codNazione;
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;
    private LocalDateTime dataTimestamp;
    private String denLogin;
    private LocalDateTime dataScadenza;
    private String codCabRilascio;
    private Integer tokenNominativoPolizza;
    private String barcode;
    private byte[] content;

    public Integer getTokenDocumentoIdentificazion() {
        return tokenDocumentoIdentificazion;
    }

    public void setTokenDocumentoIdentificazion(Integer tokenDocumentoIdentificazion) {
        this.tokenDocumentoIdentificazion = tokenDocumentoIdentificazion;
    }

    public Integer getTokenNominativo() {
        return tokenNominativo;
    }

    public void setTokenNominativo(Integer tokenNominativo) {
        this.tokenNominativo = tokenNominativo;
    }

    public TipoDocumentoIdentificazione getTipoDocumentoIdentificazione() {
        return tipoDocumentoIdentificazione;
    }

    public void setTipoDocumentoIdentificazione(TipoDocumentoIdentificazione tipoDocumentoIdentificazione) {
        this.tipoDocumentoIdentificazione = tipoDocumentoIdentificazione;
    }

    public String getCodDocumentoIdentificazione() {
        return codDocumentoIdentificazione;
    }

    public void setCodDocumentoIdentificazione(String codDocumentoIdentificazione) {
        this.codDocumentoIdentificazione = codDocumentoIdentificazione;
    }

    public LocalDateTime getDataRilascio() {
        return dataRilascio;
    }

    public void setDataRilascio(LocalDateTime dataRilascio) {
        this.dataRilascio = dataRilascio;
    }

    public String getDenEnteRilascio() {
        return denEnteRilascio;
    }

    public void setDenEnteRilascio(String denEnteRilascio) {
        this.denEnteRilascio = denEnteRilascio;
    }

    public String getDenLocalitaRilascio() {
        return denLocalitaRilascio;
    }

    public void setDenLocalitaRilascio(String denLocalitaRilascio) {
        this.denLocalitaRilascio = denLocalitaRilascio;
    }

    public String getCodSiglaProvinciaRilascio() {
        return codSiglaProvinciaRilascio;
    }

    public void setCodSiglaProvinciaRilascio(String codSiglaProvinciaRilascio) {
        this.codSiglaProvinciaRilascio = codSiglaProvinciaRilascio;
    }

    public String getDenTipoDocumento() {
        return denTipoDocumento;
    }

    public void setDenTipoDocumento(String denTipoDocumento) {
        this.denTipoDocumento = denTipoDocumento;
    }

    public String getCodNazione() {
        return codNazione;
    }

    public void setCodNazione(String codNazione) {
        this.codNazione = codNazione;
    }

    public LocalDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDateTime dataFine) {
        this.dataFine = dataFine;
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

    public LocalDateTime getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(LocalDateTime dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public String getCodCabRilascio() {
        return codCabRilascio;
    }

    public void setCodCabRilascio(String codCabRilascio) {
        this.codCabRilascio = codCabRilascio;
    }

    public Integer getTokenNominativoPolizza() {
        return tokenNominativoPolizza;
    }

    public void setTokenNominativoPolizza(Integer tokenNominativoPolizza) {
        this.tokenNominativoPolizza = tokenNominativoPolizza;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
