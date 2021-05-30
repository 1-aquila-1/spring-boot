package br.com.aquila.springdata.interfaces.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.aquila.springdata.model.UnidadeTrabalho;

public interface IUnidadeTrabalhoRepository extends CrudRepository<UnidadeTrabalho, Long> {
    
}
