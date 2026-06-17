package valeriafarinosi.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {

    @Id
    @GeneratedValue
    @Column(name = "id_partecipazione")
    private UUID idPartecipazione;

    @Column(name = "stato")
    @Enumerated(EnumType.STRING)
    private StatoConferma statoConferma;


    //    creo la colonna fk che va a riferirsi alla colonna pk
//    di nome id_persona, nella classe Persona
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;

    public Partecipazione() {
    }

    public Partecipazione(StatoConferma statoConferma) {
        this.statoConferma = statoConferma;
    }

    public UUID getIdPartecipazione() {
        return idPartecipazione;
    }

    public StatoConferma getStatoConferma() {
        return statoConferma;
    }

    public Evento getEvento() {
        return evento;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "idPartecipazione=" + idPartecipazione +
                ", statoConferma=" + statoConferma +
                ", persona=" + persona +
                ", evento=" + evento +
                '}';
    }
}
