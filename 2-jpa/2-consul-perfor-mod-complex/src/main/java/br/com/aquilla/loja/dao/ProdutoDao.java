package br.com.aquilla.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.aquilla.loja.model.Produto;

public class ProdutoDao {

    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

    public Produto buscarPorId(Long id) {
        return em.find(Produto.class, id);
    }

    public List<Produto> buscarTodos() {
        var jpql = "select p from Produto p";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

    public List<Produto> buscarPorNome(String nome) {
        var jpql = "select p from Produto p where p.nome = :nome";
        return em.createQuery(jpql, Produto.class).setParameter("nome", nome).getResultList();
    }

    public List<Produto> buscarPorNomeCategoria(String nome) {
        return em.createNamedQuery("Produto.produtosPorCategoria", Produto.class).setParameter("nome", nome).getResultList();
    }

    public BigDecimal buscarPrecoProdutoNome(String nome) {
        var jpql = "select p.preco from Produto p where p.nome = :nome";
        return em.createQuery(jpql, BigDecimal.class).setParameter("nome", nome).getSingleResult();
    }
    
}
