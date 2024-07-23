package com.TiendaMariano.tienda.service.impl;

import com.TiendaMariano.tienda.dao.ProductoDao;
import com.TiendaMariano.tienda.domain.Producto;
import com.TiendaMariano.tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true) //permite controlar la transaccionalidad de los metodos, una transaccion en BD lo q hace es asegurarse que se permitan todas las transacciones
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup) {
        return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> metodoJPQL(double precioInf, double precioSup) {
        return productoDao.metodoJPQL(precioInf, precioSup);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> metodoNativo(double precioInf, double precioSup) {
        return productoDao.metodoNativo(precioInf, precioSup);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findByExistenciasBetweenOrderByDescripcion(int existenciasMin, int existenciasMax) {
        return productoDao.findByExistenciasBetweenOrderByDescripcion(existenciasMin, existenciasMax);
    }
    
    // Implementación del nuevo método para buscar por cantidad de existencias usando SQL nativo
    @Override
    @Transactional(readOnly = true)
    public List<Producto> findByExistenciasNativo(int existenciasMin, int existenciasMax) {
        return productoDao.findByExistenciasNativo(existenciasMin, existenciasMax);
    }
}