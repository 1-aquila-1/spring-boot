package com.aquila.ebd.webapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ebd/aluno")
public class AlunoController {
    
    @PostMapping
    public ResponseEntity<?> cadastro(){
        return ResponseEntity.ok("Cadastro de aluno");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(){
        return ResponseEntity.ok("Edição de aluno");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> obter(){
        return ResponseEntity.ok("Buscar aluno");
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok("Lista de alunos");
    }

}
