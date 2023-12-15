package com.mateo.chat.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CoffeeController {

    @RequestMapping("/coffe")
    public String coffee(Model m){
        m.addAttribute("developer", "Mateo Rodriguez");
        return "coffe";
    };
}
