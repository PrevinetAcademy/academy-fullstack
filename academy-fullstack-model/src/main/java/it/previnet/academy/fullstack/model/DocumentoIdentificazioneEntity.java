package it.previnet.academy.fullstack.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "documento_identificazione")
public class DocumentoIdentificazioneEntity {
    @Id
    @SequenceGenerator(name = "tokenDocumentoIdentificazioneGenerator", sequenceName = "documento_identificazione_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tokenDocumentoIdentificazioneGenerator")
    @Column(name = "token_documento_identificazion", nullable = false)
    private Integer tokenDocumentoIdentificazion;

    @Column(name = "tipo_documento_identificazione", length = 2)
    private String tipoDocumentoIdentificazione;

    @Column(name = "cod_documento_identificazione", length = 20)
    private String codDocumentoIdentificazione;

    @Column(name = "data_rilascio")
    private LocalDateTime dataRilascio;

    @Column(name = "den_ente_rilascio", length = 80)
    private String denEnteRilascio;

    @Column(name = "den_localita_rilascio", length = 80)
    private String denLocalitaRilascio;

    @Column(name = "cod_sigla_provincia_rilascio", length = 3)
    private String codSiglaProvinciaRilascio;

    @Column(name = "den_tipo_documento", length = 80)
    private String denTipoDocumento;

    @Column(name = "cod_nazione", length = 3)
    private String codNazione;

    @Column(name = "data_inizio")
    private LocalDateTime dataInizio;

    @Column(name = "data_fine")
    private LocalDateTime dataFine;

    @Column(name = "data_timestamp")
    private LocalDateTime dataTimestamp;

    @Column(name = "den_login", length = 80)
    private String denLogin;

    @Column(name = "data_scadenza")
    private LocalDateTime dataScadenza;

    @Column(name = "cod_cab_rilascio", length = 6)
    private String codCabRilascio;

    @Column(name = "token_nominativo_polizza")
    private Integer tokenNominativoPolizza;

    @Column(name = "barcode", length = 40)
    private String barcode;

    @Column(name = "content")
    private byte[] content;

    @Column(name = "storage_type", length = 2)
    private String storageType;

    @Column(name = "storage_url", length = 255)
    private String storageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "token_nominativo")
    private NominativoEntity nominativo;

    public Integer getTokenDocumentoIdentificazion() {
        return tokenDocumentoIdentificazion;
    }

    public void setTokenDocumentoIdentificazion(Integer tokenDocumentoIdentificazion) {
        this.tokenDocumentoIdentificazion = tokenDocumentoIdentificazion;
    }

    public String getTipoDocumentoIdentificazione() {
        return tipoDocumentoIdentificazione;
    }

    public void setTipoDocumentoIdentificazione(String tipoDocumentoIdentificazione) {
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

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getStorageUrl() {
        return storageUrl;
    }

    public void setStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public NominativoEntity getNominativo() {
        return nominativo;
    }

    public void setNominativo(NominativoEntity nominativo) {
        this.nominativo = nominativo;
    }
}
