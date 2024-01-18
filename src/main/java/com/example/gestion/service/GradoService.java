package com.example.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestion.models.Grado;
import com.example.gestion.repo.IGradoRepo;

@Service
public class GradoService {
    @Autowired
    private IGradoRepo gradoRepo;

    public List<Grado> getGrados() {
        return gradoRepo.findAll();
    }

    public Optional<Grado> getGrado(int id) {
        return gradoRepo.findById(id);
    }

    public Grado createGrado(Grado grado) {
        return gradoRepo.save(grado);
    }

    public Optional<Grado> updateGrado(int id, Grado grado) {
        return gradoRepo.findById(id).map(auxGrado -> {
            grado.setId(id);
            return gradoRepo.save(grado);
        });
    }

    public boolean deleteGrado(int id) {
        try {
            gradoRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
