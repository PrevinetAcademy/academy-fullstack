package it.previnet.academy.fullstack.model;

import it.previnet.academy.fullstack.model.enums.StatoEntity;

import javax.persistence.*;

@Entity
@Table(name = "example")
public class ExampleEntity {

    @Id
    @SequenceGenerator(name = "tokenApplicazioneGenerator", sequenceName = "applicazione_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tokenApplicazioneGenerator")
    @Column(name = "token_applicazione", nullable = false)
    private Long token;

    @Enumerated(EnumType.STRING)
    @Column(name = "stato", nullable = false, length = 255)
    private StatoEntity stato;

    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }

    public StatoEntity getStato() {
        return stato;
    }

    public void setStato(StatoEntity stato) {
        this.stato = stato;
    }


}
