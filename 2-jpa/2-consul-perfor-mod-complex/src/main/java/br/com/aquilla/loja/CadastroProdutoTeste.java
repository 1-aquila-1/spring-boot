package br.com.aquilla.loja;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.aquilla.loja.dao.CategoriaDao;
import br.com.aquilla.loja.dao.ProdutoDao;
import br.com.aquilla.loja.model.CategoraId;
import br.com.aquilla.loja.model.Categoria;
import br.com.aquilla.loja.model.Produto;
import br.com.aquilla.loja.util.JPAUtil;

public class CadastroProdutoTeste {
    public static void main(String[] args) {
        cadastrarProduto();
        EntityManager em = JPAUtil.getEntityManager();
        var obj = em.find(Categoria.class, new CategoraId("Celulares", "xpto"));
        System.out.println(obj.getId().getNome());
        em.close();
    }

    private static void cadastrarProduto() {
        Categoria categoria = new Categoria(new CategoraId("Celulares", "xpto"));

        Produto celular = new Produto();
        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Muito legal");
        celular.setPreco(new BigDecimal("800"));
        celular.setCategoria(categoria);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();
        categoriaDao.cadastrar(categoria);
        produtoDao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}