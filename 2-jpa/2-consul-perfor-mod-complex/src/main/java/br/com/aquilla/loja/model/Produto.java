package br.com.aquilla.loja.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "produtos")
public class Produto {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();
	@ManyToOne(fetch = FetchType.LAZY)
	private Categoria categoria;
	@OneToMany(mappedBy = "produto")
    private List<ItemPedido> itens = new ArrayList<>();

	public void adicionarItem(ItemPedido item){
        item.setProduto(this);
        this.itens.add(item);
    }
}
