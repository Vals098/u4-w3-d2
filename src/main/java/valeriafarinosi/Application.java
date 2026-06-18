package valeriafarinosi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import valeriafarinosi.entities.dao.EventoDAO;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-d2");

    public static void main(String[] args) {

//        System.out.println("Connessione riuscita!");

        EntityManager entityManager = emf.createEntityManager();
        EventoDAO eventoDAO = new EventoDAO(entityManager);

//        Evento evento1 = new Evento("LiveAid", LocalDate.of(1985, 07, 13), "Concerto di beneficenza");
//        Evento evento2 = new Evento("Cinema all'aperto", LocalDate.of(2026, 04, 21), "Princess Mononoke");

//        SAVE
//        eventoDAO.save(evento1);
//        eventoDAO.save(evento2);

//        FINDBY
//        try {
//            Evento found = eventoDAO.getById(4);
//            System.out.println(found.getTitolo());
//        } catch (NotFoundException e) {
//            System.out.println(e.getMessage());
//        }


    }

}
