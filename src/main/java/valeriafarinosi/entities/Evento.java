package valeriafarinosi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
//annotazione che serve a collegare questa entità ad una tabella corrispondente nel DB
//se abbiamo impostato nel file persistence <property name="hibernate.hmb2ddl.auto" value="update"/> ,
//ad ogni refresh verrà prima creata e poi aggiornata la tabella corrispondente nel db.
//Gli attributi verranno mappati a colonne della tabella.

//RICORDATI di creare sempre la riga del persistence relativa alla classe
//<class>valeriafarinosi.entities.Evento</class>

@Table(name = "eventi")
public class Evento {

    @Id //OBBLIGATORIO chiave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //chiede a Postgres di autogenerare l'id add ogni inserimento,
    //inoltre rende il campo un long type

    @Column(name = "id_evento")
    private long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "data_evento")
    private LocalDate data_evento;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING) //enum default = SMALLINT
    private TipoEvento tipoEvento;

    @Column(name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecipanti;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    //Costruttore vuoto obbigatorio per tutte le entities
    public Evento() {
    }

    public Evento(String titolo, LocalDate data_evento, String descrizione) {
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }


    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
