package br.com.aquilla.loja.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "informatica")
public class Informatica extends Produto {
    private String marca;
    private String modelo;
}
