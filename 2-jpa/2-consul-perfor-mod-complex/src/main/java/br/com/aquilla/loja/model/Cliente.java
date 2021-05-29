package br.com.aquilla.loja.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @Embedded
    private DadoPessoal dadosPessoais;
}
