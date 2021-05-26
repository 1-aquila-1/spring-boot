package br.com.aquilla.loja.dao;

import javax.persistence.EntityManager;

import br.com.aquilla.loja.model.Categoria;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria produto){
        this.em.persist(produto);
    }
}
