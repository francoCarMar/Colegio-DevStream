package com.example.gestion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion.models.Grado;

public interface IGradoRepo extends JpaRepository<Grado, Integer> {

}
