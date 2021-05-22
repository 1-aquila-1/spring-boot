package com.aquila.ebd.VO;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MatriculaVO implements Serializable {
    private Long id;
    private String nome;
    private Date dataNascimento;
}
