package valeriafarinosi.entities;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Location {


    @OneToMany(mappedBy = "location")
    private List<Evento> eventi;
}
