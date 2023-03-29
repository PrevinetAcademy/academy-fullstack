package it.previnet.academy.fullstack.bean;

import java.time.LocalDateTime;

public class Polizza {

    private Integer tokenPolizza;
    private String tipoPremio;
    private String numPolizza;
    private String indStatoPolizza;
    private LocalDateTime dataDecorrenzaContratto;
    private LocalDateTime dataScadenzaContratto;
    private String tipoRateazione;
    private String codNumProposta;
    private LocalDateTime dataEmissione;

    public Integer getTokenPolizza() {
        return tokenPolizza;
    }

    public void setTokenPolizza(Integer tokenPolizza) {
        this.tokenPolizza = tokenPolizza;
    }

    public String getTipoPremio() {
        return tipoPremio;
    }

    public void setTipoPremio(String tipoPremio) {
        this.tipoPremio = tipoPremio;
    }

    public String getNumPolizza() {
        return numPolizza;
    }

    public void setNumPolizza(String numPolizza) {
        this.numPolizza = numPolizza;
    }

    public String getIndStatoPolizza() {
        return indStatoPolizza;
    }

    public void setIndStatoPolizza(String indStatoPolizza) {
        this.indStatoPolizza = indStatoPolizza;
    }

    public LocalDateTime getDataDecorrenzaContratto() {
        return dataDecorrenzaContratto;
    }

    public void setDataDecorrenzaContratto(LocalDateTime dataDecorrenzaContratto) {
        this.dataDecorrenzaContratto = dataDecorrenzaContratto;
    }

    public LocalDateTime getDataScadenzaContratto() {
        return dataScadenzaContratto;
    }

    public void setDataScadenzaContratto(LocalDateTime dataScadenzaContratto) {
        this.dataScadenzaContratto = dataScadenzaContratto;
    }

    public String getTipoRateazione() {
        return tipoRateazione;
    }

    public void setTipoRateazione(String tipoRateazione) {
        this.tipoRateazione = tipoRateazione;
    }

    public String getCodNumProposta() {
        return codNumProposta;
    }

    public void setCodNumProposta(String codNumProposta) {
        this.codNumProposta = codNumProposta;
    }

    public LocalDateTime getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(LocalDateTime dataEmissione) {
        this.dataEmissione = dataEmissione;
    }
}