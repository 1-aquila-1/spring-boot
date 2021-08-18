package br.com.aquila.automapper.core.jmapper;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AlunoDto {
    @JMap
    private Long matricula;
    @JMap
    private String nome;
}
