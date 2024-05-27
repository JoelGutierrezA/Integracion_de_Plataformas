package com.api.service;

import java.util.ArrayList;

import com.api.model.entity.Administrador;
//import com.api.model.entity.DetalleVenta;

public interface IAdministrador {
    // Método para guardar un cliente en la base de datos
    Administrador save(Administrador administrador);

    // Método para buscar un cliente por su ID en la base de datos
    Administrador findById(Integer id);

    // Método para eliminar un cliente de la base de datos
    //void delete(Usuario usuario);

    // Método para obtener todos los clientes de la base de datos
    ArrayList<Administrador> findByAll();

    // Método para obtener todos las ventas por el id del cliente de la base de datos
    //ArrayList<DetalleVenta> mostrarVentas(Integer id);
}