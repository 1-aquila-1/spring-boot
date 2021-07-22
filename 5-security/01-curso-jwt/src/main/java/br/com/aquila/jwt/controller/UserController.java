package br.com.aquila.jwt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aquila.jwt.data.UserData;
import br.com.aquila.jwt.service.UserDetailsServiceImpl;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userService;

    public UserController(UserDetailsServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/all-users")
    public List<UserData> listAllUsers(){
        return userService.listUsers();
    }
}
