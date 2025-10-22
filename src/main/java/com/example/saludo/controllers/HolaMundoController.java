package com.example.saludo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/")
    public String saludo(){
        return "Hola mundo desde SpringBoot!!";
    }
}
