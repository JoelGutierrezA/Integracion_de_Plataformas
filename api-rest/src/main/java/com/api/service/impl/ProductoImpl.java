package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.ProductoDao;
import com.api.model.entity.Producto;
import com.api.service.IProducto;

@Service
public class ProductoImpl implements IProducto {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private ProductoDao productoDao;

    // Método para guardar un cliente en la base de datos
    //@Transactional
    //@Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Producto findById(Integer id) {
        return productoDao.findById(id).orElse(null);
    }

    // Método para eliminar un cliente de la base de datos
    @Transactional
    @Override
    public void delete(Producto producto) {
    productoDao.delete(producto);
    }

    // Método para obtener todos los clientes de la base de datos
    @Transactional(readOnly = true)
    @Override
    public ArrayList<Producto> findByAll() {
        return (ArrayList<Producto>) productoDao.findAll();
    }
}