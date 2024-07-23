package com.TiendaMariano.tienda.dao;

import com.TiendaMariano.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoDao extends JpaRepository<Producto, Long> {

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Ejemplo de método utilizando Consultas con JPQL
    @Query(value = "SELECT a FROM Producto a where a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

    //Ejemplo de método utilizando Consultas con SQL nativo
    @Query(nativeQuery = true,
            value = "SELECT * FROM producto where producto.precio BETWEEN :precioInf AND :precioSup ORDER BY producto.descripcion ASC")
    public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

    // Nuevo método para buscar por cantidad de existencias usando JPQL
    @Query(value="SELECT a FROM Producto a WHERE a.existencias BETWEEN :existenciasMin AND :existenciasMax ORDER BY a.descripcion ASC")
    public List<Producto> findByExistenciasBetweenOrderByDescripcion(@Param("existenciasMin") int existenciasMin, @Param("existenciasMax") int existenciasMax);
    
    // Nuevo método para buscar por cantidad de existencias usando SQL nativo
    @Query(nativeQuery=true,
            value="SELECT * FROM producto WHERE producto.existencias BETWEEN :existenciasMin AND :existenciasMax ORDER BY producto.descripcion ASC")
    public List<Producto> findByExistenciasNativo(@Param("existenciasMin") int existenciasMin, @Param("existenciasMax") int existenciasMax);
}
