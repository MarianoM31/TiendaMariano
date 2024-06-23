package com.TiendaMariano.service;

import com.TiendaMariano.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //metodo que obtiene una lista de categorias
    public List<Categoria> getCategorias(boolean activo);
}