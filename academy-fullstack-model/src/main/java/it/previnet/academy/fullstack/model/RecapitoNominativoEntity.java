package it.previnet.academy.fullstack.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "recapito_nominativo")
public class RecapitoNominativoEntity {

    @Id
    @SequenceGenerator(name = "tokenRecapitoNominativoGenerator", sequenceName = "recapito_nominativo_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tokenRecapitoNominativoGenerator")
    @Column(name = "token_recapito_nominativo", nullable = false)
    private Integer tokenRecapitoNominativo;

    @Column(name = "tipo_recapito_nominativo", length = 3)
    private String tipoRecapitoNominativo;

    @Column(name = "den_presso", length = 80)
    private String denPresso;

    @Column(name = "tipo_prefisso_stradale", length = 3)
    private String tipoPrefissoStradale;

    @Column(name = "den_toponimo", length = 80)
    private String denToponimo;

    @Column(name = "den_numero_civico", length = 10)
    private String denNumeroCivico;

    @Column(name = "cod_cap", length = 5)
    private String codCap;

    @Column(name = "den_localita", length = 80)
    private String denLocalita;

    @Column(name = "cod_provincia_istat", length = 3)
    private String codProvinciaIstat;

    @Column(name = "cod_nazione", length = 3)
    private String codNazione;

    @Column(name = "den_indirizzo", length = 80)
    private String denIndirizzo;

    @Column(name = "cod_casella_postale", length = 10)
    private String codCasellaPostale;

    @Column(name = "den_etichetta", length = 255)
    private String denEtichetta;

    @Column(name = "data_inizio")
    private LocalDateTime dataInizio;

    @Column(name = "data_fine")
    private LocalDateTime dataFine;

    @Column(name = "cod_cab", length = 5)
    private String codCab;

    @Column(name = "cod_nazione_istat", length = 3)
    private String codNazioneIstat;

    @Column(name = "token_nominativo_polizza")
    private Integer tokenNominativoPolizza;

    @Column(name = "data_timestamp")
    private LocalDateTime dataTimestamp;

    @Column(name = "den_login", length = 80)
    private String denLogin;

    @Column(name = "flag_normaliz_residenza", length = 1)
    private String flagNormalizResidenza;

    @Column(name = "den_indirizzo_norm", length = 80)
    private String denIndirizzoNorm;

    @Column(name = "cod_cap_norm", length = 5)
    private String codCapNorm;

    @Column(name = "den_localita_norm", length = 80)
    private String denLocalitaNorm;

    @Column(name = "cod_provincia_norm", length = 2)
    private String codProvinciaNorm;

    @Column(name = "cod_nazione_norm", length = 3)
    private String codNazioneNorm;

    @Column(name = "latitudine")
    private Double latitudine;

    @Column(name = "longitudine")
    private Double longitudine;

    @Column(name = "den_numero_civico2", length = 10)
    private String denNumeroCivico2;

    @Column(name = "flag_no_com_benef_prima_evento", length = 1)
    private String flagNoComBenefPrimaEvento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "token_nominativo")
    private NominativoEntity nominativo;

    public Integer getTokenRecapitoNominativo() {
        return tokenRecapitoNominativo;
    }

    public void setTokenRecapitoNominativo(Integer tokenRecapitoNominativo) {
        this.tokenRecapitoNominativo = tokenRecapitoNominativo;
    }

    public String getTipoRecapitoNominativo() {
        return tipoRecapitoNominativo;
    }

    public void setTipoRecapitoNominativo(String tipoRecapitoNominativo) {
        this.tipoRecapitoNominativo = tipoRecapitoNominativo;
    }

    public String getDenPresso() {
        return denPresso;
    }

    public void setDenPresso(String denPresso) {
        this.denPresso = denPresso;
    }

    public String getTipoPrefissoStradale() {
        return tipoPrefissoStradale;
    }

    public void setTipoPrefissoStradale(String tipoPrefissoStradale) {
        this.tipoPrefissoStradale = tipoPrefissoStradale;
    }

    public String getDenToponimo() {
        return denToponimo;
    }

    public void setDenToponimo(String denToponimo) {
        this.denToponimo = denToponimo;
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

    public String getCodProvinciaIstat() {
        return codProvinciaIstat;
    }

    public void setCodProvinciaIstat(String codProvinciaIstat) {
        this.codProvinciaIstat = codProvinciaIstat;
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

    public String getCodCasellaPostale() {
        return codCasellaPostale;
    }

    public void setCodCasellaPostale(String codCasellaPostale) {
        this.codCasellaPostale = codCasellaPostale;
    }

    public String getDenEtichetta() {
        return denEtichetta;
    }

    public void setDenEtichetta(String denEtichetta) {
        this.denEtichetta = denEtichetta;
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

    public String getCodCab() {
        return codCab;
    }

    public void setCodCab(String codCab) {
        this.codCab = codCab;
    }

    public String getCodNazioneIstat() {
        return codNazioneIstat;
    }

    public void setCodNazioneIstat(String codNazioneIstat) {
        this.codNazioneIstat = codNazioneIstat;
    }

    public Integer getTokenNominativoPolizza() {
        return tokenNominativoPolizza;
    }

    public void setTokenNominativoPolizza(Integer tokenNominativoPolizza) {
        this.tokenNominativoPolizza = tokenNominativoPolizza;
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

    public String getFlagNormalizResidenza() {
        return flagNormalizResidenza;
    }

    public void setFlagNormalizResidenza(String flagNormalizResidenza) {
        this.flagNormalizResidenza = flagNormalizResidenza;
    }

    public String getDenIndirizzoNorm() {
        return denIndirizzoNorm;
    }

    public void setDenIndirizzoNorm(String denIndirizzoNorm) {
        this.denIndirizzoNorm = denIndirizzoNorm;
    }

    public String getCodCapNorm() {
        return codCapNorm;
    }

    public void setCodCapNorm(String codCapNorm) {
        this.codCapNorm = codCapNorm;
    }

    public String getDenLocalitaNorm() {
        return denLocalitaNorm;
    }

    public void setDenLocalitaNorm(String denLocalitaNorm) {
        this.denLocalitaNorm = denLocalitaNorm;
    }

    public String getCodProvinciaNorm() {
        return codProvinciaNorm;
    }

    public void setCodProvinciaNorm(String codProvinciaNorm) {
        this.codProvinciaNorm = codProvinciaNorm;
    }

    public String getCodNazioneNorm() {
        return codNazioneNorm;
    }

    public void setCodNazioneNorm(String codNazioneNorm) {
        this.codNazioneNorm = codNazioneNorm;
    }

    public Double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(Double latitudine) {
        this.latitudine = latitudine;
    }

    public Double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(Double longitudine) {
        this.longitudine = longitudine;
    }

    public String getDenNumeroCivico2() {
        return denNumeroCivico2;
    }

    public void setDenNumeroCivico2(String denNumeroCivico2) {
        this.denNumeroCivico2 = denNumeroCivico2;
    }

    public String getFlagNoComBenefPrimaEvento() {
        return flagNoComBenefPrimaEvento;
    }

    public void setFlagNoComBenefPrimaEvento(String flagNoComBenefPrimaEvento) {
        this.flagNoComBenefPrimaEvento = flagNoComBenefPrimaEvento;
    }

    public NominativoEntity getNominativo() {
        return nominativo;
    }

    public void setNominativo(NominativoEntity nominativo) {
        this.nominativo = nominativo;
    }
}
