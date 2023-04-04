package it.previnet.academy.fullstack.bean.enums;

public enum TipoDocumentoIdentificazione {
    CARTA_IDENTITA("01"),
    PATENTE("02"),
    PASSAPORTO("03"),
    PORTO_ARMI("04"),
    TESSERA_POSTALE("05"),
    ALTRO("06"),
    TESSERA_STATALE("07"),
    ACCOLLO_MUTUO("08"),
    CERTIFICATO_IDENTITA_PERSONALE("09"),
    CARTA_DI_SOGGIORNO("10"),
    LIBRETTO_PENSIONE("11"),
    NON_RESIDENTE("12"),
    TESSERA_MINISTERIALE("13"),
    TESSERA_PUBBLICA_SICUREZZA("14"),
    VISURA_CAMERALE("15"),
    PATENTE_MOTORIZZAZIONE("16"),
    PASSAPORTO_CONSOLATO("17"),
    PASSAPORTO_STATO_ESTERO("18"),
    PATENTE_EMESSA_DA_UCO("19"),
    DOCUMENTO_IDENTITA_MINORE("20"),
    PATENTE_NAUTICA("21"),
    PATENTE_ABILITAZIONE_IMPIANTI("22"),
    TESSERA_FERROVIARIA("23"),
    CARTA_REGIONALE_SERVIZI("24"),
    TESSERINO_MINISTERO_ECONOMIA_E_FINANZE("25"),
    TESSERA_RICONOSCIMENTO("26"),
    RESIDENZA_FISCALE_LEGGE_84_05("27"),
    NON_ISCRITTO_CCIAA("28"),
    ISCRIZIONE_CAMERA_COMMERCIO("29");

    public final String value;

    TipoDocumentoIdentificazione(String value) {
        this.value = value;
    }

    public static TipoDocumentoIdentificazione lookup(String value) {
        if (value != null) {
            for (TipoDocumentoIdentificazione t : values()) {
                if (t.value.equals(value)) {
                    return t;
                }
            }
        }

        return null;
    }
}
