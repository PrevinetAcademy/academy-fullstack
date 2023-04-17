# Campi delle _entity_ JPA da includere nei rispettivi _bean_

### Entity `NominativoEntity`

    tokenNominativo
    codFiscale
    codPartitaIva
    denCognome
    denNome
    tipoSesso
    dataNascita
    codProvinciaIstatNascita
    denComuneNascita
    codNazioneCittadinanza
    descProfessione
    descTitolo
    denNazionalita
    denNominativo
    denRagioneSociale
    denRagioneSocialeBreve
    dataTimestamp
    denLogin
    flagPrivacy
    flagPrivacy2
    flagPrivacy3
    flagPrivacy4
    dataFirmaPrivacy

___

### Entity `RecapitoNominativoEntity`

    tokenRecapitoNominativo
    tipoRecapitoNominativo
    tokenNominativo
    denPresso
    denNumeroCivico
    codCap
    denLocalita
    codProvincia
    codNazione
    denIndirizzo
    dataInizio
    dataFine
    dataTimestamp
    denLogin

___

### Entity `DocumentoIdentificazioneEntity`

    tokenDocumentoIdentificazion
    tokenNominativo
    tipoDocumentoIdentificazione
    codDocumentoIdentificazione
    dataRilascio
    denEnteRilascio
    denLocalitaRilascio
    codSiglaProvinciaRilascio
    denTipoDocumento
    codNazione
    dataInizio
    dataFine
    dataTimestamp
    denLogin
    dataScadenza
    codCabRilascio
    tokenNominativoPolizza
    barcode

