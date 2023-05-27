package com.example.AtividadeMVC.controller;

import com.example.AtividadeMVC.models.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animais")
public class AnimalController {
    private List<Animal> animais = new ArrayList<>();

    public AnimalController() {
        animais.add(new Animal("gato","rajado amarelo",true,18));
        animais.add(new Animal("cachorro","caramelo",true,15));
        animais.add(new Animal("calopsita","amarelo",false,20));
        animais.add(new Animal("cágado","verde",false,30));
    }
    @GetMapping
    public String animais(Model model){
        model.addAttribute("animais",animais);
        return "Animais";
    }
}
