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
import org.springframework.scheduling.support.SimpleTriggerContext;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "despacho")
public class Despacho implements Serializable {

    @Id
    @Column(name = "id_despacho")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDespacho;

    @Column(name = "estado_despacho")
    private String estadoDespacho;

    @Column(name = "tarifa_despacho")
    private Integer tarifaDespacho;

    @Column(name = "fecha_despacho")
    private Date fechaDespacho;
}