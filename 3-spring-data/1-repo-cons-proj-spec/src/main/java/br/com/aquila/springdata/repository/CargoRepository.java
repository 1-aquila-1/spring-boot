package br.com.aquila.springdata.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.aquila.springdata.model.Cargo;

public interface CargoRepository extends CrudRepository<Cargo, Long>{
    
}
