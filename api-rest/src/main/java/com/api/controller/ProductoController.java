package com.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api.model.entity.Producto;
import com.api.service.IProducto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/v1/") // Mapea todas las URL en este controlador a la ruta base "/api/v1/"
public class ProductoController {

    @Autowired
    private IProducto productoService; // Inyección de dependencia del servicio de cliente

    // Maneja solicitudes POST a la URL "/api/v1/cliente"
    @PostMapping("producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto create(@RequestBody Producto producto){
        return productoService.save(producto); // Guarda un nuevo cliente y retorna el cliente creado
    }

    // Maneja solicitudes PUT a la URL "/api/v1/cliente"
    @PutMapping("producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto update(@RequestBody Producto producto){
        return productoService.save(producto); // Actualiza un cliente existente y retorna el cliente actualizado
    }

    // Maneja solicitudes DELETE a la URL "/api/v1/cliente/{id}"
    @DeleteMapping("producto/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable Integer id){
    Map<String, Object> response = new HashMap<>();

    try {
    Producto productoDelete = productoService.findById(id);
    productoService.delete(productoDelete);
    return new ResponseEntity<>(productoDelete, HttpStatus.NO_CONTENT); // Retorna el cliente eliminado con el código de estado HTTP 204 (NO_CONTENT)
    } catch (DataAccessException exDt) {
    response.put("mensaje", exDt.getMessage());
    response.put("producto", null);
    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR); // Retorna un mensaje de error con el código de estado HTTP 500 (INTERNAL_SERVER_ERROR) si ocurre un error durante la eliminación
    }
    }

    // Maneja solicitudes GET a la URL "/api/v1/cliente/{id}"
    @GetMapping("producto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Producto showById(@PathVariable Integer id){
        return productoService.findById(id); // Retorna un cliente específico por su ID con el código de estado HTTP 200 (OK)
    }

    // Maneja solicitudes GET a la URL "/api/v1/clientes"
    @GetMapping("productos")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ArrayList<Producto> showAll(){
        return productoService.findByAll(); // Retorna todos los clientes con el código de estado HTTP 200 (OK)
    }

}