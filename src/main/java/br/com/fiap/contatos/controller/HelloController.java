package br.com.fiap.contatos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello World!</h1>";
    }
    @GetMapping("/ola")
    public String ola(){
        return "<h1>Olá Mundo!</h1>";
    }
}
