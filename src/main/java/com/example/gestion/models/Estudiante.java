package com.example.gestion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Estudiante extends Miembro {
    @ManyToOne(fetch = FetchType.EAGER)
    Grado grado;

    @ManyToOne(fetch = FetchType.EAGER)
    Nivel nivel;
}
