package valeriafarinosi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persone")
public class Persona {

    @Id
    @GeneratedValue
    @Column(name = "id_persona")
    private UUID idPersona;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "email")
    private String email;

    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;

    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    //    OneToMany = una persona, tante partecipazioni
    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> partecipazioni;

    @OneToMany(mappedBy = "vincitore")
    private List<GaraDiAtletica> gareDiAtletica;

    public Persona() {
    }

    public Persona(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public UUID getIdPersona() {
        return idPersona;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", sesso=" + sesso +
                '}';
    }
}
