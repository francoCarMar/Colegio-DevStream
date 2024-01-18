package com.example.gestion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Profesor extends Miembro {
    @Column(name = "especialidad", length = 45)
    String especialidad;
}
