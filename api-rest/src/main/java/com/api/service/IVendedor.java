package com.api.service;

import java.util.ArrayList;

import com.api.model.entity.Vendedor;
//import com.api.model.entity.DetalleVenta;

public interface IVendedor {
    // Método para guardar un cliente en la base de datos
    Vendedor save(Vendedor vendedor);

    // Método para buscar un cliente por su ID en la base de datos
    Vendedor     findById(Integer id);

    // Método para eliminar un cliente de la base de datos
    //void delete(Usuario usuario);

    // Método para obtener todos los clientes de la base de datos
    ArrayList<Vendedor> findByAll();

    // Método para obtener todos las ventas por el id del cliente de la base de datos
    //ArrayList<DetalleVenta> mostrarVentas(Integer id);
}