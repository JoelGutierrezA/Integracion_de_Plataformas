package com.api.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.UsuarioDao;
//import com.apirest.model.dao.DetalleVentaDao;
import com.api.model.entity.Usuario;
//import com.apirest.model.entity.DetalleVenta;
import com.api.service.IUsuario;

@Service
public class UsuarioImpl implements IUsuario {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private UsuarioDao usuarioDao;

    // Inyección de dependencia del DetalleVenta
    //@Autowired
    //private DetalleVentaDao detalleDao;

    // Método para guardar un cliente en la base de datos
    @Transactional
    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Usuario findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

    // Método para eliminar un cliente de la base de datos
    @Transactional
    @Override
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    // Método para obtener todos los clientes de la base de datos
    @Transactional(readOnly = true)
    @Override
    public ArrayList<Usuario> findByAll() {
        return (ArrayList<Usuario>) usuarioDao.findAll();
    }

    // Método para mostrar las ventas de un cliente
    //@Override
    //public ArrayList<DetalleVenta> mostrarVentas(Integer id) {
        //return (ArrayList<DetalleVenta>) detalleDao.findAll();
    //}
}