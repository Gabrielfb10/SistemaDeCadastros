package com.example.cadastrodeninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasVindas") //Decorador que cria o endpoint
    public String boasVindas(){
        return "Essa é a mensagem de boas vindas.";
    }
}
