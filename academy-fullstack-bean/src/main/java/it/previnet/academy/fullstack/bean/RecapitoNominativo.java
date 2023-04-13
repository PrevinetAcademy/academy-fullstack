package it.previnet.academy.fullstack.bean;

import it.previnet.academy.fullstack.bean.enums.TipoRecapitoNominativo;

import java.time.LocalDateTime;

public class RecapitoNominativo {
    private Integer tokenRecapitoNominativo;
    private TipoRecapitoNominativo tipoRecapitoNominativo;
    private Integer tokenNominativo;
    private String denPresso;
    private String denNumeroCivico;
    private String codCap;
    private String denLocalita;
    private String codProvincia;
    private String codNazione;
    private String denIndirizzo;
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;
    private LocalDateTime dataTimestamp;
    private String denLogin;

    public Integer getTokenRecapitoNominativo() {
        return tokenRecapitoNominativo;
    }

    public void setTokenRecapitoNominativo(Integer tokenRecapitoNominativo) {
        this.tokenRecapitoNominativo = tokenRecapitoNominativo;
    }

    public TipoRecapitoNominativo getTipoRecapitoNominativo() {
        return tipoRecapitoNominativo;
    }

    public void setTipoRecapitoNominativo(TipoRecapitoNominativo tipoRecapitoNominativo) {
        this.tipoRecapitoNominativo = tipoRecapitoNominativo;
    }

    public Integer getTokenNominativo() {
        return tokenNominativo;
    }

    public void setTokenNominativo(Integer tokenNominativo) {
        this.tokenNominativo = tokenNominativo;
    }

    public String getDenPresso() {
        return denPresso;
    }

    public void setDenPresso(String denPresso) {
        this.denPresso = denPresso;
    }

    public String getDenNumeroCivico() {
        return denNumeroCivico;
    }

    public void setDenNumeroCivico(String denNumeroCivico) {
        this.denNumeroCivico = denNumeroCivico;
    }

    public String getCodCap() {
        return codCap;
    }

    public void setCodCap(String codCap) {
        this.codCap = codCap;
    }

    public String getDenLocalita() {
        return denLocalita;
    }

    public void setDenLocalita(String denLocalita) {
        this.denLocalita = denLocalita;
    }

    public String getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getCodNazione() {
        return codNazione;
    }

    public void setCodNazione(String codNazione) {
        this.codNazione = codNazione;
    }

    public String getDenIndirizzo() {
        return denIndirizzo;
    }

    public void setDenIndirizzo(String denIndirizzo) {
        this.denIndirizzo = denIndirizzo;
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
}
