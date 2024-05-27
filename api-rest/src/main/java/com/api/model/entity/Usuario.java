package com.api.model.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    // La anotación @Id indica que este campo es la clave primaria de la entidad
    @Id
    // La anotación @Column especifica el nombre de la columna de la tabla de base de datos que se mapea a este campo
    @Column(name = "id_usuario")
    // La anotación @GeneratedValue especifica la estrategia de generación de valores para la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    // La anotación @Column especifica el nombre de la columna de la tabla de base de datos que se mapea a este campo
    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    // La anotación @Column especifica el nombre de la columna de la tabla de base de datos que se mapea a este campo
    @Column(name = "correo_usuario")
    private String correoUsuario;

    // La anotación @Column especifica el nombre de la columna de la tabla de base de datos que se mapea a este campo
    @Column(name = "contrasena")
    private String contrasena;

    // La anotación @Column especifica el nombre de la columna de la tabla de base de datos que se mapea a este campo
    @Column(name = "tipo_usuario")
    private String tipoUsuario;
}