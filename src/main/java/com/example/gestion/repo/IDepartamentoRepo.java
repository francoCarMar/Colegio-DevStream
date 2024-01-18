package com.example.gestion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion.models.Departamento;

public interface IDepartamentoRepo extends JpaRepository<Departamento, Integer> {

}
