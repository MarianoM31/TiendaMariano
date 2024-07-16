package com.TiendaMariano.tienda.dao;


import com.TiendaMariano.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    
}
