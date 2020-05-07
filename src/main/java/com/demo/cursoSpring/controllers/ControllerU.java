package com.demo.cursoSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerU {
    @GetMapping("/")
    public String welcomePage(Model model){
        model.addAttribute("mensaje","¡hola!");
        return "template";
    }

    @GetMapping("/saludo")
    public String saludo(Model model){
        model.addAttribute("saludo","Hola, soy otra pagina de saludo");
        return "saludo";
    }
}
