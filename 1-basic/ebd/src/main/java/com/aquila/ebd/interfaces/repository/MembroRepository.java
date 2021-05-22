package com.aquila.ebd.interfaces.repository;

import com.aquila.ebd.entity.Membro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<Membro, Long>{
    
}
