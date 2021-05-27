package br.com.aquilla.loja;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.aquilla.loja.dao.CategoriaDao;
import br.com.aquilla.loja.dao.ClienteDao;
import br.com.aquilla.loja.dao.PedidoDao;
import br.com.aquilla.loja.dao.ProdutoDao;
import br.com.aquilla.loja.model.Categoria;
import br.com.aquilla.loja.model.Cliente;
import br.com.aquilla.loja.model.ItemPedido;
import br.com.aquilla.loja.model.Pedido;
import br.com.aquilla.loja.model.Produto;
import br.com.aquilla.loja.util.JPAUtil;

public class CadastroPedidoTeste {
    public static void main(String[] args) {
        popularBancoDados();
		EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        PedidoDao pedidoDao = new PedidoDao(em);
        ClienteDao clienteDao = new ClienteDao(em);
        
        Produto produto = produtoDao.buscarPorId(1L);
        Cliente cliente = clienteDao.buscarPorId(1L);

        
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(new ItemPedido(10, pedido, produto));
        
        em.getTransaction().begin();
        pedidoDao.cadastrar(pedido);
        em.getTransaction().commit();
        em.close();

    }

    private static void popularBancoDados() {

        Categoria categoria = new Categoria();
        categoria.setNome("Celulares");

        Produto celular = new Produto();
        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Muito legal");
        celular.setPreco(new BigDecimal("800"));
        celular.setCategoria(categoria);

        Cliente cliente = new Cliente("Rodrigo", "123456");

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);
        ClienteDao clienteDao = new ClienteDao(em);

        em.getTransaction().begin();
        categoriaDao.cadastrar(categoria);
        produtoDao.cadastrar(celular);
        clienteDao.cadastrar(cliente);
        em.getTransaction().commit();
        em.close();
    }
}
