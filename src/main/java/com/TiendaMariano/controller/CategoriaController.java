package com.TiendaMariano.controller;

import com.TiendaMariano.domain.Categoria;
import com.TiendaMariano.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model) { //model: transporte de datos entre controlador y la vista
        List<Categoria> lista = categoriaService.getCategorias(false);
        model.addAttribute("categorias", lista);
        model.addAttribute("totalCategorias", lista.size());
        
        return "/categoria/listado";
    }
    
}
