package com.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api.model.entity.Sucursal;
import com.api.service.ISucursal;

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
public class SucursalController {

    @Autowired
    private ISucursal sucursalService; // Inyección de dependencia del servicio de cliente

    // Maneja solicitudes POST a la URL "/api/v1/cliente"
    @PostMapping("sucursal")
    @ResponseStatus(HttpStatus.CREATED)
    public Sucursal create(@RequestBody Sucursal sucursal){
        return sucursalService.save(sucursal); // Guarda un nuevo cliente y retorna el cliente creado
    }

    // Maneja solicitudes PUT a la URL "/api/v1/cliente"
    @PutMapping("sucursal")
    @ResponseStatus(HttpStatus.CREATED)
    public Sucursal update(@RequestBody Sucursal sucursal){
        return sucursalService.save(sucursal); // Actualiza un cliente existente y retorna el cliente actualizado
    }

    // Maneja solicitudes DELETE a la URL "/api/v1/cliente/{id}"
    //@DeleteMapping("usuario/{id}")
    //@ResponseStatus(HttpStatus.NO_CONTENT)
    //public ResponseEntity<?> delete(@PathVariable Integer id){
    //Map<String, Object> response = new HashMap<>();

    //try {
    //Usuario usuarioDelete = usuarioService.findById(id);
    //usuarioService.delete(usuarioDelete);
    //return new ResponseEntity<>(usuarioDelete, HttpStatus.NO_CONTENT); // Retorna el cliente eliminado con el código de estado HTTP 204 (NO_CONTENT)
    //} catch (DataAccessException exDt) {
    //response.put("mensaje", exDt.getMessage());
    //response.put("usuario", null);
    //return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR); // Retorna un mensaje de error con el código de estado HTTP 500 (INTERNAL_SERVER_ERROR) si ocurre un error durante la eliminación
    //}
    //}

    // Maneja solicitudes GET a la URL "/api/v1/cliente/{id}"
    @GetMapping("sucursal/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Sucursal showById(@PathVariable Integer id){
        return sucursalService.findById(id); // Retorna un cliente específico por su ID con el código de estado HTTP 200 (OK)
    }

    // Maneja solicitudes GET a la URL "/api/v1/clientes"
    @GetMapping("sucursales")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ArrayList<Sucursal> showAll(){
        return sucursalService.findByAll(); // Retorna todos los clientes con el código de estado HTTP 200 (OK)
    }

    // Maneja solicitudes GET a la URL "/api/v1/cliente/ventas/{id}"
    //@GetMapping("cliente/ventas/{id}")
    //@ResponseStatus(HttpStatus.OK)
    //public ArrayList<Map<String, Object>> mostrarVentas(@PathVariable Integer id){
    //return detalleService.mostrarVentas(id); // Retorna una lista de ventas de un cliente con un código de estado HTTP 200 (OK)
    //}

}