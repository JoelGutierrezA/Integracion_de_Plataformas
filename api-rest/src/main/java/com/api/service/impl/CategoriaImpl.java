package com.api.service.impl;

import java.util.ArrayList;

import com.api.service.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.dao.CategoriaDao;
import com.api.model.entity.Categoria;
import com.api.service.ICategoria;

@Service
public class CategoriaImpl implements ICategoria {

    // Inyección de dependencia del ClienteDao
    @Autowired
    private CategoriaDao categoriaDao;


    // Método para guardar un cliente en la base de datos
    //@Transactional
    //@Override
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    // Método para buscar un cliente por su ID en la base de datos
    @Transactional(readOnly = true)
    @Override
    public Categoria findById(Integer id) {
        return categoriaDao.findById(id).orElse(null);
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
    public ArrayList<Categoria> findByAll() {
        return (ArrayList<Categoria>) categoriaDao.findAll();
    }

}