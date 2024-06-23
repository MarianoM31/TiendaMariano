package com.TiendaMariano.dao;

import com.TiendaMariano.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
}
