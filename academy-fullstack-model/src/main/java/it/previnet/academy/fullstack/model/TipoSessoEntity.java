package it.previnet.academy.fullstack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_sesso")
public class TipoSessoEntity {

    @Id
    @Column(name = "tipo_sesso", length = 1)
    private String tipoSesso;

    @Column(name = "den_sesso", length = 80)
    private String denSesso;

    public String getTipoSesso() {
        return tipoSesso;
    }

    public void setTipoSesso(String tipoSesso) {
        this.tipoSesso = tipoSesso;
    }

    public String getDenSesso() {
        return denSesso;
    }

    public void setDenSesso(String denSesso) {
        this.denSesso = denSesso;
    }
}