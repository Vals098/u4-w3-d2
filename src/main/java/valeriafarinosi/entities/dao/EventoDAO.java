package valeriafarinosi.entities.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import valeriafarinosi.entities.Evento;
import valeriafarinosi.exceptions.NotFoundException;

public class EventoDAO {
    //Data Access Object = classe che servirá per raggruppare medoti semplici da poter usare nel main
    //in modo da rendere quest ultimo più leggibile

    private final EntityManager entityManager;

    //l'EM è l'oggetto che consente di salvare, cancellare, leggere e sincronizzarsi conil DB.
    // questo viene creato nel main e viene poi passato come parametro del costruttore del DAO,
    //così da averlo comodamente a disposizione per ogni metodo che implementeremo.

    public EventoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //    SAVE
    public void save(Evento newEvento) {
        //    ogni volta che avremo bisogno di modificare il DB, l'EM esigerà una transazione
        //1. Creiamo una transazione:
        EntityTransaction transaction = this.entityManager.getTransaction();

        //2. Facciamo partire la transizione
        transaction.begin();

        //3. Rendiamo il nuovo oggetto MANAGED, effettuando un'operazione di PERSIST,
        // e aggiungendolo alla lista degli oggetti monitorati (PersistenceContext).
        // A questo punto l'oggetto fa ancora parte del DB

        this.entityManager.persist(newEvento);

        //4. Sincronizziamo il PersistenceContext con il DB tramite COMMIT
        // Se nel PC c'è un oggetto nuovo, verrà creata una nuova riga nella tabella eventi
        transaction.commit();

        //5. Log di avvenuto salvataggio
        System.out.println("L'evento " + newEvento + " è stato salvato correttamente nel DB!");

    }

    // GETBYID
    public Evento getById(long id) {
        Evento fromDB = this.entityManager.find(Evento.class, id);
        if (fromDB == null) throw new NotFoundException();
        return fromDB;
    }

    // DELETE
    public void findByIdAndDelete(long id) {
        //1. Cerchiamo l'evento tramite ricerca id
        Evento fromDB = this.getById();


    }


}
