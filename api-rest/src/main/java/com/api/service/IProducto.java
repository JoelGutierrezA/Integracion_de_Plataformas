package com.api.service;

import java.util.ArrayList;

import com.api.model.entity.Producto;

public interface IProducto {
    // Método para guardar un cliente en la base de datos
    Producto save(Producto producto);

    // Método para buscar un cliente por su ID en la base de datos
    Producto findById(Integer id);

    // Método para eliminar un cliente de la base de datos
    void delete(Producto producto);

    // Método para obtener todos los clientes de la base de datos
    ArrayList<Producto> findByAll();

}