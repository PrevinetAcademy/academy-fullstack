package it.previnet.academy.fullstack.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "operazione")
public class OperazioneEntity {
    @Id
    @SequenceGenerator(name = "tokenOperazioneGenerator", sequenceName = "operazione_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tokenOperazioneGenerator")
    @Column(name = "token_operazione", nullable = false)
    private Integer tokenOperazione;

    @Column(name = "ind_stato_operazione", length = 1)
    private String indStatoOperazione;

    @Column(name = "tipo_operazione", length = 2)
    private String tipoOperazione;

    @Column(name = "token_documento")
    private Integer tokenDocumento;

    @Column(name = "tipo_pagamento", length = 2)
    private String tipoPagamento;

    @Column(name = "cod_promotore", length = 18)
    private String codPromotore;

    @Column(name = "cod_utente", length = 80)
    private String codUtente;

    @Column(name = "data_operazione")
    private LocalDateTime dataOperazione;

    @Column(name = "imp_costo")
    private Double impCosto;

    @Column(name = "imp_totale")
    private Double impTotale;

    @Column(name = "imp_imposta")
    private Double impImposta;

    @Column(name = "imp_premio_lordo")
    private Double impPremioLordo;

    @Column(name = "cod_num_operazione", length = 5)
    private String codNumOperazione;

    @Column(name = "data_richiesta")
    private LocalDateTime dataRichiesta;

    @Column(name = "cod_num_registro", length = 18)
    private String codNumRegistro;

    @Column(name = "ind_stato_pagamento", length = 1)
    private String indStatoPagamento;

    @Column(name = "ind_stato_firma", length = 1)
    private String indStatoFirma;

    @Column(name = "imp_prestazione_assicurata")
    private Double impPrestazioneAssicurata;

    @Column(name = "cod_abi_promotore", length = 5)
    private String codAbiPromotore;

    @Column(name = "cod_cab_promotore", length = 5)
    private String codCabPromotore;

    @Column(name = "perc_prestazione_cm")
    private Double percPrestazioneCm;

    @Column(name = "cod_divisa", length = 3)
    private String codDivisa;

    @Column(name = "imp_premio_netto")
    private Double impPremioNetto;

    @Column(name = "imp_premio_equiv")
    private Double impPremioEquiv;

    @Column(name = "imp_premio_netto_equiv")
    private Double impPremioNettoEquiv;

    @Column(name = "imp_imposta_equiv")
    private Double impImpostaEquiv;

    @Column(name = "data_effetto")
    private LocalDateTime dataEffetto;

    @Column(name = "imp_commissione_distrib")
    private Double impCommissioneDistrib;

    @Column(name = "ind_stato_contabile", length = 2)
    private String indStatoContabile;

    @Column(name = "num_operazione")
    private Integer numOperazione;

    @Column(name = "data_contabile")
    private LocalDateTime dataContabile;

    @Column(name = "imp_spese")
    private Double impSpese;

    @Column(name = "cod_num_oggetto", length = 30)
    private String codNumOggetto;

    @Column(name = "num_quote_prov")
    private Integer numQuoteProv;

    @Column(name = "imp_imposta_spese")
    private Double impImpostaSpese;

    @Column(name = "data_denuncia")
    private LocalDateTime dataDenuncia;

    @Column(name = "data_sinistro")
    private LocalDateTime dataSinistro;

    @Column(name = "cod_agenzia", length = 18)
    private String codAgenzia;

    @Column(name = "data_invio")
    private LocalDateTime dataInvio;

    @Column(name = "imp_costo_equiv")
    private Double impCostoEquiv;

    @Column(name = "token_operazione_rif")
    private Integer tokenOperazioneRif;

    @Column(name = "imp_detr_fisc")
    private Double impDetrFisc;

    @Column(name = "imp_detr_fisc_equiv")
    private Double impDetrFiscEquiv;

    @Column(name = "imp_correzione")
    private Double impCorrezione;

    @Column(name = "imp_correzione_equiv")
    private Double impCorrezioneEquiv;

    @Column(name = "den_produttore", length = 80)
    private String denProduttore;

    @Column(name = "imp_prest_assic_a")
    private Double impPrestAssicA;

    @Column(name = "imp_prest_assic_b")
    private Double impPrestAssicB;

    @Column(name = "imp_premio_budget")
    private Double impPremioBudget;

    @Column(name = "imp_commissione_comp")
    private Double impCommissioneComp;

    @Column(name = "imp_impon_irpef")
    private Double impImponIrpef;

    @Column(name = "imp_impon_imposte")
    private Double impImponImposte;

    @Column(name = "imp_impon_irpef_equiv")
    private Double impImponIrpefEquiv;

    @Column(name = "imp_impon_imposte_equiv")
    private Double impImponImposteEquiv;

    @Column(name = "cod_operazione", length = 30)
    private String codOperazione;

    @Column(name = "data_arrivo")
    private LocalDateTime dataArrivo;

    @Column(name = "data_esecuzione")
    private LocalDateTime dataEsecuzione;

    @Column(name = "data_rateazione")
    private LocalDateTime dataRateazione;

    @Column(name = "num_rate_coperte")
    private Integer numRateCoperte;

    @Column(name = "imp_diritti")
    private Double impDiritti;

    @Column(name = "cod_num_abbinamento", length = 10)
    private String codNumAbbinamento;

    @Column(name = "cod_num_proposta", length = 10)
    private String codNumProposta;

    @Column(name = "data_invio_liq")
    private LocalDateTime dataInvioLiq;

    @Column(name = "tipo_opzione", length = 2)
    private String tipoOpzione;

    @Column(name = "cod_num_obbligazione", length = 18)
    private String codNumObbligazione;

    @Column(name = "imp_obbligazione")
    private Double impObbligazione;

    @Column(name = "imp_garanzia")
    private Double impGaranzia;

    @Column(name = "imp_imposta_garanzia")
    private Double impImpostaGaranzia;

    @Column(name = "data_scadenza")
    private LocalDateTime dataScadenza;

    @Column(name = "data_pagamento")
    private LocalDateTime dataPagamento;

    @Column(name = "imp_costo_visita_medica")
    private Double impCostoVisitaMedica;

    @Column(name = "token_operazione_abbinata")
    private Integer tokenOperazioneAbbinata;

    @Column(name = "perc_premio_rischio")
    private Double percPremioRischio;

    @Column(name = "imp_premio_rischio")
    private Double impPremioRischio;

    @Column(name = "imp_premio_rischio_equiv")
    private Double impPremioRischioEquiv;

    @Column(name = "imp_premio_puro")
    private Double impPremioPuro;

    @Column(name = "num_ripresentazioni")
    private String numRipresentazioni;

    @Column(name = "imp_interessi")
    private Double impInteressi;

    @Column(name = "imp_imposta_interessi")
    private Double impImpostaInteressi;

    @Column(name = "num_gg_interessi")
    private Integer numGgInteressi;

    @Column(name = "perc_caricamento")
    private Double percCaricamento;

    @Column(name = "perc_imposta")
    private Double percImposta;

    @Column(name = "perc_rendimento")
    private Double percRendimento;

    @Column(name = "perc_retrocessione")
    private Double percRetrocessione;

    @Column(name = "cod_convenzione", length = 18)
    private String codConvenzione;

    @Column(name = "data_storno")
    private LocalDateTime dataStorno;

    @Column(name = "data_eff_incasso")
    private LocalDateTime dataEffIncasso;

    @Column(name = "data_eff_emissione")
    private LocalDateTime dataEffEmissione;

    @Column(name = "data_eff_storno")
    private LocalDateTime dataEffStorno;

    @Column(name = "token_abbinamento_ric")
    private Integer tokenAbbinamentoRic;

    @Column(name = "tipo_causa_sinistro", length = 2)
    private String tipoCausaSinistro;

    @Column(name = "imp_plus_valenza")
    private Double impPlusValenza;

    @Column(name = "imp_riserva")
    private Double impRiserva;

    @Column(name = "imp_bonus")
    private Double impBonus;

    @Column(name = "tipo_esitazione", length = 2)
    private String tipoEsitazione;

    @Column(name = "data_esitazione")
    private LocalDateTime dataEsitazione;

    @Column(name = "ind_stato_controllo", length = 2)
    private String indStatoControllo;

    @Column(name = "data_controllo")
    private LocalDateTime dataControllo;

    @Column(name = "data_decorrenza")
    private LocalDateTime dataDecorrenza;

    @Column(name = "imp_commiss_inc_comp")
    private Double impCommissIncComp;

    @Column(name = "imp_commiss_inc_distrib")
    private Double impCommissIncDistrib;

    @Column(name = "imp_premio_netto_riv")
    private Double impPremioNettoRiv;

    @Column(name = "tipo_dossier", length = 2)
    private String tipoDossier;

    @Column(name = "tipo_assistenza", length = 2)
    private String tipoAssistenza;

    @Column(name = "ind_stato_sinistro", length = 2)
    private String indStatoSinistro;

    @Column(name = "cod_opzione", length = 30)
    private String codOpzione;

    @Column(name = "data_eff_esitazione")
    private LocalDateTime dataEffEsitazione;

    @Column(name = "data_scarico_emissione")
    private LocalDateTime dataScaricoEmissione;

    @Column(name = "data_scarico_esitazione")
    private LocalDateTime dataScaricoEsitazione;

    @Column(name = "data_scarico_storno")
    private LocalDateTime dataScaricoStorno;

    @Column(name = "data_scarico_incasso")
    private LocalDateTime dataScaricoIncasso;

    @Column(name = "imp_accessori")
    private Double impAccessori;

    @Column(name = "imp_imposta_visentini")
    private Double impImpostaVisentini;

    @Column(name = "imp_imposta_sostitutiva")
    private Double impImpostaSostitutiva;

    @Column(name = "imp_imponibile_imp_visentini")
    private Double impImponibileImpVisentini;

    @Column(name = "imp_imponibile_imp_sostitutiva")
    private Double impImponibileImpSostitutiva;

    @Column(name = "imp_sovrappremio_spo")
    private Double impSovrappremioSpo;

    @Column(name = "imp_sovrappremio_san")
    private Double impSovrappremioSan;

    @Column(name = "imp_sovrappremio_pro")
    private Double impSovrappremioPro;

    @Column(name = "flag_foglio_cassa", length = 1)
    private String flagFoglioCassa;

    @Column(name = "tipo_motivo_storno", length = 2)
    private String tipoMotivoStorno;

    @Column(name = "desc_note_variazione", length = 255)
    private String descNoteVariazione;

    @Column(name = "data_timestamp")
    private LocalDateTime dataTimestamp;

    @Column(name = "den_login", length = 80)
    private String denLogin;

    @Column(name = "cod_subagente", length = 18)
    private String codSubagente;

    @Column(name = "den_localita_firma", length = 80)
    private String denLocalitaFirma;

    @Column(name = "imp_interessi_frazionamento")
    private Double impInteressiFrazionamento;

    @Column(name = "imp_cap_rendita")
    private Double impCapRendita;

    @Column(name = "imp_cap_min_scad")
    private Double impCapMinScad;

    @Column(name = "imp_rend_min_scad")
    private Double impRendMinScad;

    @Column(name = "perc_applicata")
    private Double percApplicata;

    @Column(name = "cod_agenzia_2", length = 18)
    private String codAgenzia_2;

    @Column(name = "imp_commissione_distrib_2")
    private Double impCommissioneDistrib_2;

    @Column(name = "imp_imposta_antiracket")
    private Double impImpostaAntiracket;

    @Column(name = "imp_imposta_aggiuntiva")
    private Double impImpostaAggiuntiva;

    @Column(name = "data_eff_emissione_tecnica")
    private LocalDateTime dataEffEmissioneTecnica;

    @Column(name = "data_scarico_emissione_tecnica")
    private LocalDateTime dataScaricoEmissioneTecnica;

    @Column(name = "cod_divisa_equiv", length = 3)
    private String codDivisaEquiv;

    @Column(name = "imp_danni_cose")
    private Double impDanniCose;

    @Column(name = "imp_danni_persone")
    private Double impDanniPersone;

    @Column(name = "imp_spese_dirette")
    private Double impSpeseDirette;

    @Column(name = "imp_spese_liquidazione")
    private Double impSpeseLiquidazione;

    @Column(name = "num_ordine")
    private Integer numOrdine;

    @Column(name = "token_operazione_rif2")
    private Integer tokenOperazioneRif2;

    @Column(name = "ind_stato_ctrl_liste", length = 2)
    private String indStatoCtrlListe;

    @Column(name = "data_comp_antiriciclaggio")
    private LocalDateTime dataCompAntiriciclaggio;

    @Column(name = "data_comp_antiriciclaggio2")
    private LocalDateTime dataCompAntiriciclaggio2;

    @Column(name = "data_comp_provvigioni")
    private LocalDateTime dataCompProvvigioni;

    @Column(name = "data_compl_req_comm")
    private LocalDateTime dataComplReqComm;

    @Column(name = "imp_spese_legali")
    private Double impSpeseLegali;

    @Column(name = "dummy01")
    private Double dummy01;

    @Column(name = "data_cessazione")
    private LocalDateTime dataCessazione;

    @Column(name = "tipo_opzione_tassazione_k3", length = 1)
    private String tipoOpzioneTassazioneK3;

    @Column(name = "perc_capitale")
    private Double percCapitale;

    @Column(name = "token_nominativo")
    private Integer tokenNominativo;

    @Column(name = "tipo_motivo_uscita", length = 2)
    private String tipoMotivoUscita;

    @Column(name = "imp_comm_delega")
    private Double impCommDelega;

    @Column(name = "ind_stato_profilo", length = 2)
    private String indStatoProfilo;

    @Column(name = "imp_spese_liq_int")
    private Double impSpeseLiqInt;

    @Column(name = "imp_ritenuta")
    private Double impRitenuta;

    @Column(name = "data_val_sovrappremi")
    private LocalDateTime dataValSovrappremi;

    @Column(name = "perc_sconto")
    private Double percSconto;

    @Column(name = "imp_imposta_bollo")
    private Double impImpostaBollo;

    @Column(name = "imp_riserva_equiv")
    private Double impRiservaEquiv;

    @Column(name = "imp_danni_cose_equiv")
    private Double impDanniCoseEquiv;

    @Column(name = "imp_danni_persone_equiv")
    private Double impDanniPersoneEquiv;

    @Column(name = "data_cambio_divisa_equiv")
    private LocalDateTime dataCambioDivisaEquiv;

    @Column(name = "tasso_cambio_divisa_equiv")
    private Double tassoCambioDivisaEquiv;

    @Column(name = "sottotipo_operazione", length = 30)
    private String sottotipoOperazione;

    @Column(name = "imp_sovrappremio_acma")
    private Double impSovrappremioAcma;

    @Column(name = "imp_accessori_1")
    private Double impAccessori_1;

    @Column(name = "imp_accessori_2")
    private Double impAccessori_2;

    @Column(name = "imp_totale_usd")
    private Double impTotaleUsd;

    @Column(name = "cod_nominativo", length = 20)
    private String codNominativo;

    @Column(name = "imp_commissioni_gestore")
    private Double impCommissioniGestore;

    @Column(name = "perc_richio_tarato")
    private Double percRichioTarato;

    @Column(name = "token_operazione_abbinata2")
    private Integer tokenOperazioneAbbinata2;

    @Column(name = "imp_costo_est_partner")
    private Double impCostoEstPartner;

    @Column(name = "imp_costo_est_comp")
    private Double impCostoEstComp;

    @Column(name = "imp_costo_emis_partner")
    private Double impCostoEmisPartner;

    @Column(name = "imp_costo_emis_comp")
    private Double impCostoEmisComp;

    @Column(name = "fraz_capitale")
    private Double frazCapitale;

    @Column(name = "token_regola_incasso")
    private Integer tokenRegolaIncasso;

    @Column(name = "cod_subagente2", length = 20)
    private String codSubagente2;

    @Column(name = "cod_subagente3", length = 20)
    private String codSubagente3;

    @Column(name = "imp_imposta_bollo_equiv")
    private Double impImpostaBolloEquiv;

    @Column(name = "imp_riserva_caduta")
    private Double impRiservaCaduta;

    @Column(name = "imp_riferimento")
    private Double impRiferimento;

    @Column(name = "imp_riferimento_min")
    private Double impRiferimentoMin;

    @Column(name = "imp_riferimento_max")
    private Double impRiferimentoMax;

    @Column(name = "token_regola_incasso_c1")
    private Integer tokenRegolaIncassoC1;

    @Column(name = "cod_gestione_agenzia", length = 20)
    private String codGestioneAgenzia;

    @Column(name = "cod_filiale", length = 20)
    private String codFiliale;

    @Column(name = "flag_tcm", length = 20)
    private String flagTcm;

    @Column(name = "perc_cm")
    private Double percCm;

    @Column(name = "perc_cm_mfee")
    private Double percCmMfee;

    @Column(name = "perc_capitale_protetto")
    private Double percCapitaleProtetto;

    @Column(name = "perc_nav_protetto")
    private Double percNavProtetto;

    @Column(name = "ptf_origine", length = 20)
    private String ptfOrigine;

    @Column(name = "uuid_operazione", length = 80)
    private String uuidOperazione;

    @Column(name = "cod_transazione_epay", length = 80)
    private String codTransazioneEpay;

    @Column(name = "cod_carta_ricorr_epay", length = 80)
    private String codCartaRicorrEpay;

    @Column(name = "imp_imponib_benef_fisc_2007")
    private Double impImponibBenefFisc_2007;

    @Column(name = "flag_doc_sinistro", length = 1)
    private String flagDocSinistro;

    @Column(name = "imp_imposta_bollo_speciale")
    private Double impImpostaBolloSpeciale;

    @Column(name = "data_inizio_motivo_uscita")
    private LocalDateTime dataInizioMotivoUscita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "token_polizza")
    private PolizzaEntity polizza;

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

    public String getTipoOperazione() {
        return tipoOperazione;
    }

    public void setTipoOperazione(String tipoOperazione) {
        this.tipoOperazione = tipoOperazione;
    }

    public Integer getTokenDocumento() {
        return tokenDocumento;
    }

    public void setTokenDocumento(Integer tokenDocumento) {
        this.tokenDocumento = tokenDocumento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getCodPromotore() {
        return codPromotore;
    }

    public void setCodPromotore(String codPromotore) {
        this.codPromotore = codPromotore;
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

    public String getCodNumRegistro() {
        return codNumRegistro;
    }

    public void setCodNumRegistro(String codNumRegistro) {
        this.codNumRegistro = codNumRegistro;
    }

    public String getIndStatoPagamento() {
        return indStatoPagamento;
    }

    public void setIndStatoPagamento(String indStatoPagamento) {
        this.indStatoPagamento = indStatoPagamento;
    }

    public String getIndStatoFirma() {
        return indStatoFirma;
    }

    public void setIndStatoFirma(String indStatoFirma) {
        this.indStatoFirma = indStatoFirma;
    }

    public Double getImpPrestazioneAssicurata() {
        return impPrestazioneAssicurata;
    }

    public void setImpPrestazioneAssicurata(Double impPrestazioneAssicurata) {
        this.impPrestazioneAssicurata = impPrestazioneAssicurata;
    }

    public String getCodAbiPromotore() {
        return codAbiPromotore;
    }

    public void setCodAbiPromotore(String codAbiPromotore) {
        this.codAbiPromotore = codAbiPromotore;
    }

    public String getCodCabPromotore() {
        return codCabPromotore;
    }

    public void setCodCabPromotore(String codCabPromotore) {
        this.codCabPromotore = codCabPromotore;
    }

    public Double getPercPrestazioneCm() {
        return percPrestazioneCm;
    }

    public void setPercPrestazioneCm(Double percPrestazioneCm) {
        this.percPrestazioneCm = percPrestazioneCm;
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

    public Double getImpPremioEquiv() {
        return impPremioEquiv;
    }

    public void setImpPremioEquiv(Double impPremioEquiv) {
        this.impPremioEquiv = impPremioEquiv;
    }

    public Double getImpPremioNettoEquiv() {
        return impPremioNettoEquiv;
    }

    public void setImpPremioNettoEquiv(Double impPremioNettoEquiv) {
        this.impPremioNettoEquiv = impPremioNettoEquiv;
    }

    public Double getImpImpostaEquiv() {
        return impImpostaEquiv;
    }

    public void setImpImpostaEquiv(Double impImpostaEquiv) {
        this.impImpostaEquiv = impImpostaEquiv;
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

    public String getIndStatoContabile() {
        return indStatoContabile;
    }

    public void setIndStatoContabile(String indStatoContabile) {
        this.indStatoContabile = indStatoContabile;
    }

    public Integer getNumOperazione() {
        return numOperazione;
    }

    public void setNumOperazione(Integer numOperazione) {
        this.numOperazione = numOperazione;
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

    public String getCodNumOggetto() {
        return codNumOggetto;
    }

    public void setCodNumOggetto(String codNumOggetto) {
        this.codNumOggetto = codNumOggetto;
    }

    public Integer getNumQuoteProv() {
        return numQuoteProv;
    }

    public void setNumQuoteProv(Integer numQuoteProv) {
        this.numQuoteProv = numQuoteProv;
    }

    public Double getImpImpostaSpese() {
        return impImpostaSpese;
    }

    public void setImpImpostaSpese(Double impImpostaSpese) {
        this.impImpostaSpese = impImpostaSpese;
    }

    public LocalDateTime getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(LocalDateTime dataDenuncia) {
        this.dataDenuncia = dataDenuncia;
    }

    public LocalDateTime getDataSinistro() {
        return dataSinistro;
    }

    public void setDataSinistro(LocalDateTime dataSinistro) {
        this.dataSinistro = dataSinistro;
    }

    public String getCodAgenzia() {
        return codAgenzia;
    }

    public void setCodAgenzia(String codAgenzia) {
        this.codAgenzia = codAgenzia;
    }

    public LocalDateTime getDataInvio() {
        return dataInvio;
    }

    public void setDataInvio(LocalDateTime dataInvio) {
        this.dataInvio = dataInvio;
    }

    public Double getImpCostoEquiv() {
        return impCostoEquiv;
    }

    public void setImpCostoEquiv(Double impCostoEquiv) {
        this.impCostoEquiv = impCostoEquiv;
    }

    public Integer getTokenOperazioneRif() {
        return tokenOperazioneRif;
    }

    public void setTokenOperazioneRif(Integer tokenOperazioneRif) {
        this.tokenOperazioneRif = tokenOperazioneRif;
    }

    public Double getImpDetrFisc() {
        return impDetrFisc;
    }

    public void setImpDetrFisc(Double impDetrFisc) {
        this.impDetrFisc = impDetrFisc;
    }

    public Double getImpDetrFiscEquiv() {
        return impDetrFiscEquiv;
    }

    public void setImpDetrFiscEquiv(Double impDetrFiscEquiv) {
        this.impDetrFiscEquiv = impDetrFiscEquiv;
    }

    public Double getImpCorrezione() {
        return impCorrezione;
    }

    public void setImpCorrezione(Double impCorrezione) {
        this.impCorrezione = impCorrezione;
    }

    public Double getImpCorrezioneEquiv() {
        return impCorrezioneEquiv;
    }

    public void setImpCorrezioneEquiv(Double impCorrezioneEquiv) {
        this.impCorrezioneEquiv = impCorrezioneEquiv;
    }

    public String getDenProduttore() {
        return denProduttore;
    }

    public void setDenProduttore(String denProduttore) {
        this.denProduttore = denProduttore;
    }

    public Double getImpPrestAssicA() {
        return impPrestAssicA;
    }

    public void setImpPrestAssicA(Double impPrestAssicA) {
        this.impPrestAssicA = impPrestAssicA;
    }

    public Double getImpPrestAssicB() {
        return impPrestAssicB;
    }

    public void setImpPrestAssicB(Double impPrestAssicB) {
        this.impPrestAssicB = impPrestAssicB;
    }

    public Double getImpPremioBudget() {
        return impPremioBudget;
    }

    public void setImpPremioBudget(Double impPremioBudget) {
        this.impPremioBudget = impPremioBudget;
    }

    public Double getImpCommissioneComp() {
        return impCommissioneComp;
    }

    public void setImpCommissioneComp(Double impCommissioneComp) {
        this.impCommissioneComp = impCommissioneComp;
    }

    public Double getImpImponIrpef() {
        return impImponIrpef;
    }

    public void setImpImponIrpef(Double impImponIrpef) {
        this.impImponIrpef = impImponIrpef;
    }

    public Double getImpImponImposte() {
        return impImponImposte;
    }

    public void setImpImponImposte(Double impImponImposte) {
        this.impImponImposte = impImponImposte;
    }

    public Double getImpImponIrpefEquiv() {
        return impImponIrpefEquiv;
    }

    public void setImpImponIrpefEquiv(Double impImponIrpefEquiv) {
        this.impImponIrpefEquiv = impImponIrpefEquiv;
    }

    public Double getImpImponImposteEquiv() {
        return impImponImposteEquiv;
    }

    public void setImpImponImposteEquiv(Double impImponImposteEquiv) {
        this.impImponImposteEquiv = impImponImposteEquiv;
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

    public Integer getNumRateCoperte() {
        return numRateCoperte;
    }

    public void setNumRateCoperte(Integer numRateCoperte) {
        this.numRateCoperte = numRateCoperte;
    }

    public Double getImpDiritti() {
        return impDiritti;
    }

    public void setImpDiritti(Double impDiritti) {
        this.impDiritti = impDiritti;
    }

    public String getCodNumAbbinamento() {
        return codNumAbbinamento;
    }

    public void setCodNumAbbinamento(String codNumAbbinamento) {
        this.codNumAbbinamento = codNumAbbinamento;
    }

    public String getCodNumProposta() {
        return codNumProposta;
    }

    public void setCodNumProposta(String codNumProposta) {
        this.codNumProposta = codNumProposta;
    }

    public LocalDateTime getDataInvioLiq() {
        return dataInvioLiq;
    }

    public void setDataInvioLiq(LocalDateTime dataInvioLiq) {
        this.dataInvioLiq = dataInvioLiq;
    }

    public String getTipoOpzione() {
        return tipoOpzione;
    }

    public void setTipoOpzione(String tipoOpzione) {
        this.tipoOpzione = tipoOpzione;
    }

    public String getCodNumObbligazione() {
        return codNumObbligazione;
    }

    public void setCodNumObbligazione(String codNumObbligazione) {
        this.codNumObbligazione = codNumObbligazione;
    }

    public Double getImpObbligazione() {
        return impObbligazione;
    }

    public void setImpObbligazione(Double impObbligazione) {
        this.impObbligazione = impObbligazione;
    }

    public Double getImpGaranzia() {
        return impGaranzia;
    }

    public void setImpGaranzia(Double impGaranzia) {
        this.impGaranzia = impGaranzia;
    }

    public Double getImpImpostaGaranzia() {
        return impImpostaGaranzia;
    }

    public void setImpImpostaGaranzia(Double impImpostaGaranzia) {
        this.impImpostaGaranzia = impImpostaGaranzia;
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

    public Double getImpCostoVisitaMedica() {
        return impCostoVisitaMedica;
    }

    public void setImpCostoVisitaMedica(Double impCostoVisitaMedica) {
        this.impCostoVisitaMedica = impCostoVisitaMedica;
    }

    public Integer getTokenOperazioneAbbinata() {
        return tokenOperazioneAbbinata;
    }

    public void setTokenOperazioneAbbinata(Integer tokenOperazioneAbbinata) {
        this.tokenOperazioneAbbinata = tokenOperazioneAbbinata;
    }

    public Double getPercPremioRischio() {
        return percPremioRischio;
    }

    public void setPercPremioRischio(Double percPremioRischio) {
        this.percPremioRischio = percPremioRischio;
    }

    public Double getImpPremioRischio() {
        return impPremioRischio;
    }

    public void setImpPremioRischio(Double impPremioRischio) {
        this.impPremioRischio = impPremioRischio;
    }

    public Double getImpPremioRischioEquiv() {
        return impPremioRischioEquiv;
    }

    public void setImpPremioRischioEquiv(Double impPremioRischioEquiv) {
        this.impPremioRischioEquiv = impPremioRischioEquiv;
    }

    public Double getImpPremioPuro() {
        return impPremioPuro;
    }

    public void setImpPremioPuro(Double impPremioPuro) {
        this.impPremioPuro = impPremioPuro;
    }

    public String getNumRipresentazioni() {
        return numRipresentazioni;
    }

    public void setNumRipresentazioni(String numRipresentazioni) {
        this.numRipresentazioni = numRipresentazioni;
    }

    public Double getImpInteressi() {
        return impInteressi;
    }

    public void setImpInteressi(Double impInteressi) {
        this.impInteressi = impInteressi;
    }

    public Double getImpImpostaInteressi() {
        return impImpostaInteressi;
    }

    public void setImpImpostaInteressi(Double impImpostaInteressi) {
        this.impImpostaInteressi = impImpostaInteressi;
    }

    public Integer getNumGgInteressi() {
        return numGgInteressi;
    }

    public void setNumGgInteressi(Integer numGgInteressi) {
        this.numGgInteressi = numGgInteressi;
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

    public String getCodConvenzione() {
        return codConvenzione;
    }

    public void setCodConvenzione(String codConvenzione) {
        this.codConvenzione = codConvenzione;
    }

    public LocalDateTime getDataStorno() {
        return dataStorno;
    }

    public void setDataStorno(LocalDateTime dataStorno) {
        this.dataStorno = dataStorno;
    }

    public LocalDateTime getDataEffIncasso() {
        return dataEffIncasso;
    }

    public void setDataEffIncasso(LocalDateTime dataEffIncasso) {
        this.dataEffIncasso = dataEffIncasso;
    }

    public LocalDateTime getDataEffEmissione() {
        return dataEffEmissione;
    }

    public void setDataEffEmissione(LocalDateTime dataEffEmissione) {
        this.dataEffEmissione = dataEffEmissione;
    }

    public LocalDateTime getDataEffStorno() {
        return dataEffStorno;
    }

    public void setDataEffStorno(LocalDateTime dataEffStorno) {
        this.dataEffStorno = dataEffStorno;
    }

    public Integer getTokenAbbinamentoRic() {
        return tokenAbbinamentoRic;
    }

    public void setTokenAbbinamentoRic(Integer tokenAbbinamentoRic) {
        this.tokenAbbinamentoRic = tokenAbbinamentoRic;
    }

    public String getTipoCausaSinistro() {
        return tipoCausaSinistro;
    }

    public void setTipoCausaSinistro(String tipoCausaSinistro) {
        this.tipoCausaSinistro = tipoCausaSinistro;
    }

    public Double getImpPlusValenza() {
        return impPlusValenza;
    }

    public void setImpPlusValenza(Double impPlusValenza) {
        this.impPlusValenza = impPlusValenza;
    }

    public Double getImpRiserva() {
        return impRiserva;
    }

    public void setImpRiserva(Double impRiserva) {
        this.impRiserva = impRiserva;
    }

    public Double getImpBonus() {
        return impBonus;
    }

    public void setImpBonus(Double impBonus) {
        this.impBonus = impBonus;
    }

    public String getTipoEsitazione() {
        return tipoEsitazione;
    }

    public void setTipoEsitazione(String tipoEsitazione) {
        this.tipoEsitazione = tipoEsitazione;
    }

    public LocalDateTime getDataEsitazione() {
        return dataEsitazione;
    }

    public void setDataEsitazione(LocalDateTime dataEsitazione) {
        this.dataEsitazione = dataEsitazione;
    }

    public String getIndStatoControllo() {
        return indStatoControllo;
    }

    public void setIndStatoControllo(String indStatoControllo) {
        this.indStatoControllo = indStatoControllo;
    }

    public LocalDateTime getDataControllo() {
        return dataControllo;
    }

    public void setDataControllo(LocalDateTime dataControllo) {
        this.dataControllo = dataControllo;
    }

    public LocalDateTime getDataDecorrenza() {
        return dataDecorrenza;
    }

    public void setDataDecorrenza(LocalDateTime dataDecorrenza) {
        this.dataDecorrenza = dataDecorrenza;
    }

    public Double getImpCommissIncComp() {
        return impCommissIncComp;
    }

    public void setImpCommissIncComp(Double impCommissIncComp) {
        this.impCommissIncComp = impCommissIncComp;
    }

    public Double getImpCommissIncDistrib() {
        return impCommissIncDistrib;
    }

    public void setImpCommissIncDistrib(Double impCommissIncDistrib) {
        this.impCommissIncDistrib = impCommissIncDistrib;
    }

    public Double getImpPremioNettoRiv() {
        return impPremioNettoRiv;
    }

    public void setImpPremioNettoRiv(Double impPremioNettoRiv) {
        this.impPremioNettoRiv = impPremioNettoRiv;
    }

    public String getTipoDossier() {
        return tipoDossier;
    }

    public void setTipoDossier(String tipoDossier) {
        this.tipoDossier = tipoDossier;
    }

    public String getTipoAssistenza() {
        return tipoAssistenza;
    }

    public void setTipoAssistenza(String tipoAssistenza) {
        this.tipoAssistenza = tipoAssistenza;
    }

    public String getIndStatoSinistro() {
        return indStatoSinistro;
    }

    public void setIndStatoSinistro(String indStatoSinistro) {
        this.indStatoSinistro = indStatoSinistro;
    }

    public String getCodOpzione() {
        return codOpzione;
    }

    public void setCodOpzione(String codOpzione) {
        this.codOpzione = codOpzione;
    }

    public LocalDateTime getDataEffEsitazione() {
        return dataEffEsitazione;
    }

    public void setDataEffEsitazione(LocalDateTime dataEffEsitazione) {
        this.dataEffEsitazione = dataEffEsitazione;
    }

    public LocalDateTime getDataScaricoEmissione() {
        return dataScaricoEmissione;
    }

    public void setDataScaricoEmissione(LocalDateTime dataScaricoEmissione) {
        this.dataScaricoEmissione = dataScaricoEmissione;
    }

    public LocalDateTime getDataScaricoEsitazione() {
        return dataScaricoEsitazione;
    }

    public void setDataScaricoEsitazione(LocalDateTime dataScaricoEsitazione) {
        this.dataScaricoEsitazione = dataScaricoEsitazione;
    }

    public LocalDateTime getDataScaricoStorno() {
        return dataScaricoStorno;
    }

    public void setDataScaricoStorno(LocalDateTime dataScaricoStorno) {
        this.dataScaricoStorno = dataScaricoStorno;
    }

    public LocalDateTime getDataScaricoIncasso() {
        return dataScaricoIncasso;
    }

    public void setDataScaricoIncasso(LocalDateTime dataScaricoIncasso) {
        this.dataScaricoIncasso = dataScaricoIncasso;
    }

    public Double getImpAccessori() {
        return impAccessori;
    }

    public void setImpAccessori(Double impAccessori) {
        this.impAccessori = impAccessori;
    }

    public Double getImpImpostaVisentini() {
        return impImpostaVisentini;
    }

    public void setImpImpostaVisentini(Double impImpostaVisentini) {
        this.impImpostaVisentini = impImpostaVisentini;
    }

    public Double getImpImpostaSostitutiva() {
        return impImpostaSostitutiva;
    }

    public void setImpImpostaSostitutiva(Double impImpostaSostitutiva) {
        this.impImpostaSostitutiva = impImpostaSostitutiva;
    }

    public Double getImpImponibileImpVisentini() {
        return impImponibileImpVisentini;
    }

    public void setImpImponibileImpVisentini(Double impImponibileImpVisentini) {
        this.impImponibileImpVisentini = impImponibileImpVisentini;
    }

    public Double getImpImponibileImpSostitutiva() {
        return impImponibileImpSostitutiva;
    }

    public void setImpImponibileImpSostitutiva(Double impImponibileImpSostitutiva) {
        this.impImponibileImpSostitutiva = impImponibileImpSostitutiva;
    }

    public Double getImpSovrappremioSpo() {
        return impSovrappremioSpo;
    }

    public void setImpSovrappremioSpo(Double impSovrappremioSpo) {
        this.impSovrappremioSpo = impSovrappremioSpo;
    }

    public Double getImpSovrappremioSan() {
        return impSovrappremioSan;
    }

    public void setImpSovrappremioSan(Double impSovrappremioSan) {
        this.impSovrappremioSan = impSovrappremioSan;
    }

    public Double getImpSovrappremioPro() {
        return impSovrappremioPro;
    }

    public void setImpSovrappremioPro(Double impSovrappremioPro) {
        this.impSovrappremioPro = impSovrappremioPro;
    }

    public String getFlagFoglioCassa() {
        return flagFoglioCassa;
    }

    public void setFlagFoglioCassa(String flagFoglioCassa) {
        this.flagFoglioCassa = flagFoglioCassa;
    }

    public String getTipoMotivoStorno() {
        return tipoMotivoStorno;
    }

    public void setTipoMotivoStorno(String tipoMotivoStorno) {
        this.tipoMotivoStorno = tipoMotivoStorno;
    }

    public String getDescNoteVariazione() {
        return descNoteVariazione;
    }

    public void setDescNoteVariazione(String descNoteVariazione) {
        this.descNoteVariazione = descNoteVariazione;
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

    public String getCodSubagente() {
        return codSubagente;
    }

    public void setCodSubagente(String codSubagente) {
        this.codSubagente = codSubagente;
    }

    public String getDenLocalitaFirma() {
        return denLocalitaFirma;
    }

    public void setDenLocalitaFirma(String denLocalitaFirma) {
        this.denLocalitaFirma = denLocalitaFirma;
    }

    public Double getImpInteressiFrazionamento() {
        return impInteressiFrazionamento;
    }

    public void setImpInteressiFrazionamento(Double impInteressiFrazionamento) {
        this.impInteressiFrazionamento = impInteressiFrazionamento;
    }

    public Double getImpCapRendita() {
        return impCapRendita;
    }

    public void setImpCapRendita(Double impCapRendita) {
        this.impCapRendita = impCapRendita;
    }

    public Double getImpCapMinScad() {
        return impCapMinScad;
    }

    public void setImpCapMinScad(Double impCapMinScad) {
        this.impCapMinScad = impCapMinScad;
    }

    public Double getImpRendMinScad() {
        return impRendMinScad;
    }

    public void setImpRendMinScad(Double impRendMinScad) {
        this.impRendMinScad = impRendMinScad;
    }

    public Double getPercApplicata() {
        return percApplicata;
    }

    public void setPercApplicata(Double percApplicata) {
        this.percApplicata = percApplicata;
    }

    public String getCodAgenzia_2() {
        return codAgenzia_2;
    }

    public void setCodAgenzia_2(String codAgenzia_2) {
        this.codAgenzia_2 = codAgenzia_2;
    }

    public Double getImpCommissioneDistrib_2() {
        return impCommissioneDistrib_2;
    }

    public void setImpCommissioneDistrib_2(Double impCommissioneDistrib_2) {
        this.impCommissioneDistrib_2 = impCommissioneDistrib_2;
    }

    public Double getImpImpostaAntiracket() {
        return impImpostaAntiracket;
    }

    public void setImpImpostaAntiracket(Double impImpostaAntiracket) {
        this.impImpostaAntiracket = impImpostaAntiracket;
    }

    public Double getImpImpostaAggiuntiva() {
        return impImpostaAggiuntiva;
    }

    public void setImpImpostaAggiuntiva(Double impImpostaAggiuntiva) {
        this.impImpostaAggiuntiva = impImpostaAggiuntiva;
    }

    public LocalDateTime getDataEffEmissioneTecnica() {
        return dataEffEmissioneTecnica;
    }

    public void setDataEffEmissioneTecnica(LocalDateTime dataEffEmissioneTecnica) {
        this.dataEffEmissioneTecnica = dataEffEmissioneTecnica;
    }

    public LocalDateTime getDataScaricoEmissioneTecnica() {
        return dataScaricoEmissioneTecnica;
    }

    public void setDataScaricoEmissioneTecnica(LocalDateTime dataScaricoEmissioneTecnica) {
        this.dataScaricoEmissioneTecnica = dataScaricoEmissioneTecnica;
    }

    public String getCodDivisaEquiv() {
        return codDivisaEquiv;
    }

    public void setCodDivisaEquiv(String codDivisaEquiv) {
        this.codDivisaEquiv = codDivisaEquiv;
    }

    public Double getImpDanniCose() {
        return impDanniCose;
    }

    public void setImpDanniCose(Double impDanniCose) {
        this.impDanniCose = impDanniCose;
    }

    public Double getImpDanniPersone() {
        return impDanniPersone;
    }

    public void setImpDanniPersone(Double impDanniPersone) {
        this.impDanniPersone = impDanniPersone;
    }

    public Double getImpSpeseDirette() {
        return impSpeseDirette;
    }

    public void setImpSpeseDirette(Double impSpeseDirette) {
        this.impSpeseDirette = impSpeseDirette;
    }

    public Double getImpSpeseLiquidazione() {
        return impSpeseLiquidazione;
    }

    public void setImpSpeseLiquidazione(Double impSpeseLiquidazione) {
        this.impSpeseLiquidazione = impSpeseLiquidazione;
    }

    public Integer getNumOrdine() {
        return numOrdine;
    }

    public void setNumOrdine(Integer numOrdine) {
        this.numOrdine = numOrdine;
    }

    public Integer getTokenOperazioneRif2() {
        return tokenOperazioneRif2;
    }

    public void setTokenOperazioneRif2(Integer tokenOperazioneRif2) {
        this.tokenOperazioneRif2 = tokenOperazioneRif2;
    }

    public String getIndStatoCtrlListe() {
        return indStatoCtrlListe;
    }

    public void setIndStatoCtrlListe(String indStatoCtrlListe) {
        this.indStatoCtrlListe = indStatoCtrlListe;
    }

    public LocalDateTime getDataCompAntiriciclaggio() {
        return dataCompAntiriciclaggio;
    }

    public void setDataCompAntiriciclaggio(LocalDateTime dataCompAntiriciclaggio) {
        this.dataCompAntiriciclaggio = dataCompAntiriciclaggio;
    }

    public LocalDateTime getDataCompAntiriciclaggio2() {
        return dataCompAntiriciclaggio2;
    }

    public void setDataCompAntiriciclaggio2(LocalDateTime dataCompAntiriciclaggio2) {
        this.dataCompAntiriciclaggio2 = dataCompAntiriciclaggio2;
    }

    public LocalDateTime getDataCompProvvigioni() {
        return dataCompProvvigioni;
    }

    public void setDataCompProvvigioni(LocalDateTime dataCompProvvigioni) {
        this.dataCompProvvigioni = dataCompProvvigioni;
    }

    public LocalDateTime getDataComplReqComm() {
        return dataComplReqComm;
    }

    public void setDataComplReqComm(LocalDateTime dataComplReqComm) {
        this.dataComplReqComm = dataComplReqComm;
    }

    public Double getImpSpeseLegali() {
        return impSpeseLegali;
    }

    public void setImpSpeseLegali(Double impSpeseLegali) {
        this.impSpeseLegali = impSpeseLegali;
    }

    public Double getDummy01() {
        return dummy01;
    }

    public void setDummy01(Double dummy01) {
        this.dummy01 = dummy01;
    }

    public LocalDateTime getDataCessazione() {
        return dataCessazione;
    }

    public void setDataCessazione(LocalDateTime dataCessazione) {
        this.dataCessazione = dataCessazione;
    }

    public String getTipoOpzioneTassazioneK3() {
        return tipoOpzioneTassazioneK3;
    }

    public void setTipoOpzioneTassazioneK3(String tipoOpzioneTassazioneK3) {
        this.tipoOpzioneTassazioneK3 = tipoOpzioneTassazioneK3;
    }

    public Double getPercCapitale() {
        return percCapitale;
    }

    public void setPercCapitale(Double percCapitale) {
        this.percCapitale = percCapitale;
    }

    public Integer getTokenNominativo() {
        return tokenNominativo;
    }

    public void setTokenNominativo(Integer tokenNominativo) {
        this.tokenNominativo = tokenNominativo;
    }

    public String getTipoMotivoUscita() {
        return tipoMotivoUscita;
    }

    public void setTipoMotivoUscita(String tipoMotivoUscita) {
        this.tipoMotivoUscita = tipoMotivoUscita;
    }

    public Double getImpCommDelega() {
        return impCommDelega;
    }

    public void setImpCommDelega(Double impCommDelega) {
        this.impCommDelega = impCommDelega;
    }

    public String getIndStatoProfilo() {
        return indStatoProfilo;
    }

    public void setIndStatoProfilo(String indStatoProfilo) {
        this.indStatoProfilo = indStatoProfilo;
    }

    public Double getImpSpeseLiqInt() {
        return impSpeseLiqInt;
    }

    public void setImpSpeseLiqInt(Double impSpeseLiqInt) {
        this.impSpeseLiqInt = impSpeseLiqInt;
    }

    public Double getImpRitenuta() {
        return impRitenuta;
    }

    public void setImpRitenuta(Double impRitenuta) {
        this.impRitenuta = impRitenuta;
    }

    public LocalDateTime getDataValSovrappremi() {
        return dataValSovrappremi;
    }

    public void setDataValSovrappremi(LocalDateTime dataValSovrappremi) {
        this.dataValSovrappremi = dataValSovrappremi;
    }

    public Double getPercSconto() {
        return percSconto;
    }

    public void setPercSconto(Double percSconto) {
        this.percSconto = percSconto;
    }

    public Double getImpImpostaBollo() {
        return impImpostaBollo;
    }

    public void setImpImpostaBollo(Double impImpostaBollo) {
        this.impImpostaBollo = impImpostaBollo;
    }

    public Double getImpRiservaEquiv() {
        return impRiservaEquiv;
    }

    public void setImpRiservaEquiv(Double impRiservaEquiv) {
        this.impRiservaEquiv = impRiservaEquiv;
    }

    public Double getImpDanniCoseEquiv() {
        return impDanniCoseEquiv;
    }

    public void setImpDanniCoseEquiv(Double impDanniCoseEquiv) {
        this.impDanniCoseEquiv = impDanniCoseEquiv;
    }

    public Double getImpDanniPersoneEquiv() {
        return impDanniPersoneEquiv;
    }

    public void setImpDanniPersoneEquiv(Double impDanniPersoneEquiv) {
        this.impDanniPersoneEquiv = impDanniPersoneEquiv;
    }

    public LocalDateTime getDataCambioDivisaEquiv() {
        return dataCambioDivisaEquiv;
    }

    public void setDataCambioDivisaEquiv(LocalDateTime dataCambioDivisaEquiv) {
        this.dataCambioDivisaEquiv = dataCambioDivisaEquiv;
    }

    public Double getTassoCambioDivisaEquiv() {
        return tassoCambioDivisaEquiv;
    }

    public void setTassoCambioDivisaEquiv(Double tassoCambioDivisaEquiv) {
        this.tassoCambioDivisaEquiv = tassoCambioDivisaEquiv;
    }

    public String getSottotipoOperazione() {
        return sottotipoOperazione;
    }

    public void setSottotipoOperazione(String sottotipoOperazione) {
        this.sottotipoOperazione = sottotipoOperazione;
    }

    public Double getImpSovrappremioAcma() {
        return impSovrappremioAcma;
    }

    public void setImpSovrappremioAcma(Double impSovrappremioAcma) {
        this.impSovrappremioAcma = impSovrappremioAcma;
    }

    public Double getImpAccessori_1() {
        return impAccessori_1;
    }

    public void setImpAccessori_1(Double impAccessori_1) {
        this.impAccessori_1 = impAccessori_1;
    }

    public Double getImpAccessori_2() {
        return impAccessori_2;
    }

    public void setImpAccessori_2(Double impAccessori_2) {
        this.impAccessori_2 = impAccessori_2;
    }

    public Double getImpTotaleUsd() {
        return impTotaleUsd;
    }

    public void setImpTotaleUsd(Double impTotaleUsd) {
        this.impTotaleUsd = impTotaleUsd;
    }

    public String getCodNominativo() {
        return codNominativo;
    }

    public void setCodNominativo(String codNominativo) {
        this.codNominativo = codNominativo;
    }

    public Double getImpCommissioniGestore() {
        return impCommissioniGestore;
    }

    public void setImpCommissioniGestore(Double impCommissioniGestore) {
        this.impCommissioniGestore = impCommissioniGestore;
    }

    public Double getPercRichioTarato() {
        return percRichioTarato;
    }

    public void setPercRichioTarato(Double percRichioTarato) {
        this.percRichioTarato = percRichioTarato;
    }

    public Integer getTokenOperazioneAbbinata2() {
        return tokenOperazioneAbbinata2;
    }

    public void setTokenOperazioneAbbinata2(Integer tokenOperazioneAbbinata2) {
        this.tokenOperazioneAbbinata2 = tokenOperazioneAbbinata2;
    }

    public Double getImpCostoEstPartner() {
        return impCostoEstPartner;
    }

    public void setImpCostoEstPartner(Double impCostoEstPartner) {
        this.impCostoEstPartner = impCostoEstPartner;
    }

    public Double getImpCostoEstComp() {
        return impCostoEstComp;
    }

    public void setImpCostoEstComp(Double impCostoEstComp) {
        this.impCostoEstComp = impCostoEstComp;
    }

    public Double getImpCostoEmisPartner() {
        return impCostoEmisPartner;
    }

    public void setImpCostoEmisPartner(Double impCostoEmisPartner) {
        this.impCostoEmisPartner = impCostoEmisPartner;
    }

    public Double getImpCostoEmisComp() {
        return impCostoEmisComp;
    }

    public void setImpCostoEmisComp(Double impCostoEmisComp) {
        this.impCostoEmisComp = impCostoEmisComp;
    }

    public Double getFrazCapitale() {
        return frazCapitale;
    }

    public void setFrazCapitale(Double frazCapitale) {
        this.frazCapitale = frazCapitale;
    }

    public Integer getTokenRegolaIncasso() {
        return tokenRegolaIncasso;
    }

    public void setTokenRegolaIncasso(Integer tokenRegolaIncasso) {
        this.tokenRegolaIncasso = tokenRegolaIncasso;
    }

    public String getCodSubagente2() {
        return codSubagente2;
    }

    public void setCodSubagente2(String codSubagente2) {
        this.codSubagente2 = codSubagente2;
    }

    public String getCodSubagente3() {
        return codSubagente3;
    }

    public void setCodSubagente3(String codSubagente3) {
        this.codSubagente3 = codSubagente3;
    }

    public Double getImpImpostaBolloEquiv() {
        return impImpostaBolloEquiv;
    }

    public void setImpImpostaBolloEquiv(Double impImpostaBolloEquiv) {
        this.impImpostaBolloEquiv = impImpostaBolloEquiv;
    }

    public Double getImpRiservaCaduta() {
        return impRiservaCaduta;
    }

    public void setImpRiservaCaduta(Double impRiservaCaduta) {
        this.impRiservaCaduta = impRiservaCaduta;
    }

    public Double getImpRiferimento() {
        return impRiferimento;
    }

    public void setImpRiferimento(Double impRiferimento) {
        this.impRiferimento = impRiferimento;
    }

    public Double getImpRiferimentoMin() {
        return impRiferimentoMin;
    }

    public void setImpRiferimentoMin(Double impRiferimentoMin) {
        this.impRiferimentoMin = impRiferimentoMin;
    }

    public Double getImpRiferimentoMax() {
        return impRiferimentoMax;
    }

    public void setImpRiferimentoMax(Double impRiferimentoMax) {
        this.impRiferimentoMax = impRiferimentoMax;
    }

    public Integer getTokenRegolaIncassoC1() {
        return tokenRegolaIncassoC1;
    }

    public void setTokenRegolaIncassoC1(Integer tokenRegolaIncassoC1) {
        this.tokenRegolaIncassoC1 = tokenRegolaIncassoC1;
    }

    public String getCodGestioneAgenzia() {
        return codGestioneAgenzia;
    }

    public void setCodGestioneAgenzia(String codGestioneAgenzia) {
        this.codGestioneAgenzia = codGestioneAgenzia;
    }

    public String getCodFiliale() {
        return codFiliale;
    }

    public void setCodFiliale(String codFiliale) {
        this.codFiliale = codFiliale;
    }

    public String getFlagTcm() {
        return flagTcm;
    }

    public void setFlagTcm(String flagTcm) {
        this.flagTcm = flagTcm;
    }

    public Double getPercCm() {
        return percCm;
    }

    public void setPercCm(Double percCm) {
        this.percCm = percCm;
    }

    public Double getPercCmMfee() {
        return percCmMfee;
    }

    public void setPercCmMfee(Double percCmMfee) {
        this.percCmMfee = percCmMfee;
    }

    public Double getPercCapitaleProtetto() {
        return percCapitaleProtetto;
    }

    public void setPercCapitaleProtetto(Double percCapitaleProtetto) {
        this.percCapitaleProtetto = percCapitaleProtetto;
    }

    public Double getPercNavProtetto() {
        return percNavProtetto;
    }

    public void setPercNavProtetto(Double percNavProtetto) {
        this.percNavProtetto = percNavProtetto;
    }

    public String getPtfOrigine() {
        return ptfOrigine;
    }

    public void setPtfOrigine(String ptfOrigine) {
        this.ptfOrigine = ptfOrigine;
    }

    public String getUuidOperazione() {
        return uuidOperazione;
    }

    public void setUuidOperazione(String uuidOperazione) {
        this.uuidOperazione = uuidOperazione;
    }

    public String getCodTransazioneEpay() {
        return codTransazioneEpay;
    }

    public void setCodTransazioneEpay(String codTransazioneEpay) {
        this.codTransazioneEpay = codTransazioneEpay;
    }

    public String getCodCartaRicorrEpay() {
        return codCartaRicorrEpay;
    }

    public void setCodCartaRicorrEpay(String codCartaRicorrEpay) {
        this.codCartaRicorrEpay = codCartaRicorrEpay;
    }

    public Double getImpImponibBenefFisc_2007() {
        return impImponibBenefFisc_2007;
    }

    public void setImpImponibBenefFisc_2007(Double impImponibBenefFisc_2007) {
        this.impImponibBenefFisc_2007 = impImponibBenefFisc_2007;
    }

    public String getFlagDocSinistro() {
        return flagDocSinistro;
    }

    public void setFlagDocSinistro(String flagDocSinistro) {
        this.flagDocSinistro = flagDocSinistro;
    }

    public Double getImpImpostaBolloSpeciale() {
        return impImpostaBolloSpeciale;
    }

    public void setImpImpostaBolloSpeciale(Double impImpostaBolloSpeciale) {
        this.impImpostaBolloSpeciale = impImpostaBolloSpeciale;
    }

    public LocalDateTime getDataInizioMotivoUscita() {
        return dataInizioMotivoUscita;
    }

    public void setDataInizioMotivoUscita(LocalDateTime dataInizioMotivoUscita) {
        this.dataInizioMotivoUscita = dataInizioMotivoUscita;
    }

    public PolizzaEntity getPolizza() {
        return polizza;
    }

    public void setPolizza(PolizzaEntity polizza) {
        this.polizza = polizza;
    }
}
