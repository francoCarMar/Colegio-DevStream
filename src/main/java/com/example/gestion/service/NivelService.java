package com.example.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestion.models.Nivel;
import com.example.gestion.repo.INivelRepo;

@Service
public class NivelService {
    @Autowired
    private INivelRepo nivelRepo;

    public List<Nivel> getNiveles() {
        return nivelRepo.findAll();
    }

    public Optional<Nivel> getNivel(int id) {
        return nivelRepo.findById(id);
    }

    public Nivel createNivel(Nivel nivel) {
        return nivelRepo.save(nivel);
    }

    public Optional<Nivel> updateNivel(int id, Nivel nivel) {
        return nivelRepo.findById(id).map(auxNiv -> {
            nivel.setId(id);
            return nivelRepo.save(nivel);
        });
    }

    public boolean deleteNivel(int id) {
        try {
            nivelRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
