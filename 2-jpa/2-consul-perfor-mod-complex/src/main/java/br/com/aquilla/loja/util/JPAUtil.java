package br.com.aquilla.loja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    
    private static EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja");
    private static EntityManager em;

    public static EntityManager getEntityManager(){
        if(em == null){
            em = FACTORY.createEntityManager();
        }
        return FACTORY.createEntityManager();
    }
}
