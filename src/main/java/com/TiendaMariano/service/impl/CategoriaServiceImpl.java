package com.TiendaMariano.service.impl;

import com.TiendaMariano.domain.Categoria;
import com.TiendaMariano.service.CategoriaService;
import com.TiendaMariano.dao.CategoriaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    
    @Autowired
    private CategoriaDao categoriaDao;
            
    @Override
    public List<Categoria> getCategorias(boolean activo) {
        List<Categoria> lista = categoriaDao.findAll();
        
        //filtrar en caso de querer solo activos
        if (activo){
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }
    
}

