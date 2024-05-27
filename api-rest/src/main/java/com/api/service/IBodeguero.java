package com.api.service;

import java.util.ArrayList;

import com.api.model.entity.Bodeguero;
//import com.api.model.entity.DetalleVenta;

public interface IBodeguero {
    // Método para guardar un cliente en la base de datos
    Bodeguero save(Bodeguero bodeguero);

    // Método para buscar un cliente por su ID en la base de datos
    Bodeguero findById(Integer id);

    // Método para eliminar un cliente de la base de datos
    //void delete(Usuario usuario);

    // Método para obtener todos los clientes de la base de datos
    ArrayList<Bodeguero> findByAll();

    // Método para obtener todos las ventas por el id del cliente de la base de datos
    //ArrayList<DetalleVenta> mostrarVentas(Integer id);
}