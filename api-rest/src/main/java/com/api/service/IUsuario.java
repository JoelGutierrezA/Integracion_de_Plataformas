package com.api.service;

import java.util.ArrayList;

import com.api.model.entity.Usuario;
//import com.api.model.entity.DetalleVenta;

public interface IUsuario {
    // Método para guardar un cliente en la base de datos
    Usuario save(Usuario usuario);

    // Método para buscar un cliente por su ID en la base de datos
    Usuario findById(Integer id);

    // Método para eliminar un cliente de la base de datos
    void delete(Usuario usuario);

    // Método para obtener todos los clientes de la base de datos
    ArrayList<Usuario> findByAll();

    // Método para obtener todos las ventas por el id del cliente de la base de datos
    //ArrayList<DetalleVenta> mostrarVentas(Integer id);
}