package br.com.aquilla.loja.dao;

import javax.persistence.EntityManager;

import br.com.aquilla.loja.model.Produto;

public class ProdutoDao {

    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto){
        this.em.persist(produto);
    }
}
