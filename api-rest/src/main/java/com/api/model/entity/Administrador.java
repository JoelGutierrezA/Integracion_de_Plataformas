package com.api.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private Integer idAdministrador;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    // La anotación @ManyToOne indica que esta entidad tiene una relación muchos a uno con la entidad Vendedor
    //@ManyToOne
    // La anotación @JoinColumn especifica el nombre de la columna de la tabla de base de datos que se utiliza como clave externa
    // para mapear la relación con la entidad Vendedor
    //@JoinColumn(name = "rut_vendedor", nullable = false)
    //private Vendedor vendedor;

    // La anotación @OneToMany indica que esta entidad tiene una relación uno a muchos con la entidad DetalleVenta
    //@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    // La anotación @JsonManagedReference se utiliza para evitar problemas de referencia circular al serializar la entidad
    // Venta a JSON
    //@JsonManagedReference
    //private List<DetalleVenta> detalleVentas = new ArrayList<>();

    // Método para agregar un detalle de venta a la lista de detalles de venta de esta venta
    //public void addDetalleVenta(DetalleVenta detalleVenta) {
        //detalleVentas.add(detalleVenta);
        //detalleVenta.setVenta(this);
    //}

    // Método para eliminar un detalle de venta de la lista de detalles de venta de esta venta
    //public void removeDetalleVenta(DetalleVenta detalleVenta) {
        //detalleVentas.remove(detalleVenta);
        //detalleVenta.setVenta(null);
    //}
}