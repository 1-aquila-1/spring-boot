package br.com.gestao.igreja.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestao.igreja.controller.viewmodel.MembroRequestVM;
import br.com.gestao.igreja.controller.viewmodel.MembroResponseVM;
import br.com.gestao.igreja.interfaces.service.IMembroService;

@RestController
@RequestMapping(value = "/cadastro", produces = "application/json")
public class MembroController {

    private  IMembroService membroService;

    public MembroController(IMembroService membroService){
        this.membroService = membroService;
    }
    @PostMapping("/membro")
    public ResponseEntity<MembroResponseVM> cadastrar(@RequestBody MembroRequestVM vm){
        var obj = new MembroResponseVM();
        obj.setNome("Pedro");
        return ResponseEntity.ok(obj);
    }
}
