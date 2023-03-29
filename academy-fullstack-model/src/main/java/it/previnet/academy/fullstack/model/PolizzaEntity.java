package it.previnet.academy.fullstack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "polizza")
public class PolizzaEntity {

    @Id
    @SequenceGenerator(name = "tokenPolizzaGenerator", sequenceName = "polizza_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tokenPolizzaGenerator")
    @Column(name = "token_polizza", nullable = false)
    private Integer tokenPolizza;

    @Column(name = "tipo_premio", length = 1)
    private String tipoPremio;

    @Column(name = "num_polizza", length = 18)
    private String numPolizza;

    @Column(name = "ind_stato_polizza", length = 2)
    private String indStatoPolizza;

    @Column(name = "tipo_marketing", length = 1)
    private String tipoMarketing;

    @Column(name = "tipo_gestione_corrispondenza", length = 1)
    private String tipoGestioneCorrispondenza;

    @Column(name = "data_inizio")
    private LocalDateTime dataInizio;

    @Column(name = "data_fine")
    private LocalDateTime dataFine;

    @Column(name = "data_decorrenza_contratto")
    private LocalDateTime dataDecorrenzaContratto;

    @Column(name = "data_scadenza_contratto")
    private LocalDateTime dataScadenzaContratto;

    @Column(name = "tipo_rateazione", length = 2)
    private String tipoRateazione;

    @Column(name = "data_prima_ricorrenza")
    private LocalDateTime dataPrimaRicorrenza;

    @Column(name = "durata_polizza")
    private Integer durataPolizza;

    @Column(name = "desc_beneficiario_morte", length = 255)
    private String descBeneficiarioMorte;

    @Column(name = "desc_beneficiario_rendita", length = 255)
    private String descBeneficiarioRendita;

    @Column(name = "token_conto_corrente")
    private Integer tokenContoCorrente;

    @Column(name = "flag_assic_est_contraente", length = 1)
    private String flagAssicEstContraente;

    @Column(name = "flag_beneficiari_eredi_leg", length = 1)
    private String flagBeneficiariErediLeg;

    @Column(name = "cod_num_proposta", length = 30)
    private String codNumProposta;

    @Column(name = "data_annullo")
    private LocalDateTime dataAnnullo;

    @Column(name = "cod_convenzione_distr", length = 18)
    private String codConvenzioneDistr;

    @Column(name = "cod_fonte", length = 30)
    private String codFonte;

    @Column(name = "data_emissione")
    private LocalDateTime dataEmissione;

    @Column(name = "flag_dichiarazione_salute", length = 1)
    private String flagDichiarazioneSalute;

    @Column(name = "tipo_regime_fiscale", length = 2)
    private String tipoRegimeFiscale;

    @Column(name = "token_polizza_abbinata")
    private Integer tokenPolizzaAbbinata;

    @Column(name = "cod_cin", length = 3)
    private String codCin;

    @Column(name = "num_polizza_provenienza", length = 40)
    private String numPolizzaProvenienza;

    @Column(name = "flag_blocco", length = 1)
    private String flagBlocco;

    @Column(name = "token_collettiva")
    private Integer tokenCollettiva;

    @Column(name = "tipo_polizza", length = 2)
    private String tipoPolizza;

    @Column(name = "token_convenzione")
    private Integer tokenConvenzione;

    @Column(name = "tipo_elemento_polizza", length = 2)
    private String tipoElementoPolizza;

    @Column(name = "data_timestamp")
    private LocalDateTime dataTimestamp;

    @Column(name = "den_login", length = 80)
    private String denLogin;

    @Column(name = "data_adesione")
    private LocalDateTime dataAdesione;

    @Column(name = "tipo_delega", length = 2)
    private String tipoDelega;

    @Column(name = "perc_nostra_quota")
    private Double percNostraQuota;

    @Column(name = "num_polizza_delegataria", length = 20)
    private String numPolizzaDelegataria;

    @Column(name = "flag_tacito_rinnovo", length = 1)
    private String flagTacitoRinnovo;

    @Column(name = "flag_lps", length = 1)
    private String flagLps;

    @Column(name = "cod_centro_di_costo", length = 18)
    private String codCentroDiCosto;

    @Column(name = "flag_a_regolazione", length = 1)
    private String flagARegolazione;

    @Column(name = "flag_skip_riassicurazione", length = 1)
    private String flagSkipRiassicurazione;

    @Column(name = "gruppo_associato", length = 30)
    private String gruppoAssociato;

    @Column(name = "data_scadenza_prenotazione")
    private LocalDateTime dataScadenzaPrenotazione;

    @Column(name = "tipo_flusso_rapporti", length = 2)
    private String tipoFlussoRapporti;

    @Column(name = "data_variazione_stato")
    private LocalDateTime dataVariazioneStato;

    @Column(name = "num_polizza_collettiva", length = 20)
    private String numPolizzaCollettiva;

    @Column(name = "cod_ramo", length = 10)
    private String codRamo;

    @Column(name = "flag_proposta", length = 1)
    private String flagProposta;

    @Column(name = "token_schema_collettiva")
    private Integer tokenSchemaCollettiva;

    @Column(name = "desc_polizza", length = 255)
    private String descPolizza;

    @Column(name = "token_dossier_nominativo")
    private Integer tokenDossierNominativo;

    @Column(name = "ptf_origine", length = 20)
    private String ptfOrigine;

    @Column(name = "modalita_uw", length = 2)
    private String modalitaUw;

    @Column(name = "ind_stato_dormiente", length = 2)
    private String indStatoDormiente;

    @Column(name = "eventi_calamitosi", length = 80)
    private String eventiCalamitosi;

    @Column(name = "data_inserimento_partner")
    private LocalDateTime dataInserimentoPartner;

    @Column(name = "data_edizione_cga")
    private LocalDateTime dataEdizioneCga;

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

    public String getTipoMarketing() {
        return tipoMarketing;
    }

    public void setTipoMarketing(String tipoMarketing) {
        this.tipoMarketing = tipoMarketing;
    }

    public String getTipoGestioneCorrispondenza() {
        return tipoGestioneCorrispondenza;
    }

    public void setTipoGestioneCorrispondenza(String tipoGestioneCorrispondenza) {
        this.tipoGestioneCorrispondenza = tipoGestioneCorrispondenza;
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

    public LocalDateTime getDataPrimaRicorrenza() {
        return dataPrimaRicorrenza;
    }

    public void setDataPrimaRicorrenza(LocalDateTime dataPrimaRicorrenza) {
        this.dataPrimaRicorrenza = dataPrimaRicorrenza;
    }

    public Integer getDurataPolizza() {
        return durataPolizza;
    }

    public void setDurataPolizza(Integer durataPolizza) {
        this.durataPolizza = durataPolizza;
    }

    public String getDescBeneficiarioMorte() {
        return descBeneficiarioMorte;
    }

    public void setDescBeneficiarioMorte(String descBeneficiarioMorte) {
        this.descBeneficiarioMorte = descBeneficiarioMorte;
    }

    public String getDescBeneficiarioRendita() {
        return descBeneficiarioRendita;
    }

    public void setDescBeneficiarioRendita(String descBeneficiarioRendita) {
        this.descBeneficiarioRendita = descBeneficiarioRendita;
    }

    public Integer getTokenContoCorrente() {
        return tokenContoCorrente;
    }

    public void setTokenContoCorrente(Integer tokenContoCorrente) {
        this.tokenContoCorrente = tokenContoCorrente;
    }

    public String getFlagAssicEstContraente() {
        return flagAssicEstContraente;
    }

    public void setFlagAssicEstContraente(String flagAssicEstContraente) {
        this.flagAssicEstContraente = flagAssicEstContraente;
    }

    public String getFlagBeneficiariErediLeg() {
        return flagBeneficiariErediLeg;
    }

    public void setFlagBeneficiariErediLeg(String flagBeneficiariErediLeg) {
        this.flagBeneficiariErediLeg = flagBeneficiariErediLeg;
    }

    public String getCodNumProposta() {
        return codNumProposta;
    }

    public void setCodNumProposta(String codNumProposta) {
        this.codNumProposta = codNumProposta;
    }

    public LocalDateTime getDataAnnullo() {
        return dataAnnullo;
    }

    public void setDataAnnullo(LocalDateTime dataAnnullo) {
        this.dataAnnullo = dataAnnullo;
    }

    public String getCodConvenzioneDistr() {
        return codConvenzioneDistr;
    }

    public void setCodConvenzioneDistr(String codConvenzioneDistr) {
        this.codConvenzioneDistr = codConvenzioneDistr;
    }

    public String getCodFonte() {
        return codFonte;
    }

    public void setCodFonte(String codFonte) {
        this.codFonte = codFonte;
    }

    public LocalDateTime getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(LocalDateTime dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    public String getFlagDichiarazioneSalute() {
        return flagDichiarazioneSalute;
    }

    public void setFlagDichiarazioneSalute(String flagDichiarazioneSalute) {
        this.flagDichiarazioneSalute = flagDichiarazioneSalute;
    }

    public String getTipoRegimeFiscale() {
        return tipoRegimeFiscale;
    }

    public void setTipoRegimeFiscale(String tipoRegimeFiscale) {
        this.tipoRegimeFiscale = tipoRegimeFiscale;
    }

    public Integer getTokenPolizzaAbbinata() {
        return tokenPolizzaAbbinata;
    }

    public void setTokenPolizzaAbbinata(Integer tokenPolizzaAbbinata) {
        this.tokenPolizzaAbbinata = tokenPolizzaAbbinata;
    }

    public String getCodCin() {
        return codCin;
    }

    public void setCodCin(String codCin) {
        this.codCin = codCin;
    }

    public String getNumPolizzaProvenienza() {
        return numPolizzaProvenienza;
    }

    public void setNumPolizzaProvenienza(String numPolizzaProvenienza) {
        this.numPolizzaProvenienza = numPolizzaProvenienza;
    }

    public String getFlagBlocco() {
        return flagBlocco;
    }

    public void setFlagBlocco(String flagBlocco) {
        this.flagBlocco = flagBlocco;
    }

    public Integer getTokenCollettiva() {
        return tokenCollettiva;
    }

    public void setTokenCollettiva(Integer tokenCollettiva) {
        this.tokenCollettiva = tokenCollettiva;
    }

    public String getTipoPolizza() {
        return tipoPolizza;
    }

    public void setTipoPolizza(String tipoPolizza) {
        this.tipoPolizza = tipoPolizza;
    }

    public Integer getTokenConvenzione() {
        return tokenConvenzione;
    }

    public void setTokenConvenzione(Integer tokenConvenzione) {
        this.tokenConvenzione = tokenConvenzione;
    }

    public String getTipoElementoPolizza() {
        return tipoElementoPolizza;
    }

    public void setTipoElementoPolizza(String tipoElementoPolizza) {
        this.tipoElementoPolizza = tipoElementoPolizza;
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

    public LocalDateTime getDataAdesione() {
        return dataAdesione;
    }

    public void setDataAdesione(LocalDateTime dataAdesione) {
        this.dataAdesione = dataAdesione;
    }

    public String getTipoDelega() {
        return tipoDelega;
    }

    public void setTipoDelega(String tipoDelega) {
        this.tipoDelega = tipoDelega;
    }

    public Double getPercNostraQuota() {
        return percNostraQuota;
    }

    public void setPercNostraQuota(Double percNostraQuota) {
        this.percNostraQuota = percNostraQuota;
    }

    public String getNumPolizzaDelegataria() {
        return numPolizzaDelegataria;
    }

    public void setNumPolizzaDelegataria(String numPolizzaDelegataria) {
        this.numPolizzaDelegataria = numPolizzaDelegataria;
    }

    public String getFlagTacitoRinnovo() {
        return flagTacitoRinnovo;
    }

    public void setFlagTacitoRinnovo(String flagTacitoRinnovo) {
        this.flagTacitoRinnovo = flagTacitoRinnovo;
    }

    public String getFlagLps() {
        return flagLps;
    }

    public void setFlagLps(String flagLps) {
        this.flagLps = flagLps;
    }

    public String getCodCentroDiCosto() {
        return codCentroDiCosto;
    }

    public void setCodCentroDiCosto(String codCentroDiCosto) {
        this.codCentroDiCosto = codCentroDiCosto;
    }

    public String getFlagARegolazione() {
        return flagARegolazione;
    }

    public void setFlagARegolazione(String flagARegolazione) {
        this.flagARegolazione = flagARegolazione;
    }

    public String getFlagSkipRiassicurazione() {
        return flagSkipRiassicurazione;
    }

    public void setFlagSkipRiassicurazione(String flagSkipRiassicurazione) {
        this.flagSkipRiassicurazione = flagSkipRiassicurazione;
    }

    public String getGruppoAssociato() {
        return gruppoAssociato;
    }

    public void setGruppoAssociato(String gruppoAssociato) {
        this.gruppoAssociato = gruppoAssociato;
    }

    public LocalDateTime getDataScadenzaPrenotazione() {
        return dataScadenzaPrenotazione;
    }

    public void setDataScadenzaPrenotazione(LocalDateTime dataScadenzaPrenotazione) {
        this.dataScadenzaPrenotazione = dataScadenzaPrenotazione;
    }

    public String getTipoFlussoRapporti() {
        return tipoFlussoRapporti;
    }

    public void setTipoFlussoRapporti(String tipoFlussoRapporti) {
        this.tipoFlussoRapporti = tipoFlussoRapporti;
    }

    public LocalDateTime getDataVariazioneStato() {
        return dataVariazioneStato;
    }

    public void setDataVariazioneStato(LocalDateTime dataVariazioneStato) {
        this.dataVariazioneStato = dataVariazioneStato;
    }

    public String getNumPolizzaCollettiva() {
        return numPolizzaCollettiva;
    }

    public void setNumPolizzaCollettiva(String numPolizzaCollettiva) {
        this.numPolizzaCollettiva = numPolizzaCollettiva;
    }

    public String getCodRamo() {
        return codRamo;
    }

    public void setCodRamo(String codRamo) {
        this.codRamo = codRamo;
    }

    public String getFlagProposta() {
        return flagProposta;
    }

    public void setFlagProposta(String flagProposta) {
        this.flagProposta = flagProposta;
    }

    public Integer getTokenSchemaCollettiva() {
        return tokenSchemaCollettiva;
    }

    public void setTokenSchemaCollettiva(Integer tokenSchemaCollettiva) {
        this.tokenSchemaCollettiva = tokenSchemaCollettiva;
    }

    public String getDescPolizza() {
        return descPolizza;
    }

    public void setDescPolizza(String descPolizza) {
        this.descPolizza = descPolizza;
    }

    public Integer getTokenDossierNominativo() {
        return tokenDossierNominativo;
    }

    public void setTokenDossierNominativo(Integer tokenDossierNominativo) {
        this.tokenDossierNominativo = tokenDossierNominativo;
    }

    public String getPtfOrigine() {
        return ptfOrigine;
    }

    public void setPtfOrigine(String ptfOrigine) {
        this.ptfOrigine = ptfOrigine;
    }

    public String getModalitaUw() {
        return modalitaUw;
    }

    public void setModalitaUw(String modalitaUw) {
        this.modalitaUw = modalitaUw;
    }

    public String getIndStatoDormiente() {
        return indStatoDormiente;
    }

    public void setIndStatoDormiente(String indStatoDormiente) {
        this.indStatoDormiente = indStatoDormiente;
    }

    public String getEventiCalamitosi() {
        return eventiCalamitosi;
    }

    public void setEventiCalamitosi(String eventiCalamitosi) {
        this.eventiCalamitosi = eventiCalamitosi;
    }

    public LocalDateTime getDataInserimentoPartner() {
        return dataInserimentoPartner;
    }

    public void setDataInserimentoPartner(LocalDateTime dataInserimentoPartner) {
        this.dataInserimentoPartner = dataInserimentoPartner;
    }

    public LocalDateTime getDataEdizioneCga() {
        return dataEdizioneCga;
    }

    public void setDataEdizioneCga(LocalDateTime dataEdizioneCga) {
        this.dataEdizioneCga = dataEdizioneCga;
    }
}
