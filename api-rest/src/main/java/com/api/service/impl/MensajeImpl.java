package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IAdministrador;
import com.api.service.IMensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.MensajeDao;
//import com.apirest.model.dao.DetalleVentaDao;
import com.api.model.entity.Mensaje;
//import com.apirest.model.entity.DetalleVenta;
import com.api.service.IUsuario;

@Service
public class MensajeImpl implements IMensaje {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private MensajeDao mensajeDao;

    // Inyección de dependencia del DetalleVenta
    //@Autowired
    //private DetalleVentaDao detalleDao;

    // Método para guardar un cliente en la base de datos
    @Transactional
    @Override
    public Mensaje save(Mensaje mensaje) {
        return mensajeDao.save(mensaje);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Mensaje findById(Integer id) {
        return mensajeDao.findById(id).orElse(null);
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
    public ArrayList<Mensaje> findByAll() {
        return (ArrayList<Mensaje>) mensajeDao.findAll();
    }

    // Método para mostrar las ventas de un cliente
    //@Override
    //public ArrayList<DetalleVenta> mostrarVentas(Integer id) {
    //return (ArrayList<DetalleVenta>) detalleDao.findAll();
    //}
}