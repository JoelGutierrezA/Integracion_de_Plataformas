package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.AdministradorDao;
//import com.apirest.model.dao.DetalleVentaDao;
import com.api.model.entity.Administrador;
//import com.apirest.model.entity.DetalleVenta;
import com.api.service.IUsuario;

@Service
public class AdministradorImpl implements IAdministrador {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private AdministradorDao administradorDao;

    // Inyección de dependencia del DetalleVenta
    //@Autowired
    //private DetalleVentaDao detalleDao;

    // Método para guardar un cliente en la base de datos
    //@Transactional
    //@Override
    public Administrador save(Administrador administrador) {
        return administradorDao.save(administrador);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Administrador findById(Integer id) {
        return administradorDao.findById(id).orElse(null);
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
    public ArrayList<Administrador> findByAll() {
        return (ArrayList<Administrador>) administradorDao.findAll();
    }

    // Método para mostrar las ventas de un cliente
    //@Override
    //public ArrayList<DetalleVenta> mostrarVentas(Integer id) {
    //return (ArrayList<DetalleVenta>) detalleDao.findAll();
    //}
}