package br.com.aquilla.loja.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "categorias")
public class Categoria {
    @EmbeddedId
    private CategoraId id;

    public Categoria(String nome, String tipo) {
        this.id = new CategoraId(nome, tipo);
    }
}
