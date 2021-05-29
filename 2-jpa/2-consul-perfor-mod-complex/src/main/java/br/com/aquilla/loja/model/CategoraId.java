package br.com.aquilla.loja.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class CategoraId implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nome;
    private String tipo;    
}
