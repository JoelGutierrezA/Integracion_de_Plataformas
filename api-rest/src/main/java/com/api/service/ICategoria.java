package com.api.service;

import java.util.ArrayList;

import com.api.model.entity.Categoria;

public interface ICategoria {
    // Método para guardar un cliente en la base de datos
    Categoria save(Categoria categoria);

    // Método para buscar un cliente por su ID en la base de datos
    Categoria findById(Integer id);

    // Método para eliminar un cliente de la base de datos
    //void delete(Usuario usuario);

    // Método para obtener todos los clientes de la base de datos
    ArrayList<Categoria> findByAll();

    // Método para obtener todos las ventas por el id del cliente de la base de datos
    //ArrayList<DetalleVenta> mostrarVentas(Integer id);
}