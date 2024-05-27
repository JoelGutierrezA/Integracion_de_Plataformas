package com.api.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.api.model.entity.Usuario;

// Esta interfaz extiende CrudRepository, que proporciona operaciones CRUD básicas para la entidad Cliente
public interface UsuarioDao extends CrudRepository<Usuario, Integer> {
}