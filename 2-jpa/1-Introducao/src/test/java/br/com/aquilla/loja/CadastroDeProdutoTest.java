package br.com.aquilla.loja;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.aquilla.loja.dao.CategoriaDao;
import br.com.aquilla.loja.dao.ProdutoDao;
import br.com.aquilla.loja.model.Categoria;
import br.com.aquilla.loja.model.Produto;
import br.com.aquilla.loja.util.JPAUtil;

class CadastroDeProdutoTest {

	public static void main(String[] args) {

		Categoria categoria = new Categoria();
		categoria.setNome("Celulares");

		Produto celular = new Produto();
		celular.setNome("Xiaomi Redmi");
		celular.setDescricao("Muito legal");
		celular.setPreco(new BigDecimal("800"));
		celular.setCategoria(categoria);

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);

		em.getTransaction().begin();
		em.persist(categoria);
		em.persist(celular);
		celular.setNome("XPTO");

		em.flush();
		em.clear();
		celular = em.merge(celular);
		celular.setNome("123");

		em.flush();
		em.remove(celular);
		em.flush();
	}

}
