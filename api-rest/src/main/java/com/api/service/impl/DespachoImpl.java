package com.api.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.DespachoDao;
import com.api.model.entity.Despacho;
import com.api.service.IDespacho;

@Service
public class DespachoImpl implements IDespacho {

    @Autowired
    private DespachoDao despachoDao;

    // Método para guardar un cliente en la base de datos
    @Transactional
    @Override
    public Despacho save(Despacho despacho) {
        return despachoDao.save(despacho);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Despacho findById(Integer id) {
        return despachoDao.findById(id).orElse(null);
    }

    // Método para eliminar un cliente de la base de datos
    @Transactional
    @Override
    public void delete(Despacho despacho) {
        despachoDao.delete(despacho);
    }

    // Método para obtener todos los clientes de la base de datos
    @Transactional(readOnly = true)
    @Override
    public ArrayList<Despacho> findByAll() {
        return (ArrayList<Despacho>) despachoDao.findAll();
    }

}