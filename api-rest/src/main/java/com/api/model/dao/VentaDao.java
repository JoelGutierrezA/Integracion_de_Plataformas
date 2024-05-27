package com.api.model.dao;

import com.api.model.entity.Venta;
import org.springframework.data.repository.CrudRepository;

// Esta interfaz extiende CrudRepository, que proporciona operaciones CRUD básicas para la entidad Cliente
public interface VentaDao extends CrudRepository<Venta, Integer> {
}