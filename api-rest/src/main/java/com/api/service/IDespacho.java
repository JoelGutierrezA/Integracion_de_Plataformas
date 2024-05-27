package com.api.service;

import java.util.ArrayList;

import com.api.model.entity.Despacho;

public interface IDespacho {
    // Método para guardar un cliente en la base de datos
    Despacho save(Despacho despacho);

    // Método para buscar un cliente por su ID en la base de datos
    Despacho findById(Integer id);

    // Método para eliminar un cliente de la base de datos
    void delete(Despacho despacho);

    // Método para obtener todos los clientes de la base de datos
    ArrayList<Despacho> findByAll();

}