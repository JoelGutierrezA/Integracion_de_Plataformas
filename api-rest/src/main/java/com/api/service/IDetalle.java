package com.api.service;

import java.util.ArrayList;

import com.api.model.entity.Detalle;

public interface IDetalle {
    // Método para guardar un cliente en la base de datos
    Detalle save(Detalle detalle);

    // Método para buscar un cliente por su ID en la base de datos
    Detalle findById(Integer id);

    // Método para eliminar un cliente de la base de datos
    //void delete(Usuario usuario);

    // Método para obtener todos los clientes de la base de datos
    ArrayList<Detalle> findByAll();

}