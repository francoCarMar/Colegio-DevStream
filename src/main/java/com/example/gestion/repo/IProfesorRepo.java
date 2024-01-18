package com.example.gestion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion.models.Profesor;

public interface IProfesorRepo extends JpaRepository<Profesor, Integer> {

}
