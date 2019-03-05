/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviko3_u1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.text.html.HTML;

/**
 *
 * @author Eduardo Martinez
 */
public class Cviko3_U1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("p1");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Osoba> all = em.createNamedQuery("Osoba.findAll",Osoba.class);
        for (Osoba os : all.getResultList()){
            System.out.println(os.toString());
        }
        
        TypedQuery<Osoba> findByMeno = em.createNamedQuery("Osoba.findByMeno",Osoba.class);
        findByMeno.setParameter("meno","Fero");
        System.out.println(findByMeno.getResultList());
        
        TypedQuery<Osoba> findNoVaha = em.createNamedQuery("Osoba.findWithoutVaha",Osoba.class);
        for (Osoba os : findNoVaha.getResultList()){
          System.out.println(os.toString());
        }
    }
    
}
