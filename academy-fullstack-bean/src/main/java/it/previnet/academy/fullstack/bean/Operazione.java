package it.previnet.academy.fullstack.bean;

import it.previnet.academy.fullstack.bean.enums.TipoOperazione;

import java.time.LocalDateTime;

public class Operazione {
    private Integer tokenOperazione;
    private String indStatoOperazione;
    private TipoOperazione tipoOperazione;
    private String tipoPagamento;
    private String codUtente;
    private LocalDateTime dataOperazione;
    private Double impCosto;
    private Double impTotale;
    private Double impImposta;
    private Double impPremioLordo;
    private String codNumOperazione;
    private LocalDateTime dataRichiesta;
    private String indStatoPagamento;
    private String codDivisa;
    private Double impPremioNetto;
    private LocalDateTime dataEffetto;
    private Double impCommissioneDistrib;
    private LocalDateTime dataContabile;
    private Double impSpese;
    private String codOperazione;
    private LocalDateTime dataArrivo;
    private LocalDateTime dataEsecuzione;
    private LocalDateTime dataRateazione;
    private LocalDateTime dataScadenza;
    private LocalDateTime dataPagamento;
    private Double percCaricamento;
    private Double percImposta;
    private Double percRendimento;
    private Double percRetrocessione;
    private LocalDateTime dataTimestamp;
    private String denLogin;

    public Integer getTokenOperazione() {
        return tokenOperazione;
    }

    public void setTokenOperazione(Integer tokenOperazione) {
        this.tokenOperazione = tokenOperazione;
    }

    public String getIndStatoOperazione() {
        return indStatoOperazione;
    }

    public void setIndStatoOperazione(String indStatoOperazione) {
        this.indStatoOperazione = indStatoOperazione;
    }

    public TipoOperazione getTipoOperazione() {
        return tipoOperazione;
    }

    public void setTipoOperazione(TipoOperazione tipoOperazione) {
        this.tipoOperazione = tipoOperazione;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getCodUtente() {
        return codUtente;
    }

    public void setCodUtente(String codUtente) {
        this.codUtente = codUtente;
    }

    public LocalDateTime getDataOperazione() {
        return dataOperazione;
    }

    public void setDataOperazione(LocalDateTime dataOperazione) {
        this.dataOperazione = dataOperazione;
    }

    public Double getImpCosto() {
        return impCosto;
    }

    public void setImpCosto(Double impCosto) {
        this.impCosto = impCosto;
    }

    public Double getImpTotale() {
        return impTotale;
    }

    public void setImpTotale(Double impTotale) {
        this.impTotale = impTotale;
    }

    public Double getImpImposta() {
        return impImposta;
    }

    public void setImpImposta(Double impImposta) {
        this.impImposta = impImposta;
    }

    public Double getImpPremioLordo() {
        return impPremioLordo;
    }

    public void setImpPremioLordo(Double impPremioLordo) {
        this.impPremioLordo = impPremioLordo;
    }

    public String getCodNumOperazione() {
        return codNumOperazione;
    }

    public void setCodNumOperazione(String codNumOperazione) {
        this.codNumOperazione = codNumOperazione;
    }

    public LocalDateTime getDataRichiesta() {
        return dataRichiesta;
    }

    public void setDataRichiesta(LocalDateTime dataRichiesta) {
        this.dataRichiesta = dataRichiesta;
    }

    public String getIndStatoPagamento() {
        return indStatoPagamento;
    }

    public void setIndStatoPagamento(String indStatoPagamento) {
        this.indStatoPagamento = indStatoPagamento;
    }

    public String getCodDivisa() {
        return codDivisa;
    }

    public void setCodDivisa(String codDivisa) {
        this.codDivisa = codDivisa;
    }

    public Double getImpPremioNetto() {
        return impPremioNetto;
    }

    public void setImpPremioNetto(Double impPremioNetto) {
        this.impPremioNetto = impPremioNetto;
    }

    public LocalDateTime getDataEffetto() {
        return dataEffetto;
    }

    public void setDataEffetto(LocalDateTime dataEffetto) {
        this.dataEffetto = dataEffetto;
    }

    public Double getImpCommissioneDistrib() {
        return impCommissioneDistrib;
    }

    public void setImpCommissioneDistrib(Double impCommissioneDistrib) {
        this.impCommissioneDistrib = impCommissioneDistrib;
    }

    public LocalDateTime getDataContabile() {
        return dataContabile;
    }

    public void setDataContabile(LocalDateTime dataContabile) {
        this.dataContabile = dataContabile;
    }

    public Double getImpSpese() {
        return impSpese;
    }

    public void setImpSpese(Double impSpese) {
        this.impSpese = impSpese;
    }

    public String getCodOperazione() {
        return codOperazione;
    }

    public void setCodOperazione(String codOperazione) {
        this.codOperazione = codOperazione;
    }

    public LocalDateTime getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(LocalDateTime dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public LocalDateTime getDataEsecuzione() {
        return dataEsecuzione;
    }

    public void setDataEsecuzione(LocalDateTime dataEsecuzione) {
        this.dataEsecuzione = dataEsecuzione;
    }

    public LocalDateTime getDataRateazione() {
        return dataRateazione;
    }

    public void setDataRateazione(LocalDateTime dataRateazione) {
        this.dataRateazione = dataRateazione;
    }

    public LocalDateTime getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(LocalDateTime dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getPercCaricamento() {
        return percCaricamento;
    }

    public void setPercCaricamento(Double percCaricamento) {
        this.percCaricamento = percCaricamento;
    }

    public Double getPercImposta() {
        return percImposta;
    }

    public void setPercImposta(Double percImposta) {
        this.percImposta = percImposta;
    }

    public Double getPercRendimento() {
        return percRendimento;
    }

    public void setPercRendimento(Double percRendimento) {
        this.percRendimento = percRendimento;
    }

    public Double getPercRetrocessione() {
        return percRetrocessione;
    }

    public void setPercRetrocessione(Double percRetrocessione) {
        this.percRetrocessione = percRetrocessione;
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
