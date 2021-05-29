package br.com.aquilla.loja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "livro")
public class Livro extends Produto{
    private String autor;
    @Column(name = "numero_pagina")
    private Integer numeroDePagina;
}
