package com.api.model.dao;

import com.api.model.entity.Administrador;
import org.springframework.data.repository.CrudRepository;
import com.api.model.entity.Administrador;

// Esta interfaz extiende CrudRepository, que proporciona operaciones CRUD básicas para la entidad Cliente
public interface AdministradorDao extends CrudRepository<Administrador, Integer> {
}