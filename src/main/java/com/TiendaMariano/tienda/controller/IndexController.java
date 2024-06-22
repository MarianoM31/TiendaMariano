
package com.TiendaMariano.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
    @RequestMapping("/prueba")
    public String test(Model model) {
        model.addAttribute("attribute", "value");
        return "prueba";
    }
}
