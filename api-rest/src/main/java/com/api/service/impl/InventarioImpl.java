package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.InventarioDao;
//import com.apirest.model.dao.DetalleVentaDao;
import com.api.model.entity.Inventario;
//import com.apirest.model.entity.DetalleVenta;
import com.api.service.IInventario;

@Service
public class InventarioImpl implements IInventario {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private InventarioDao inventarioDao;

    // Inyección de dependencia del DetalleVenta
    //@Autowired
    //private DetalleVentaDao detalleDao;

    // Método para guardar un cliente en la base de datos
    @Transactional
    @Override
    public Inventario save(Inventario inventario) {
        return inventarioDao.save(inventario);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Inventario findById(Integer id) {
        return inventarioDao.findById(id).orElse(null);
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
    public ArrayList<Inventario> findByAll() {
        return (ArrayList<Inventario>) inventarioDao.findAll();
    }

    // Método para mostrar las ventas de un cliente
    //@Override
    //public ArrayList<DetalleVenta> mostrarVentas(Integer id) {
    //return (ArrayList<DetalleVenta>) detalleDao.findAll();
    //}
}