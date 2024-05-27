package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IBodeguero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.ClienteDao;
import com.api.model.entity.Cliente;
import com.api.service.ICliente;

@Service
public class ClienteImpl implements ICliente {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private ClienteDao clienteDao;

    // Inyección de dependencia del DetalleVenta
    //@Autowired
    //private DetalleVentaDao detalleDao;

    // Método para guardar un cliente en la base de datos
    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
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
    public ArrayList<Cliente> findByAll() {
        return (ArrayList<Cliente>) clienteDao.findAll();
    }

    // Método para mostrar las ventas de un cliente
    //@Override
    //public ArrayList<DetalleVenta> mostrarVentas(Integer id) {
    //return (ArrayList<DetalleVenta>) detalleDao.findAll();
    //}
}