package com.aquila.ebd.webapi.controller;

import com.aquila.ebd.VO.MatriculaVO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ebd/matricula/aluno")
public class MatriculaAlunoController {
    
    @PostMapping
    public ResponseEntity<?> aluno(){
        return ResponseEntity.ok("Cadastro de aluno");
    }

    @PutMapping("/{id}")
    public ResponseEntity<MatriculaVO> editar(){
        return ResponseEntity.ok(new MatriculaVO());
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
