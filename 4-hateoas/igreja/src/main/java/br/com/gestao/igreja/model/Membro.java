package br.com.gestao.igreja.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="membro")
public class Membro extends Entidade{
    private String nome;    
}
