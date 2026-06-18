package valeriafarinosi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "gara_di_atletica")
public class GaraDiAtletica extends Evento {

    //    una persona può vincere più partite,
//    una partita è vinta da una persona
    @ManyToOne
    @JoinColumn(name = "id_vincitore")
    private Persona vincitore;

    protected GaraDiAtletica() {
    }

    public GaraDiAtletica(Persona vincitore) {
        this.vincitore = vincitore;
    }


    public Persona getVincitore() {
        return vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                ", vincitore=" + vincitore +
                '}';
    }
}
