package it.previnet.academy.fullstack.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_documento_identificazione")
public class TipoDocumentoIdentificazioneEntity {

    @Id
    @Column(name = "tipo_documento_identificazione", length = 2)
    private String tipoDocumentoIdentificazione;

    @Column(name = "den_documento_identificazione", length = 80)
    private String denDocumentoIdentificazione;

    public String getTipoDocumentoIdentificazione() {
        return tipoDocumentoIdentificazione;
    }

    public void setTipoDocumentoIdentificazione(String tipoDocumentoIdentificazione) {
        this.tipoDocumentoIdentificazione = tipoDocumentoIdentificazione;
    }

    public String getDenDocumentoIdentificazione() {
        return denDocumentoIdentificazione;
    }

    public void setDenDocumentoIdentificazione(String denDocumentoIdentificazione) {
        this.denDocumentoIdentificazione = denDocumentoIdentificazione;
    }
}
