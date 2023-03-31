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
@Table(name = "nominativo")
public class NominativoEntity {

    @Id
    @SequenceGenerator(name = "tokenNominativoGenerator", sequenceName = "nominativo_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tokenNominativoGenerator")
    @Column(name = "token_nominativo", nullable = false)
    private Integer tokenNominativo;

    @Column(name = "tipo_nominativo", length = 1, nullable = false)
    private String tipoNominativo;

    @Column(name = "cod_fiscale", length = 16)
    private String codFiscale;

    @Column(name = "cod_partita_iva", length = 11)
    private String codPartitaIva;

    @Column(name = "desc_note_nominativo", length = 255)
    private String descNoteNominativo;

    @Column(name = "cod_lingua", length = 2)
    private String codLingua;

    @Column(name = "ind_stato_codice_fiscale", length = 1)
    private String indStatoCodiceFiscale;

    @Column(name = "num_ultima_comunicazione")
    private Integer numUltimaComunicazione;

    @Column(name = "cod_sottogruppo", length = 18)
    private String codSottogruppo;

    @Column(name = "cod_ramo_attivita", length = 18)
    private String codRamoAttivita;

    @Column(name = "cod_nominativo", length = 30)
    private String codNominativo;

    @Column(name = "den_cognome", length = 80)
    private String denCognome;

    @Column(name = "den_cognome_indice", length = 20)
    private String denCognomeIndice;

    @Column(name = "den_nome", length = 80)
    private String denNome;

    @Column(name = "den_cognome_acquisito", length = 80)
    private String denCognomeAcquisito;

    @Column(name = "tipo_sesso", length = 1)
    private String tipoSesso;

    @Column(name = "data_nascita")
    private LocalDateTime dataNascita;

    @Column(name = "cod_provincia_istat_nascita", length = 3)
    private String codProvinciaIstatNascita;

    @Column(name = "den_comune_nascita", length = 80)
    private String denComuneNascita;

    @Column(name = "data_decesso")
    private LocalDateTime dataDecesso;

    @Column(name = "cod_nazione_cittadinanza", length = 3)
    private String codNazioneCittadinanza;

    @Column(name = "tipo_titolo", length = 3)
    private String tipoTitolo;

    @Column(name = "tipo_stato_civile", length = 1)
    private String tipoStatoCivile;

    @Column(name = "tipo_lavoratore", length = 2)
    private String tipoLavoratore;

    @Column(name = "desc_professione", length = 255)
    private String descProfessione;

    @Column(name = "cod_professione", length = 5)
    private String codProfessione;

    @Column(name = "desc_titolo", length = 50)
    private String descTitolo;

    @Column(name = "den_nazionalita", length = 80)
    private String denNazionalita;

    @Column(name = "den_nominativo", length = 80)
    private String denNominativo;

    @Column(name = "tipo_calcolo_persona_fisica", length = 1)
    private String tipoCalcoloPersonaFisica;

    @Column(name = "cod_matricola", length = 18)
    private String codMatricola;

    @Column(name = "tipo_unita_locale", length = 1)
    private String tipoUnitaLocale;

    @Column(name = "den_ragione_sociale", length = 255)
    private String denRagioneSociale;

    @Column(name = "den_ragione_sociale_breve", length = 80)
    private String denRagioneSocialeBreve;

    @Column(name = "cod_cont_persona_giuridica", length = 5)
    private String codContPersonaGiuridica;

    @Column(name = "tipo_forma_giuridica", length = 2)
    private String tipoFormaGiuridica;

    @Column(name = "tipo_persona_giuridica", length = 2)
    private String tipoPersonaGiuridica;

    @Column(name = "data_costituzione")
    private LocalDateTime dataCostituzione;

    @Column(name = "data_iscrizione_tribunale")
    private LocalDateTime dataIscrizioneTribunale;

    @Column(name = "cod_numero_iscrizione_tribunal", length = 255)
    private String codNumeroIscrizioneTribunal;

    @Column(name = "cod_provincia_tribunale", length = 3)
    private String codProvinciaTribunale;

    @Column(name = "data_cessazione")
    private LocalDateTime dataCessazione;

    @Column(name = "tipo_motivo_cessazione", length = 2)
    private String tipoMotivoCessazione;

    @Column(name = "imp_capitale_sociale")
    private Double impCapitaleSociale;

    @Column(name = "cod_identificativo", length = 20)
    private String codIdentificativo;

    @Column(name = "cod_agenzia", length = 20)
    private String codAgenzia;

    @Column(name = "tipo_canale", length = 2)
    private String tipoCanale;

    @Column(name = "data_timestamp")
    private LocalDateTime dataTimestamp;

    @Column(name = "den_login", length = 80)
    private String denLogin;

    @Column(name = "cod_num_iscr_reg_imprese", length = 20)
    private String codNumIscrRegImprese;

    @Column(name = "prov_iscr_reg_imprese", length = 3)
    private String provIscrRegImprese;

    @Column(name = "flag_privacy", length = 1)
    private String flagPrivacy;

    @Column(name = "flag_privacy2", length = 1)
    private String flagPrivacy2;

    @Column(name = "data_scadenza")
    private LocalDateTime dataScadenza;

    @Column(name = "data_firma_privacy")
    private LocalDateTime dataFirmaPrivacy;

    @Column(name = "cod_subagente", length = 18)
    private String codSubagente;

    @Column(name = "cod_id_contribuzione", length = 20)
    private String codIdContribuzione;

    @Column(name = "tipo_societa", length = 2)
    private String tipoSocieta;

    @Column(name = "cod_rui", length = 20)
    private String codRui;

    @Column(name = "tipo_invio_corrispondenza", length = 2)
    private String tipoInvioCorrispondenza;

    @Column(name = "tipo_attivita_economica", length = 18)
    private String tipoAttivitaEconomica;

    @Column(name = "cod_nominativo_broker", length = 40)
    private String codNominativoBroker;

    @Column(name = "cod_polizza_fabbrica_sx", length = 30)
    private String codPolizzaFabbricaSx;

    @Column(name = "den_rif_pagamento", length = 80)
    private String denRifPagamento;

    @Column(name = "cod_profilo_rischio", length = 2)
    private String codProfiloRischio;

    @Column(name = "cod_rete", length = 10)
    private String codRete;

    @Column(name = "classe_rating_riassicuratore", length = 20)
    private String classeRatingRiassicuratore;

    @Column(name = "data_assegnazione_rating")
    private LocalDateTime dataAssegnazioneRating;

    @Column(name = "agenzia_rating", length = 2)
    private String agenziaRating;

    @Column(name = "soggetto_controllante", length = 100)
    private String soggettoControllante;

    @Column(name = "flag_gruppo_impresa_cedente", length = 1)
    private String flagGruppoImpresaCedente;

    @Column(name = "tipo_ditta", length = 2)
    private String tipoDitta;

    @Column(name = "ind_stato_ctrl_liste", length = 2)
    private String indStatoCtrlListe;

    @Column(name = "flag_us_status", length = 1)
    private String flagUsStatus;

    @Column(name = "tipo_cod_tin_ein", length = 2)
    private String tipoCodTinEin;

    @Column(name = "cod_tin_ein", length = 30)
    private String codTinEin;

    @Column(name = "cod_giin", length = 30)
    private String codGiin;

    @Column(name = "tipologia_attivita_economica", length = 2)
    private String tipologiaAttivitaEconomica;

    @Column(name = "tipo_titolo_studio", length = 2)
    private String tipoTitoloStudio;

    @Column(name = "flag_esenzione_bollo", length = 1)
    private String flagEsenzioneBollo;

    @Column(name = "flag_esenzione_imposta", length = 1)
    private String flagEsenzioneImposta;

    @Column(name = "flag_mandato_incasso", length = 1)
    private String flagMandatoIncasso;

    @Column(name = "flag_pep", length = 1)
    private String flagPep;

    @Column(name = "ruolo_pep", length = 80)
    private String ruoloPep;

    @Column(name = "tipo_fonte_reddito", length = 2)
    private String tipoFonteReddito;

    @Column(name = "den_fonte_reddito", length = 80)
    private String denFonteReddito;

    @Column(name = "cod_pubblico_ufficiale", length = 2)
    private String codPubblicoUfficiale;

    @Column(name = "cod_nazione_istat_attivita", length = 3)
    private String codNazioneIstatAttivita;

    @Column(name = "flag_privacy3", length = 1)
    private String flagPrivacy3;

    @Column(name = "cod_ateco", length = 18)
    private String codAteco;

    @Column(name = "cod_compagnia", length = 10)
    private String codCompagnia;

    @Column(name = "tipo_residenza_fiscale", length = 2)
    private String tipoResidenzaFiscale;

    @Column(name = "imp_rating")
    private Double impRating;

    @Column(name = "token_nominativo_rif")
    private Integer tokenNominativoRif;

    @Column(name = "cod_nazione_cittadinanza2", length = 3)
    private String codNazioneCittadinanza2;

    @Column(name = "den_ente_registrazione", length = 80)
    private String denEnteRegistrazione;

    @Column(name = "tipo_cliente", length = 2)
    private String tipoCliente;

    @Column(name = "flag_avc_scaduto", length = 1)
    private String flagAvcScaduto;

    @Column(name = "flag_document_scaduto", length = 1)
    private String flagDocumentScaduto;

    @Column(name = "data_avc_scaduto")
    private LocalDateTime dataAvcScaduto;

    @Column(name = "flag_fiduciaria", length = 1)
    private String flagFiduciaria;

    @Column(name = "id_nominativo_esterno")
    private Integer idNominativoEsterno;

    @Column(name = "stato_avc", length = 2)
    private String statoAvc;

    @Column(name = "anzianita_contrib_al_2007", length = 15)
    private String anzianitaContribAl_2007;

    @Column(name = "cod_nazione_dom_fisc", length = 3)
    private String codNazioneDomFisc;

    @Column(name = "flag_fiduciaria_extra_gruppo", length = 1)
    private String flagFiduciariaExtraGruppo;

    @Column(name = "tipo_intermediario", length = 1)
    private String tipoIntermediario;

    @Column(name = "data_inizio_mandato")
    private LocalDateTime dataInizioMandato;

    @Column(name = "data_fine_mandato")
    private LocalDateTime dataFineMandato;

    @Column(name = "cod_orario_lavoro", length = 10)
    private String codOrarioLavoro;

    @Column(name = "imp_stipendio")
    private Double impStipendio;

    @Column(name = "cod_nazione_costituzione", length = 3)
    private String codNazioneCostituzione;

    @Column(name = "den_comune_costituzione", length = 80)
    private String denComuneCostituzione;

    @Column(name = "flag_domicilio_residenza", length = 1)
    private String flagDomicilioResidenza;

    @Column(name = "cod_sigedis_wap", length = 30)
    private String codSigedisWap;

    @Column(name = "cod_sigedis_awap", length = 30)
    private String codSigedisAwap;

    @Column(name = "flag_pubblico_ufficiale", length = 1)
    private String flagPubblicoUfficiale;

    @Column(name = "flag_privacy4", length = 1)
    private String flagPrivacy4;

    @Column(name = "flag_privacy5", length = 1)
    private String flagPrivacy5;

    @Column(name = "cod_offuscamento", length = 20)
    private String codOffuscamento;

    @Column(name = "tipo_cariche_pubbliche", length = 2)
    private String tipoCarichePubbliche;

    @Column(name = "tipologia_attivita_eco_preced", length = 2)
    private String tipologiaAttivitaEcoPreced;

    @Column(name = "cod_prov_att_prevalente_istat", length = 3)
    private String codProvAttPrevalenteIstat;

    @Column(name = "cod_paese_att_prevalente", length = 3)
    private String codPaeseAttPrevalente;

    @Column(name = "tipo_patrimonio_complessivo", length = 2)
    private String tipoPatrimonioComplessivo;

    @Column(name = "cod_paese_est_rel_comm1", length = 3)
    private String codPaeseEstRelComm1;

    @Column(name = "cod_paese_est_rel_comm2", length = 3)
    private String codPaeseEstRelComm2;

    @Column(name = "cod_paese_est_rel_comm3", length = 3)
    private String codPaeseEstRelComm3;

    @Column(name = "desc_attivita_non_profit", length = 50)
    private String descAttivitaNonProfit;

    @Column(name = "tipo_fascia_reddito", length = 2)
    private String tipoFasciaReddito;

    @Column(name = "imp_massimale")
    private Double impMassimale;

    @Column(name = "cod_cab_nascita", length = 5)
    private String codCabNascita;

    @Column(name = "partner_info", length = 80)
    private String partnerInfo;

    @Column(name = "canale_info", length = 18)
    private String canaleInfo;

    @Column(name = "tipo_fonte_denuncia", length = 2)
    private String tipoFonteDenuncia;

    @Column(name = "desc_modalita_denuncia", length = 255)
    private String descModalitaDenuncia;

    @Column(name = "data_denuncia_decesso")
    private LocalDateTime dataDenunciaDecesso;

    @Column(name = "cod_fiscale_estero", length = 25)
    private String codFiscaleEstero;

    @Column(name = "flag_financial_institution", length = 1)
    private String flagFinancialInstitution;

    @Column(name = "flag_esenzione_bollo_speciale", length = 1)
    private String flagEsenzioneBolloSpeciale;

    @Column(name = "data_qautoval_ultimo")
    private LocalDateTime dataQautovalUltimo;

    @Column(name = "cod_nazionalita_uic", length = 3)
    private String codNazionalitaUic;

    @Column(name = "cod_comune_nascita", length = 4)
    private String codComuneNascita;

    @Column(name = "ind_stato_fea", length = 2)
    private String indStatoFea;

    public Integer getTokenNominativo() {
        return tokenNominativo;
    }

    public void setTokenNominativo(Integer tokenNominativo) {
        this.tokenNominativo = tokenNominativo;
    }

    public String getTipoNominativo() {
        return tipoNominativo;
    }

    public void setTipoNominativo(String tipoNominativo) {
        this.tipoNominativo = tipoNominativo;
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

    public String getDescNoteNominativo() {
        return descNoteNominativo;
    }

    public void setDescNoteNominativo(String descNoteNominativo) {
        this.descNoteNominativo = descNoteNominativo;
    }

    public String getCodLingua() {
        return codLingua;
    }

    public void setCodLingua(String codLingua) {
        this.codLingua = codLingua;
    }

    public String getIndStatoCodiceFiscale() {
        return indStatoCodiceFiscale;
    }

    public void setIndStatoCodiceFiscale(String indStatoCodiceFiscale) {
        this.indStatoCodiceFiscale = indStatoCodiceFiscale;
    }

    public Integer getNumUltimaComunicazione() {
        return numUltimaComunicazione;
    }

    public void setNumUltimaComunicazione(Integer numUltimaComunicazione) {
        this.numUltimaComunicazione = numUltimaComunicazione;
    }

    public String getCodSottogruppo() {
        return codSottogruppo;
    }

    public void setCodSottogruppo(String codSottogruppo) {
        this.codSottogruppo = codSottogruppo;
    }

    public String getCodRamoAttivita() {
        return codRamoAttivita;
    }

    public void setCodRamoAttivita(String codRamoAttivita) {
        this.codRamoAttivita = codRamoAttivita;
    }

    public String getCodNominativo() {
        return codNominativo;
    }

    public void setCodNominativo(String codNominativo) {
        this.codNominativo = codNominativo;
    }

    public String getDenCognome() {
        return denCognome;
    }

    public void setDenCognome(String denCognome) {
        this.denCognome = denCognome;
    }

    public String getDenCognomeIndice() {
        return denCognomeIndice;
    }

    public void setDenCognomeIndice(String denCognomeIndice) {
        this.denCognomeIndice = denCognomeIndice;
    }

    public String getDenNome() {
        return denNome;
    }

    public void setDenNome(String denNome) {
        this.denNome = denNome;
    }

    public String getDenCognomeAcquisito() {
        return denCognomeAcquisito;
    }

    public void setDenCognomeAcquisito(String denCognomeAcquisito) {
        this.denCognomeAcquisito = denCognomeAcquisito;
    }

    public String getTipoSesso() {
        return tipoSesso;
    }

    public void setTipoSesso(String tipoSesso) {
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

    public LocalDateTime getDataDecesso() {
        return dataDecesso;
    }

    public void setDataDecesso(LocalDateTime dataDecesso) {
        this.dataDecesso = dataDecesso;
    }

    public String getCodNazioneCittadinanza() {
        return codNazioneCittadinanza;
    }

    public void setCodNazioneCittadinanza(String codNazioneCittadinanza) {
        this.codNazioneCittadinanza = codNazioneCittadinanza;
    }

    public String getTipoTitolo() {
        return tipoTitolo;
    }

    public void setTipoTitolo(String tipoTitolo) {
        this.tipoTitolo = tipoTitolo;
    }

    public String getTipoStatoCivile() {
        return tipoStatoCivile;
    }

    public void setTipoStatoCivile(String tipoStatoCivile) {
        this.tipoStatoCivile = tipoStatoCivile;
    }

    public String getTipoLavoratore() {
        return tipoLavoratore;
    }

    public void setTipoLavoratore(String tipoLavoratore) {
        this.tipoLavoratore = tipoLavoratore;
    }

    public String getDescProfessione() {
        return descProfessione;
    }

    public void setDescProfessione(String descProfessione) {
        this.descProfessione = descProfessione;
    }

    public String getCodProfessione() {
        return codProfessione;
    }

    public void setCodProfessione(String codProfessione) {
        this.codProfessione = codProfessione;
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

    public String getTipoCalcoloPersonaFisica() {
        return tipoCalcoloPersonaFisica;
    }

    public void setTipoCalcoloPersonaFisica(String tipoCalcoloPersonaFisica) {
        this.tipoCalcoloPersonaFisica = tipoCalcoloPersonaFisica;
    }

    public String getCodMatricola() {
        return codMatricola;
    }

    public void setCodMatricola(String codMatricola) {
        this.codMatricola = codMatricola;
    }

    public String getTipoUnitaLocale() {
        return tipoUnitaLocale;
    }

    public void setTipoUnitaLocale(String tipoUnitaLocale) {
        this.tipoUnitaLocale = tipoUnitaLocale;
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

    public String getCodContPersonaGiuridica() {
        return codContPersonaGiuridica;
    }

    public void setCodContPersonaGiuridica(String codContPersonaGiuridica) {
        this.codContPersonaGiuridica = codContPersonaGiuridica;
    }

    public String getTipoFormaGiuridica() {
        return tipoFormaGiuridica;
    }

    public void setTipoFormaGiuridica(String tipoFormaGiuridica) {
        this.tipoFormaGiuridica = tipoFormaGiuridica;
    }

    public String getTipoPersonaGiuridica() {
        return tipoPersonaGiuridica;
    }

    public void setTipoPersonaGiuridica(String tipoPersonaGiuridica) {
        this.tipoPersonaGiuridica = tipoPersonaGiuridica;
    }

    public LocalDateTime getDataCostituzione() {
        return dataCostituzione;
    }

    public void setDataCostituzione(LocalDateTime dataCostituzione) {
        this.dataCostituzione = dataCostituzione;
    }

    public LocalDateTime getDataIscrizioneTribunale() {
        return dataIscrizioneTribunale;
    }

    public void setDataIscrizioneTribunale(LocalDateTime dataIscrizioneTribunale) {
        this.dataIscrizioneTribunale = dataIscrizioneTribunale;
    }

    public String getCodNumeroIscrizioneTribunal() {
        return codNumeroIscrizioneTribunal;
    }

    public void setCodNumeroIscrizioneTribunal(String codNumeroIscrizioneTribunal) {
        this.codNumeroIscrizioneTribunal = codNumeroIscrizioneTribunal;
    }

    public String getCodProvinciaTribunale() {
        return codProvinciaTribunale;
    }

    public void setCodProvinciaTribunale(String codProvinciaTribunale) {
        this.codProvinciaTribunale = codProvinciaTribunale;
    }

    public LocalDateTime getDataCessazione() {
        return dataCessazione;
    }

    public void setDataCessazione(LocalDateTime dataCessazione) {
        this.dataCessazione = dataCessazione;
    }

    public String getTipoMotivoCessazione() {
        return tipoMotivoCessazione;
    }

    public void setTipoMotivoCessazione(String tipoMotivoCessazione) {
        this.tipoMotivoCessazione = tipoMotivoCessazione;
    }

    public Double getImpCapitaleSociale() {
        return impCapitaleSociale;
    }

    public void setImpCapitaleSociale(Double impCapitaleSociale) {
        this.impCapitaleSociale = impCapitaleSociale;
    }

    public String getCodIdentificativo() {
        return codIdentificativo;
    }

    public void setCodIdentificativo(String codIdentificativo) {
        this.codIdentificativo = codIdentificativo;
    }

    public String getCodAgenzia() {
        return codAgenzia;
    }

    public void setCodAgenzia(String codAgenzia) {
        this.codAgenzia = codAgenzia;
    }

    public String getTipoCanale() {
        return tipoCanale;
    }

    public void setTipoCanale(String tipoCanale) {
        this.tipoCanale = tipoCanale;
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

    public String getCodNumIscrRegImprese() {
        return codNumIscrRegImprese;
    }

    public void setCodNumIscrRegImprese(String codNumIscrRegImprese) {
        this.codNumIscrRegImprese = codNumIscrRegImprese;
    }

    public String getProvIscrRegImprese() {
        return provIscrRegImprese;
    }

    public void setProvIscrRegImprese(String provIscrRegImprese) {
        this.provIscrRegImprese = provIscrRegImprese;
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

    public LocalDateTime getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(LocalDateTime dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public LocalDateTime getDataFirmaPrivacy() {
        return dataFirmaPrivacy;
    }

    public void setDataFirmaPrivacy(LocalDateTime dataFirmaPrivacy) {
        this.dataFirmaPrivacy = dataFirmaPrivacy;
    }

    public String getCodSubagente() {
        return codSubagente;
    }

    public void setCodSubagente(String codSubagente) {
        this.codSubagente = codSubagente;
    }

    public String getCodIdContribuzione() {
        return codIdContribuzione;
    }

    public void setCodIdContribuzione(String codIdContribuzione) {
        this.codIdContribuzione = codIdContribuzione;
    }

    public String getTipoSocieta() {
        return tipoSocieta;
    }

    public void setTipoSocieta(String tipoSocieta) {
        this.tipoSocieta = tipoSocieta;
    }

    public String getCodRui() {
        return codRui;
    }

    public void setCodRui(String codRui) {
        this.codRui = codRui;
    }

    public String getTipoInvioCorrispondenza() {
        return tipoInvioCorrispondenza;
    }

    public void setTipoInvioCorrispondenza(String tipoInvioCorrispondenza) {
        this.tipoInvioCorrispondenza = tipoInvioCorrispondenza;
    }

    public String getTipoAttivitaEconomica() {
        return tipoAttivitaEconomica;
    }

    public void setTipoAttivitaEconomica(String tipoAttivitaEconomica) {
        this.tipoAttivitaEconomica = tipoAttivitaEconomica;
    }

    public String getCodNominativoBroker() {
        return codNominativoBroker;
    }

    public void setCodNominativoBroker(String codNominativoBroker) {
        this.codNominativoBroker = codNominativoBroker;
    }

    public String getCodPolizzaFabbricaSx() {
        return codPolizzaFabbricaSx;
    }

    public void setCodPolizzaFabbricaSx(String codPolizzaFabbricaSx) {
        this.codPolizzaFabbricaSx = codPolizzaFabbricaSx;
    }

    public String getDenRifPagamento() {
        return denRifPagamento;
    }

    public void setDenRifPagamento(String denRifPagamento) {
        this.denRifPagamento = denRifPagamento;
    }

    public String getCodProfiloRischio() {
        return codProfiloRischio;
    }

    public void setCodProfiloRischio(String codProfiloRischio) {
        this.codProfiloRischio = codProfiloRischio;
    }

    public String getCodRete() {
        return codRete;
    }

    public void setCodRete(String codRete) {
        this.codRete = codRete;
    }

    public String getClasseRatingRiassicuratore() {
        return classeRatingRiassicuratore;
    }

    public void setClasseRatingRiassicuratore(String classeRatingRiassicuratore) {
        this.classeRatingRiassicuratore = classeRatingRiassicuratore;
    }

    public LocalDateTime getDataAssegnazioneRating() {
        return dataAssegnazioneRating;
    }

    public void setDataAssegnazioneRating(LocalDateTime dataAssegnazioneRating) {
        this.dataAssegnazioneRating = dataAssegnazioneRating;
    }

    public String getAgenziaRating() {
        return agenziaRating;
    }

    public void setAgenziaRating(String agenziaRating) {
        this.agenziaRating = agenziaRating;
    }

    public String getSoggettoControllante() {
        return soggettoControllante;
    }

    public void setSoggettoControllante(String soggettoControllante) {
        this.soggettoControllante = soggettoControllante;
    }

    public String getFlagGruppoImpresaCedente() {
        return flagGruppoImpresaCedente;
    }

    public void setFlagGruppoImpresaCedente(String flagGruppoImpresaCedente) {
        this.flagGruppoImpresaCedente = flagGruppoImpresaCedente;
    }

    public String getTipoDitta() {
        return tipoDitta;
    }

    public void setTipoDitta(String tipoDitta) {
        this.tipoDitta = tipoDitta;
    }

    public String getIndStatoCtrlListe() {
        return indStatoCtrlListe;
    }

    public void setIndStatoCtrlListe(String indStatoCtrlListe) {
        this.indStatoCtrlListe = indStatoCtrlListe;
    }

    public String getFlagUsStatus() {
        return flagUsStatus;
    }

    public void setFlagUsStatus(String flagUsStatus) {
        this.flagUsStatus = flagUsStatus;
    }

    public String getTipoCodTinEin() {
        return tipoCodTinEin;
    }

    public void setTipoCodTinEin(String tipoCodTinEin) {
        this.tipoCodTinEin = tipoCodTinEin;
    }

    public String getCodTinEin() {
        return codTinEin;
    }

    public void setCodTinEin(String codTinEin) {
        this.codTinEin = codTinEin;
    }

    public String getCodGiin() {
        return codGiin;
    }

    public void setCodGiin(String codGiin) {
        this.codGiin = codGiin;
    }

    public String getTipologiaAttivitaEconomica() {
        return tipologiaAttivitaEconomica;
    }

    public void setTipologiaAttivitaEconomica(String tipologiaAttivitaEconomica) {
        this.tipologiaAttivitaEconomica = tipologiaAttivitaEconomica;
    }

    public String getTipoTitoloStudio() {
        return tipoTitoloStudio;
    }

    public void setTipoTitoloStudio(String tipoTitoloStudio) {
        this.tipoTitoloStudio = tipoTitoloStudio;
    }

    public String getFlagEsenzioneBollo() {
        return flagEsenzioneBollo;
    }

    public void setFlagEsenzioneBollo(String flagEsenzioneBollo) {
        this.flagEsenzioneBollo = flagEsenzioneBollo;
    }

    public String getFlagEsenzioneImposta() {
        return flagEsenzioneImposta;
    }

    public void setFlagEsenzioneImposta(String flagEsenzioneImposta) {
        this.flagEsenzioneImposta = flagEsenzioneImposta;
    }

    public String getFlagMandatoIncasso() {
        return flagMandatoIncasso;
    }

    public void setFlagMandatoIncasso(String flagMandatoIncasso) {
        this.flagMandatoIncasso = flagMandatoIncasso;
    }

    public String getFlagPep() {
        return flagPep;
    }

    public void setFlagPep(String flagPep) {
        this.flagPep = flagPep;
    }

    public String getRuoloPep() {
        return ruoloPep;
    }

    public void setRuoloPep(String ruoloPep) {
        this.ruoloPep = ruoloPep;
    }

    public String getTipoFonteReddito() {
        return tipoFonteReddito;
    }

    public void setTipoFonteReddito(String tipoFonteReddito) {
        this.tipoFonteReddito = tipoFonteReddito;
    }

    public String getDenFonteReddito() {
        return denFonteReddito;
    }

    public void setDenFonteReddito(String denFonteReddito) {
        this.denFonteReddito = denFonteReddito;
    }

    public String getCodPubblicoUfficiale() {
        return codPubblicoUfficiale;
    }

    public void setCodPubblicoUfficiale(String codPubblicoUfficiale) {
        this.codPubblicoUfficiale = codPubblicoUfficiale;
    }

    public String getCodNazioneIstatAttivita() {
        return codNazioneIstatAttivita;
    }

    public void setCodNazioneIstatAttivita(String codNazioneIstatAttivita) {
        this.codNazioneIstatAttivita = codNazioneIstatAttivita;
    }

    public String getFlagPrivacy3() {
        return flagPrivacy3;
    }

    public void setFlagPrivacy3(String flagPrivacy3) {
        this.flagPrivacy3 = flagPrivacy3;
    }

    public String getCodAteco() {
        return codAteco;
    }

    public void setCodAteco(String codAteco) {
        this.codAteco = codAteco;
    }

    public String getCodCompagnia() {
        return codCompagnia;
    }

    public void setCodCompagnia(String codCompagnia) {
        this.codCompagnia = codCompagnia;
    }

    public String getTipoResidenzaFiscale() {
        return tipoResidenzaFiscale;
    }

    public void setTipoResidenzaFiscale(String tipoResidenzaFiscale) {
        this.tipoResidenzaFiscale = tipoResidenzaFiscale;
    }

    public Double getImpRating() {
        return impRating;
    }

    public void setImpRating(Double impRating) {
        this.impRating = impRating;
    }

    public Integer getTokenNominativoRif() {
        return tokenNominativoRif;
    }

    public void setTokenNominativoRif(Integer tokenNominativoRif) {
        this.tokenNominativoRif = tokenNominativoRif;
    }

    public String getCodNazioneCittadinanza2() {
        return codNazioneCittadinanza2;
    }

    public void setCodNazioneCittadinanza2(String codNazioneCittadinanza2) {
        this.codNazioneCittadinanza2 = codNazioneCittadinanza2;
    }

    public String getDenEnteRegistrazione() {
        return denEnteRegistrazione;
    }

    public void setDenEnteRegistrazione(String denEnteRegistrazione) {
        this.denEnteRegistrazione = denEnteRegistrazione;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getFlagAvcScaduto() {
        return flagAvcScaduto;
    }

    public void setFlagAvcScaduto(String flagAvcScaduto) {
        this.flagAvcScaduto = flagAvcScaduto;
    }

    public String getFlagDocumentScaduto() {
        return flagDocumentScaduto;
    }

    public void setFlagDocumentScaduto(String flagDocumentScaduto) {
        this.flagDocumentScaduto = flagDocumentScaduto;
    }

    public LocalDateTime getDataAvcScaduto() {
        return dataAvcScaduto;
    }

    public void setDataAvcScaduto(LocalDateTime dataAvcScaduto) {
        this.dataAvcScaduto = dataAvcScaduto;
    }

    public String getFlagFiduciaria() {
        return flagFiduciaria;
    }

    public void setFlagFiduciaria(String flagFiduciaria) {
        this.flagFiduciaria = flagFiduciaria;
    }

    public Integer getIdNominativoEsterno() {
        return idNominativoEsterno;
    }

    public void setIdNominativoEsterno(Integer idNominativoEsterno) {
        this.idNominativoEsterno = idNominativoEsterno;
    }

    public String getStatoAvc() {
        return statoAvc;
    }

    public void setStatoAvc(String statoAvc) {
        this.statoAvc = statoAvc;
    }

    public String getAnzianitaContribAl_2007() {
        return anzianitaContribAl_2007;
    }

    public void setAnzianitaContribAl_2007(String anzianitaContribAl_2007) {
        this.anzianitaContribAl_2007 = anzianitaContribAl_2007;
    }

    public String getCodNazioneDomFisc() {
        return codNazioneDomFisc;
    }

    public void setCodNazioneDomFisc(String codNazioneDomFisc) {
        this.codNazioneDomFisc = codNazioneDomFisc;
    }

    public String getFlagFiduciariaExtraGruppo() {
        return flagFiduciariaExtraGruppo;
    }

    public void setFlagFiduciariaExtraGruppo(String flagFiduciariaExtraGruppo) {
        this.flagFiduciariaExtraGruppo = flagFiduciariaExtraGruppo;
    }

    public String getTipoIntermediario() {
        return tipoIntermediario;
    }

    public void setTipoIntermediario(String tipoIntermediario) {
        this.tipoIntermediario = tipoIntermediario;
    }

    public LocalDateTime getDataInizioMandato() {
        return dataInizioMandato;
    }

    public void setDataInizioMandato(LocalDateTime dataInizioMandato) {
        this.dataInizioMandato = dataInizioMandato;
    }

    public LocalDateTime getDataFineMandato() {
        return dataFineMandato;
    }

    public void setDataFineMandato(LocalDateTime dataFineMandato) {
        this.dataFineMandato = dataFineMandato;
    }

    public String getCodOrarioLavoro() {
        return codOrarioLavoro;
    }

    public void setCodOrarioLavoro(String codOrarioLavoro) {
        this.codOrarioLavoro = codOrarioLavoro;
    }

    public Double getImpStipendio() {
        return impStipendio;
    }

    public void setImpStipendio(Double impStipendio) {
        this.impStipendio = impStipendio;
    }

    public String getCodNazioneCostituzione() {
        return codNazioneCostituzione;
    }

    public void setCodNazioneCostituzione(String codNazioneCostituzione) {
        this.codNazioneCostituzione = codNazioneCostituzione;
    }

    public String getDenComuneCostituzione() {
        return denComuneCostituzione;
    }

    public void setDenComuneCostituzione(String denComuneCostituzione) {
        this.denComuneCostituzione = denComuneCostituzione;
    }

    public String getFlagDomicilioResidenza() {
        return flagDomicilioResidenza;
    }

    public void setFlagDomicilioResidenza(String flagDomicilioResidenza) {
        this.flagDomicilioResidenza = flagDomicilioResidenza;
    }

    public String getCodSigedisWap() {
        return codSigedisWap;
    }

    public void setCodSigedisWap(String codSigedisWap) {
        this.codSigedisWap = codSigedisWap;
    }

    public String getCodSigedisAwap() {
        return codSigedisAwap;
    }

    public void setCodSigedisAwap(String codSigedisAwap) {
        this.codSigedisAwap = codSigedisAwap;
    }

    public String getFlagPubblicoUfficiale() {
        return flagPubblicoUfficiale;
    }

    public void setFlagPubblicoUfficiale(String flagPubblicoUfficiale) {
        this.flagPubblicoUfficiale = flagPubblicoUfficiale;
    }

    public String getFlagPrivacy4() {
        return flagPrivacy4;
    }

    public void setFlagPrivacy4(String flagPrivacy4) {
        this.flagPrivacy4 = flagPrivacy4;
    }

    public String getFlagPrivacy5() {
        return flagPrivacy5;
    }

    public void setFlagPrivacy5(String flagPrivacy5) {
        this.flagPrivacy5 = flagPrivacy5;
    }

    public String getCodOffuscamento() {
        return codOffuscamento;
    }

    public void setCodOffuscamento(String codOffuscamento) {
        this.codOffuscamento = codOffuscamento;
    }

    public String getTipoCarichePubbliche() {
        return tipoCarichePubbliche;
    }

    public void setTipoCarichePubbliche(String tipoCarichePubbliche) {
        this.tipoCarichePubbliche = tipoCarichePubbliche;
    }

    public String getTipologiaAttivitaEcoPreced() {
        return tipologiaAttivitaEcoPreced;
    }

    public void setTipologiaAttivitaEcoPreced(String tipologiaAttivitaEcoPreced) {
        this.tipologiaAttivitaEcoPreced = tipologiaAttivitaEcoPreced;
    }

    public String getCodProvAttPrevalenteIstat() {
        return codProvAttPrevalenteIstat;
    }

    public void setCodProvAttPrevalenteIstat(String codProvAttPrevalenteIstat) {
        this.codProvAttPrevalenteIstat = codProvAttPrevalenteIstat;
    }

    public String getCodPaeseAttPrevalente() {
        return codPaeseAttPrevalente;
    }

    public void setCodPaeseAttPrevalente(String codPaeseAttPrevalente) {
        this.codPaeseAttPrevalente = codPaeseAttPrevalente;
    }

    public String getTipoPatrimonioComplessivo() {
        return tipoPatrimonioComplessivo;
    }

    public void setTipoPatrimonioComplessivo(String tipoPatrimonioComplessivo) {
        this.tipoPatrimonioComplessivo = tipoPatrimonioComplessivo;
    }

    public String getCodPaeseEstRelComm1() {
        return codPaeseEstRelComm1;
    }

    public void setCodPaeseEstRelComm1(String codPaeseEstRelComm1) {
        this.codPaeseEstRelComm1 = codPaeseEstRelComm1;
    }

    public String getCodPaeseEstRelComm2() {
        return codPaeseEstRelComm2;
    }

    public void setCodPaeseEstRelComm2(String codPaeseEstRelComm2) {
        this.codPaeseEstRelComm2 = codPaeseEstRelComm2;
    }

    public String getCodPaeseEstRelComm3() {
        return codPaeseEstRelComm3;
    }

    public void setCodPaeseEstRelComm3(String codPaeseEstRelComm3) {
        this.codPaeseEstRelComm3 = codPaeseEstRelComm3;
    }

    public String getDescAttivitaNonProfit() {
        return descAttivitaNonProfit;
    }

    public void setDescAttivitaNonProfit(String descAttivitaNonProfit) {
        this.descAttivitaNonProfit = descAttivitaNonProfit;
    }

    public String getTipoFasciaReddito() {
        return tipoFasciaReddito;
    }

    public void setTipoFasciaReddito(String tipoFasciaReddito) {
        this.tipoFasciaReddito = tipoFasciaReddito;
    }

    public Double getImpMassimale() {
        return impMassimale;
    }

    public void setImpMassimale(Double impMassimale) {
        this.impMassimale = impMassimale;
    }

    public String getCodCabNascita() {
        return codCabNascita;
    }

    public void setCodCabNascita(String codCabNascita) {
        this.codCabNascita = codCabNascita;
    }

    public String getPartnerInfo() {
        return partnerInfo;
    }

    public void setPartnerInfo(String partnerInfo) {
        this.partnerInfo = partnerInfo;
    }

    public String getCanaleInfo() {
        return canaleInfo;
    }

    public void setCanaleInfo(String canaleInfo) {
        this.canaleInfo = canaleInfo;
    }

    public String getTipoFonteDenuncia() {
        return tipoFonteDenuncia;
    }

    public void setTipoFonteDenuncia(String tipoFonteDenuncia) {
        this.tipoFonteDenuncia = tipoFonteDenuncia;
    }

    public String getDescModalitaDenuncia() {
        return descModalitaDenuncia;
    }

    public void setDescModalitaDenuncia(String descModalitaDenuncia) {
        this.descModalitaDenuncia = descModalitaDenuncia;
    }

    public LocalDateTime getDataDenunciaDecesso() {
        return dataDenunciaDecesso;
    }

    public void setDataDenunciaDecesso(LocalDateTime dataDenunciaDecesso) {
        this.dataDenunciaDecesso = dataDenunciaDecesso;
    }

    public String getCodFiscaleEstero() {
        return codFiscaleEstero;
    }

    public void setCodFiscaleEstero(String codFiscaleEstero) {
        this.codFiscaleEstero = codFiscaleEstero;
    }

    public String getFlagFinancialInstitution() {
        return flagFinancialInstitution;
    }

    public void setFlagFinancialInstitution(String flagFinancialInstitution) {
        this.flagFinancialInstitution = flagFinancialInstitution;
    }

    public String getFlagEsenzioneBolloSpeciale() {
        return flagEsenzioneBolloSpeciale;
    }

    public void setFlagEsenzioneBolloSpeciale(String flagEsenzioneBolloSpeciale) {
        this.flagEsenzioneBolloSpeciale = flagEsenzioneBolloSpeciale;
    }

    public LocalDateTime getDataQautovalUltimo() {
        return dataQautovalUltimo;
    }

    public void setDataQautovalUltimo(LocalDateTime dataQautovalUltimo) {
        this.dataQautovalUltimo = dataQautovalUltimo;
    }

    public String getCodNazionalitaUic() {
        return codNazionalitaUic;
    }

    public void setCodNazionalitaUic(String codNazionalitaUic) {
        this.codNazionalitaUic = codNazionalitaUic;
    }

    public String getCodComuneNascita() {
        return codComuneNascita;
    }

    public void setCodComuneNascita(String codComuneNascita) {
        this.codComuneNascita = codComuneNascita;
    }

    public String getIndStatoFea() {
        return indStatoFea;
    }

    public void setIndStatoFea(String indStatoFea) {
        this.indStatoFea = indStatoFea;
    }
}
