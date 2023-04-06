package it.previnet.academy.fullstack.bean.enums;

public enum TipoOperazione {
    SOTTOSCRIZIONE("0 "),
    VERS_AGG("10"),
    CONVERSIONE("2 "),
    SINISTRO("21"),
    APPENDICE_TESTO_LIBERO("AL"),
    ANN_MANC_PERF_POST("AN"),
    ATT_PEGNO("AP"),
    RIATT_PAGAMENTO_PREMI_RICORRENTI("AR"),
    ATTIVAZIONE_ADDEBITI_AUTOMATICI("AT"),
    ATT_VINCOLO("AV"),
    CORR_NEGATIVA("C-"),
    CORR_POSITIVA("C+"),
    CAMBIO_ASSICURATO("C4"),
    C_BENEFICIARI("CB"),
    C_CONTRAENTE("CC"),
    CONGUAGLIO("CG"),
    CAMBIO_LEGALE_RAPPRESENTANTE("CL"),
    COPERTURA_ASSICURATIVA("CM"),
    C_CONTO_CORRENTE("CN"),
    DISTRIBUZIONE_DIVIDENDI("DD"),
    DISATTIVAZIONE_ADDEBITI_AUTOMATICI("DI"),
    ESTINZIONE_SCUDO("ED"),
    EST_PEGNO("EP"),
    EST_VINCOLO("EV"),
    FINE_COPERTURA_ASSICURATIVA("FA"),
    LETTERA_COMUNICAZIONE_AL_CLIENTE("LE"),
    MANAGEMENT_FEES("MF"),
    MODIFICA_PIANO_VERSAMENTI("MV"),
    OPZIONI_CONTRATTUALI("OP"),
    RATA("RA"),
    RISC_PARZIALE("RP"),
    REBATE("RQ"),
    RISC_TOTALE("RT"),
    SOSP_PAGAMENTO_PREMI_RICORRENTI("SR"),
    TRASF_GRUPPO("TG"),
    TRASFERIMENTI("TR"),
    VARIAZIONE_SOGGETTO("V4"),
    VARIAZIONE_INDIRIZZO("VA"),
    CERTIFICAZIONE_CONTATTI("VM"),
    VAR_ANAGRAFICA("VN"),
    QAVC_VARIAZIONE_DATI_ANAGRAFICI("VQ");

    public final String value;

    TipoOperazione(String value) {
        this.value = value;
    }

    public static TipoOperazione lookup(String value) {
        if (value != null) {
            for (TipoOperazione t : values()) {
                if (t.value.equals(value)) {
                    return t;
                }
            }
        }

        return null;
    }
}
