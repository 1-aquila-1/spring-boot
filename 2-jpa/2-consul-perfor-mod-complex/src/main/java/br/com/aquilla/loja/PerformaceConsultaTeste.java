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

public class PerformaceConsultaTeste {
    public static void main(String[] args) {
        popularBancoDados();
        EntityManager em = JPAUtil.getEntityManager();
        PedidoDao pedidoDao = new PedidoDao(em);
        var pedido = pedidoDao.buscarPedidoCliente(1L);
        em.close();
        System.out.println(pedido.getCliente().getNome());

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
        PedidoDao pedidoDao = new PedidoDao(em);

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(new ItemPedido(10, pedido, celular));
        
        
        em.getTransaction().begin();
        categoriaDao.cadastrar(categoria);
        produtoDao.cadastrar(celular);
        clienteDao.cadastrar(cliente);
        pedidoDao.cadastrar(pedido);
        em.getTransaction().commit();
    }
}
