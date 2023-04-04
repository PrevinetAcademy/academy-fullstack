package it.previnet.academy.fullstack.bean.enums;

public enum TipoSesso {
    GIURIDICO("G"),
    FEMMINA("F"),
    MASCHIO("M");

    public final String value;

    TipoSesso(String value) {
        this.value = value;
    }

    public static TipoSesso lookup(String value) {
        if (value != null) {
            for (TipoSesso t : values()) {
                if (t.value.equals(value)) {
                    return t;
                }
            }
        }

        return null;
    }
}
