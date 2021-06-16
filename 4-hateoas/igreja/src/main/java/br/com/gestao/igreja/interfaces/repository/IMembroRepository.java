package br.com.gestao.igreja.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestao.igreja.model.Membro;

public interface IMembroRepository extends JpaRepository<Membro, Long>{
    
}
