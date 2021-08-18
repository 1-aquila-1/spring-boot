package br.com.aquila.automapper.core.jmapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Aluno {
    private Long matricula;
    private String nome;
}
