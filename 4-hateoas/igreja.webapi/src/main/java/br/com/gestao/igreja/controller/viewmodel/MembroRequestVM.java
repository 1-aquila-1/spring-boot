package br.com.gestao.igreja.controller.viewmodel;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MembroRequestVM {
    @ApiModelProperty(example = "Pedro Souza", position = 1)
    private String nome;
}
