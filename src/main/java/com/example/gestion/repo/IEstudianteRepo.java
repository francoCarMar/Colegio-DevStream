package com.example.gestion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion.models.Estudiante;

public interface IEstudianteRepo extends JpaRepository<Estudiante, Integer> {

}
