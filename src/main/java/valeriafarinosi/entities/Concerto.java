package valeriafarinosi.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "concerti")
public class Concerto extends Evento {

    @Column(name = "genere")
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name = "in_streaming")
    private boolean inStreaming;

    protected Concerto() {
    }

    public Concerto(Genre genre, boolean inStreaming) {
        this.genre = genre;
        this.inStreaming = inStreaming;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genre=" + genre +
                ", inStreaming=" + inStreaming +
                '}';
    }
}
