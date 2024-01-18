package com.example.gestion.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Miembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int miembro_id;

    @ManyToOne(fetch = FetchType.EAGER)
    Departamento departamento;

    @Column(name = "clave", length = 45)
    String clave;

    @Column(name = "nombre", length = 45)
    String nombre;

    @Column(name = "apellidos", length = 45)
    String apellidos;

    @Column(name = "fecha_nacimiento")
    Date fecha_nacimiento;

    @Column(name = "direccion", length = 100)
    String direccion;

    @Column(name = "contacto", length = 45)
    String contacto;
}
