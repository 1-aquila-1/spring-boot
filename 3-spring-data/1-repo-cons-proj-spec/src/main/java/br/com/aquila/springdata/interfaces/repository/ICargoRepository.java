package br.com.aquila.springdata.interfaces.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.aquila.springdata.model.Cargo;

public interface ICargoRepository extends CrudRepository<Cargo, Long>{
}
