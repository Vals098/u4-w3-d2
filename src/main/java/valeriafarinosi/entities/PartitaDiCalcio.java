package valeriafarinosi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "partite_di_calcio")
public class PartitaDiCalcio extends Evento {


    @Column(name = "squadra di casa")
    private String squadraDiCasa;

    @Column(name = "squadra_ospite")
    private String squadraOspite;

    @Column(name = "squadra_vincente")
    private String squadraVincente;

    @Column(name = "numero_gol_squadra_di_casa")
    private int numeroGolCasa;

    @Column(name = "numero_gol_squadra_ospite")
    private int numeroGolOspite;

    protected PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String squadraVincente, int numeroGolCasa, int numeroGolOspite) {
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numeroGolCasa = numeroGolCasa;
        this.numeroGolOspite = numeroGolOspite;
    }


    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public int getNumeroGolCasa() {
        return numeroGolCasa;
    }

    public int getNumeroGolOspite() {
        return numeroGolOspite;
    }


    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                ", squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numeroGolCasa=" + numeroGolCasa +
                ", numeroGolOspite=" + numeroGolOspite +
                '}';
    }
}
