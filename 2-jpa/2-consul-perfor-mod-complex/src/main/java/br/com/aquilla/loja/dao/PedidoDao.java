package br.com.aquilla.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.aquilla.loja.model.Pedido;
import br.com.aquilla.loja.vo.RelatorioVendaVO;

public class PedidoDao {

    private EntityManager em;

    public PedidoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pedido pedido){
        this.em.persist(pedido);
    }

    public BigDecimal valorTotalPedido(){
        String jpql = "select sum(p.valorTotal) from Pedido p";
        return em.createQuery(jpql, BigDecimal.class).getSingleResult();
    }

    public List<RelatorioVendaVO> relatorioVendas(){
        String jpql = "select"
        .concat(" new br.com.aquilla.loja.vo.RelatorioVendaVO(produto.nome, sum(item.quantidade), max(pedido.data))")
        .concat(" from Pedido pedido")
        .concat(" join pedido.itens item")
        .concat(" join item.produto produto")
        .concat(" group by produto.nome")
        .concat(" order by item.quantidade desc");
        return em.createQuery(jpql, RelatorioVendaVO.class).getResultList();
    }

    public Pedido buscarPedidoCliente(Long id){
        return em.createQuery(
            "select p from Pedido p join fetch p.cliente where p.id = :id", 
            Pedido.class)
            .setParameter("id", id).getSingleResult();
    }
}
