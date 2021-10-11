package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getConexao(){
        if(emf == null)
            emf = Persistence.createEntityManagerFactory("financeiro");

        if(em == null)
            em = emf.createEntityManager();

        return em;
    }

}
