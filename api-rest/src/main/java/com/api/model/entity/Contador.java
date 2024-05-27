package com.api.model.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "contador")
public class Contador implements Serializable {

    @Id
    @Column(name = "id_contador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContador;

    @Column(name = "area_contador")
    private String areaContador;

    @ManyToOne
    @JoinColumn(name = "id_reporte", nullable = false)
    private Usuario usuario;
}