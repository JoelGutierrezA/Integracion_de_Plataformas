package com.api.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.api.model.entity.Despacho;

// Esta interfaz extiende CrudRepository, que proporciona operaciones CRUD básicas para la entidad Cliente
public interface DespachoDao extends CrudRepository<Despacho, Integer> {
}