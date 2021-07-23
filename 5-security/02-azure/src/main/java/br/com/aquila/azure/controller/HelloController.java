package br.com.aquila.azure.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("grupo1")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_grupo1')")
    public String group1(){
        return "Hello Group 1 Users";
    }

    @GetMapping("grupo2")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_grupo2')")
    public String group2(){
        return "Hello Group 2 Users";
    }
}
