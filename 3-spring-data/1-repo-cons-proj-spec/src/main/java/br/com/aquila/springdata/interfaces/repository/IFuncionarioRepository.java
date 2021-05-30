package br.com.aquila.springdata.interfaces.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.aquila.springdata.model.Funcionario;

public interface IFuncionarioRepository extends CrudRepository<Funcionario, Long>{
    
}
