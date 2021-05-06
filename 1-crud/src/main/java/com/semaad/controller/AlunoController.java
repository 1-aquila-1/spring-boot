package com.semaad.controller;

import java.util.Arrays;
import java.util.List;

import com.semaad.controller.dto.AlunoDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/aluno")
public class AlunoController {
    
    @GetMapping
    public ResponseEntity<List<AlunoDTO>> todos(){
        return ResponseEntity.ok(Arrays.asList( new AlunoDTO(1L, "teste")));
    }
}
