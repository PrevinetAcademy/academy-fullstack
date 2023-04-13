package it.previnet.academy.fullstack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_recapito_nominativo")
public class TipoRecapitoNominativoEntity {

    @Id
    @Column(name = "tipo_recapito_nominativo", length = 3)
    private String tipoRecapitoNominativo;

    @Column(name = "den_recapito_nominativo", length = 80)
    private String denRecapitoNominativo;

    public String getTipoRecapitoNominativo() {
        return tipoRecapitoNominativo;
    }

    public void setTipoRecapitoNominativo(String tipoRecapitoNominativo) {
        this.tipoRecapitoNominativo = tipoRecapitoNominativo;
    }

    public String getDenRecapitoNominativo() {
        return denRecapitoNominativo;
    }

    public void setDenRecapitoNominativo(String denRecapitoNominativo) {
        this.denRecapitoNominativo = denRecapitoNominativo;
    }
}
