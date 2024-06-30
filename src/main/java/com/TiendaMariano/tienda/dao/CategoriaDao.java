package com.TiendaMariano.tienda.dao;


import com.TiendaMariano.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
}
