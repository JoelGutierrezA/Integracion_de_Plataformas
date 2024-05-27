package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.SucursalDao;
import com.api.model.entity.Sucursal;
import com.api.service.ISucursal;

import java.util.ArrayList;

@Service
public class SucursalImpl implements ISucursal {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private SucursalDao sucursalDao;

    // Método para guardar un cliente en la base de datos
    //@Transactional
    //@Override
    public Sucursal save(Sucursal sucursal) {
        return sucursalDao.save(sucursal);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Sucursal findById(Integer id) {
        return sucursalDao.findById(id).orElse(null);
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
    public ArrayList<Sucursal> findByAll() {
        return (ArrayList<Sucursal>) sucursalDao.findAll();
    }

    // Método para mostrar las ventas de un cliente
    //@Override
    //public ArrayList<DetalleVenta> mostrarVentas(Integer id) {
    //return (ArrayList<DetalleVenta>) detalleDao.findAll();
    //}
}