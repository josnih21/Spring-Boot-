package com.demo.cursoSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerU {
    @GetMapping("/")
    public String welcomePage(@RequestParam(value = "name", required = false, defaultValue = "Pepe") String name , Model model){
        model.addAttribute("nombre",name);
        return "template";
    }

    @GetMapping("/saludo")
    public String saludo(Model model){
        model.addAttribute("saludo","Hola, soy otra pagina de saludo");
        return "saludo";
    }
}
