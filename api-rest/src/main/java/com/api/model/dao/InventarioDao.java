package com.api.model.dao;

import com.api.model.entity.Inventario;
import org.springframework.data.repository.CrudRepository;

// Esta interfaz extiende CrudRepository, que proporciona operaciones CRUD básicas para la entidad Cliente
public interface InventarioDao extends CrudRepository<Inventario, Integer> {
}