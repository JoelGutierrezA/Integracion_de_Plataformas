package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.DetalleDao;
import com.api.model.entity.Detalle;
import com.api.service.IDetalle;

@Service
public class DetalleImpl implements IDetalle {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private DetalleDao detalleDao;

    // Método para guardar un cliente en la base de datos
    @Transactional
    @Override
    public Detalle save(Detalle detalle) {
        return detalleDao.save(detalle);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Detalle findById(Integer id) {
        return detalleDao.findById(id).orElse(null);
    }

    // Método para eliminar un cliente de la base de datos
    //@Transactional
    //@Override
    //public void delete(Usuario usuario) {
    //usuarioDao.delete(usuario);
    //}

    // Método para obtener todos los clientes de la base de datos
    @Transactional(readOnly = true)
    @Override
    public ArrayList<Detalle> findByAll() {
        return (ArrayList<Detalle>) detalleDao.findAll();
    }

}