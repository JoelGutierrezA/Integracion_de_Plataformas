package com.api.controller;

import com.api.model.entity.Despacho;
import com.api.service.IDespacho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class DespachoController {

    @Autowired
    private IDespacho despachoService;

    @PostMapping("despacho")
    @ResponseStatus(HttpStatus.CREATED)
    public Despacho create(@RequestBody Despacho despacho){
        return despachoService.save(despacho);
    }

    @PutMapping("despacho")
    @ResponseStatus(HttpStatus.CREATED)
    public Despacho update(@RequestBody Despacho despacho){
        return despachoService.save(despacho);
    }

    @DeleteMapping("despacho/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable Integer id){
        Map<String, Object> response = new HashMap<>();

        try {
            Despacho despachoDelete = despachoService.findById(id);
            despachoService.delete(despachoDelete);
            return new ResponseEntity<>(despachoDelete, HttpStatus.NO_CONTENT);
        } catch (DataAccessException exDt) {
            response.put("mensaje", exDt.getMessage());
            response.put("despacho", null);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("despacho/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Despacho showById(@PathVariable Integer id){
        return despachoService.findById(id);
    }

    // Maneja solicitudes GET a la URL "/api/v1/clientes"
    @GetMapping("despachos")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ArrayList<Despacho> showAll(){
        return despachoService.findByAll();
    }
}