package valeriafarinosi.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue
    @Column(name = "id_location")
    private UUID idLocation;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "citta", length = 50)
    private String citta;

    @OneToMany(mappedBy = "location")
    private List<Evento> eventi;

    public Location() {
    }

    public Location(String nome, String citta) {
        this.nome = nome;
        this.citta = citta;
    }

    public UUID getIdLocation() {
        return idLocation;
    }

    public String getNome() {
        return nome;
    }

    public String getCitta() {
        return citta;
    }

    public List<Evento> getEventi() {
        return eventi;
    }


    @Override
    public String toString() {
        return "Location{" +
                "idLocation=" + idLocation +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                ", eventi=" + eventi +
                '}';
    }
}
