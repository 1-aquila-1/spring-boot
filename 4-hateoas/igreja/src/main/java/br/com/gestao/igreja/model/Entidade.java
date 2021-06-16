package br.com.gestao.igreja.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
}
