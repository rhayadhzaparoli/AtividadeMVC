package com.example.AtividadeMVC.controller;

import com.example.AtividadeMVC.models.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class ApiController {
    private List<Animal> animais = new ArrayList<>();

    public ApiController() {
        animais.add(new Animal("gato","rajado amarelo",true,18));
        animais.add(new Animal("cachorro","caramelo",true,15));
        animais.add(new Animal("calopsita","amarelo",false,20));
        animais.add(new Animal("cágado","verde",false,30));
    }
    @GetMapping
    public List<Animal> apiAnimais(){
        return animais;
    }
}
