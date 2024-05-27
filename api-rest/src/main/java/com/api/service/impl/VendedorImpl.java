package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.VendedorDao;
import com.api.model.entity.Vendedor;
import com.api.service.IVendedor;

@Service
public class VendedorImpl implements IVendedor {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private VendedorDao vendedorDao;

    // Inyección de dependencia del DetalleVenta
    //@Autowired
    //private DetalleVentaDao detalleDao;

    // Método para guardar un cliente en la base de datos
    @Transactional
    @Override
    public Vendedor save(Vendedor vendedor) {
        return vendedorDao.save(vendedor);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Vendedor findById(Integer id) {
        return vendedorDao.findById(id).orElse(null);
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
    public ArrayList<Vendedor> findByAll() {
        return (ArrayList<Vendedor>) vendedorDao.findAll();
    }

    // Método para mostrar las ventas de un cliente
    //@Override
    //public ArrayList<DetalleVenta> mostrarVentas(Integer id) {
    //return (ArrayList<DetalleVenta>) detalleDao.findAll();
    //}
}