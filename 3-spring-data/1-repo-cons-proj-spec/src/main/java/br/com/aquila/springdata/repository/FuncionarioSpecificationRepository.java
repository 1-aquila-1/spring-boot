package br.com.aquila.springdata.repository;

import org.springframework.data.jpa.domain.Specification;

import br.com.aquila.springdata.model.Funcionario;

public class FuncionarioSpecificationRepository {
    
    public static Specification<Funcionario> nome(String nome){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
    }

    public static Specification<Funcionario> cpf(String cpf){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("cpf"), cpf);
    }

    public static Specification<Funcionario> salario(Double salario){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("cpf"), salario);
    }
}
