package com.example.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestion.models.Departamento;
import com.example.gestion.repo.IDepartamentoRepo;

@Service
public class DepartamentoService {
    @Autowired
    private IDepartamentoRepo departamentoRepo;

    public List<Departamento> getDepartamentos() {
        return departamentoRepo.findAll();
    }

    public Optional<Departamento> getDepartamento(int id) {
        return departamentoRepo.findById(id);
    }

    public Departamento createDepartamento(Departamento departamento) {
        return departamentoRepo.save(departamento);
    }

    public Optional<Departamento> updateDepartamento(int id, Departamento departamento) {
        return departamentoRepo.findById(id).map(auxId -> {
            departamento.setId(id);
            return departamentoRepo.save(departamento);
        });
    }

    public boolean deleteDepartamento(int id) {
        try {
            departamentoRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
