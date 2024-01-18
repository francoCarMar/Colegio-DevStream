package com.example.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestion.models.Estudiante;
import com.example.gestion.repo.IEstudianteRepo;

@Service
public class EstudianteService {
    @Autowired
    private IEstudianteRepo estudianteRepo;

    public List<Estudiante> getEstudiantes() {
        return estudianteRepo.findAll();
    }

    public Estudiante createEstudiante(Estudiante estudiante) {
        return estudianteRepo.save(estudiante);
    }

    public Optional<Estudiante> getEstudiante(int id) {
        return estudianteRepo.findById(id);
    }

    public Optional<Estudiante> updateEstudiante(int id, Estudiante estudiante) {
        return estudianteRepo.findById(id).map(temEst -> {
            estudiante.setMiembro_id(id);
            return estudianteRepo.save(estudiante);
        });
    }

    public boolean deleteEstudiante(int id) {
        try {
            estudianteRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
