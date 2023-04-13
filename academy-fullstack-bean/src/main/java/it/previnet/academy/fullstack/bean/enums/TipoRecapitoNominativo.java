package it.previnet.academy.fullstack.bean.enums;

public enum TipoRecapitoNominativo {
    RESIDENZA("001"),
    INVIO_CORRISPONDENZA("002"),
    SEDE_LEGALE("003"),
    SEDE_AMMINISTRATIVA("004"),
    DOMICILIO("005"),
    RECAPITO_TELEFONICO("006"),
    SEDE("007");

    public final String value;

    TipoRecapitoNominativo(String value) {
        this.value = value;
    }

    public static TipoRecapitoNominativo lookup(String value) {
        if (value != null) {
            for (TipoRecapitoNominativo t : values()) {
                if (t.value.equals(value)) {
                    return t;
                }
            }
        }

        return null;
    }
}
