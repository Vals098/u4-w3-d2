package valeriafarinosi;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static void main(String[] args) {
        
        EntityManagerFactory emf =

                Persistence.createEntityManagerFactory("u4-w3-d2");

        System.out.println("Connessione riuscita!");

        emf.close();

    }

}
