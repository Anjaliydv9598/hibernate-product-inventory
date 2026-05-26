import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveProduct {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("java");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        Product p = new Product( 1, 
        		"Maggie", 15d, 2, "Instant Noodles" , "Nestle" , "Quick and tasty instant noodles, ready in 2 minutes" ,true , LocalDate.of(2026, 4, 10), LocalDateTime.of(2026, 5, 26, 13, 45) );
        
       
        et.begin();

//        em.persist(p);
        em.merge(p);
        et.commit();

        System.out.println("Product Saved Successfully");

        em.close();
        emf.close();
    }
}