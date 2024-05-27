package com.api.controller;

import com.api.model.entity.Administrador;
import com.api.model.entity.Sucursal;
import com.api.model.entity.Usuario;
import com.api.model.request.VendedorRequest;
import com.api.service.ISucursal;
import com.api.service.IUsuario;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.entity.Vendedor;
import com.api.service.IVendedor;
//import com.apirest.service.IDetalleVenta;

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
public class VendedorController {

    @Autowired
    private IVendedor vendedorService; // Inyección de dependencia del servicio de cliente

    @Autowired
    private ISucursal sucursalService; // Inyección de dependencia del servicio de sucursal

    @Autowired
    private IUsuario usuarioService;
    //@Autowired
    //private IDetalleVenta detalleService; // Inyección de dependencia del servicio de detalle_venta

    // Maneja solicitudes POST a la URL "/api/v1/cliente"
    @PostMapping("vendedor")
    public ResponseEntity<?> create(@RequestBody VendedorRequest vendedorRequest) {
        Map<String, Object> response = new HashMap<>();
        Vendedor vendedorNuevo = null;

        // Validación de entrada
        if (vendedorRequest.getVendedor() == null) {
            response.put("mensaje", "El vendedor es obligatorio");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        if (vendedorRequest.getSucursalId() == null) {
            response.put("mensaje", "El ID de la sucursal es obligatorio");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        if (vendedorRequest.getUsuario() == null) {
            response.put("mensaje", "El usuario es obligatorio");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        try {
            // Buscar y obtener la sucursal existente por su ID
            Sucursal sucursalExistente = sucursalService.findById(vendedorRequest.getSucursalId());
            if (sucursalExistente == null) {
                response.put("mensaje", "La sucursal con el ID especificado no existe");
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }

            // Crear y guardar el usuario
            Usuario usuarioNuevo = usuarioService.save(vendedorRequest.getUsuario());

            // Asignar la sucursal y el usuario al vendedor
            Vendedor vendedor = vendedorRequest.getVendedor();
            vendedor.setSucursal(sucursalExistente);
            vendedor.setUsuario(usuarioNuevo);

            // Guardar el vendedor
            vendedorNuevo = vendedorService.save(vendedor);

        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "El vendedor ha sido creado con éxito");
        response.put("vendedor", vendedorNuevo);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("vendedor")
    public ResponseEntity<?> update(@RequestBody Vendedor vendedor) {
        Map<String, Object> response = new HashMap<>();
        Vendedor vendedorActualizado = null;

        try {
            // Actualizar el vendedor
            vendedorActualizado = vendedorService.save(vendedor);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la actualización en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "El vendedor fue actualizado con éxito");
        response.put("vendedor", vendedorActualizado);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
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
    @GetMapping("vendedor/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Vendedor showById(@PathVariable Integer id){
        return vendedorService.findById(id); // Retorna un cliente específico por su ID con el código de estado HTTP 200 (OK)
    }

    // Maneja solicitudes GET a la URL "/api/v1/clientes"
    @GetMapping("vendedores")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ArrayList<Vendedor> showAll(){
        return vendedorService.findByAll(); // Retorna todos los clientes con el código de estado HTTP 200 (OK)
    }

    // Maneja solicitudes GET a la URL "/api/v1/cliente/ventas/{id}"
    //@GetMapping("cliente/ventas/{id}")
    //@ResponseStatus(HttpStatus.OK)
    //public ArrayList<Map<String, Object>> mostrarVentas(@PathVariable Integer id){
    //return detalleService.mostrarVentas(id); // Retorna una lista de ventas de un cliente con un código de estado HTTP 200 (OK)
    //}

}