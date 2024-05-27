package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IBodeguero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.BodegueroDao;
//import com.apirest.model.dao.DetalleVentaDao;
import com.api.model.entity.Bodeguero;
//import com.apirest.model.entity.DetalleVenta;
import com.api.service.IBodeguero;

@Service
public class BodegueroImpl implements IBodeguero {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private BodegueroDao bodegueroDao;

    // Inyección de dependencia del DetalleVenta
    //@Autowired
    //private DetalleVentaDao detalleDao;

    // Método para guardar un cliente en la base de datos
    @Transactional
    @Override
    public Bodeguero save(Bodeguero bodeguero) {
        return bodegueroDao.save(bodeguero);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Bodeguero findById(Integer id) {
        return bodegueroDao.findById(id).orElse(null);
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
    public ArrayList<Bodeguero> findByAll() {
        return (ArrayList<Bodeguero>) bodegueroDao.findAll();
    }

    // Método para mostrar las ventas de un cliente
    //@Override
    //public ArrayList<DetalleVenta> mostrarVentas(Integer id) {
    //return (ArrayList<DetalleVenta>) detalleDao.findAll();
    //}
}