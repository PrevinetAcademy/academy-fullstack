
# Campi delle tabelle SQL da mappare nelle relative _entity_ JPA

Di seguito, per ciascuna tabella, sono elencate le colonne da mappare nella relativa classe _Entity_ JPA.

### Tabella `nominativo`

    token_nominativo
    tipo_nominativo
    cod_fiscale
    cod_partita_iva
    cod_nominativo
    den_cognome
    den_nome
    tipo_sesso
    data_nascita
    cod_provincia_istat_nascita
    den_comune_nascita
    cod_nazione_cittadinanza
    desc_professione
    cod_professione
    desc_titolo
    den_nazionalita
    den_nominativo
    den_ragione_sociale
    den_ragione_sociale_breve
    tipo_forma_giuridica
    tipo_persona_giuridica
    data_timestamp
    den_login
    flag_privacy
    flag_privacy2
    flag_privacy3
    flag_privacy4
    flag_privacy5
    data_firma_privacy

___

### Tabella `recapito_nominativo`

    token_recapito_nominativo
    tipo_recapito_nominativo
    token_nominativo
    den_presso
    den_numero_civico
    cod_cap
    den_localita
    cod_provincia_istat
    cod_nazione
    den_indirizzo
    cod_casella_postale
    den_etichetta
    data_inizio
    data_fine
    cod_cab
    cod_nazione_istat
    token_nominativo_polizza
    data_timestamp
    den_login

___

### Tabella `documento_identificazione`

    token_documento_identificazion
    token_nominativo
    tipo_documento_identificazione
    cod_documento_identificazione
    data_rilascio
    den_ente_rilascio
    den_localita_rilascio
    cod_sigla_provincia_rilascio
    den_tipo_documento
    cod_nazione
    data_inizio
    data_fine
    data_timestamp
    den_login
    data_scadenza
    cod_cab_rilascio
    token_nominativo_polizza
    barcode
    content
    storage_type
    storage_url

