package valeriafarinosi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import valeriafarinosi.entities.Evento;
import valeriafarinosi.entities.dao.EventoDAO;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-d2");

    public static void main(String[] args) {

//        System.out.println("Connessione riuscita!");

        EntityManager entityManager = emf.createEntityManager();
        EventoDAO eventoDAO = new EventoDAO(entityManager);

        Evento evento1 = new Evento("LiveAid", LocalDate.of(1985, 07, 13), "Concerto di beneficenza");
        Evento evento2 = new Evento("Cinema all'aperto", LocalDate.of(2026, 04, 21), "Princess Mononoke");

//        eventoDAO.save(evento1);
//        eventoDAO.save(evento2);

    }

}
