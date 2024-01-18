package com.example.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.models.Nivel;
import com.example.gestion.service.NivelService;

@RestController
@RequestMapping("/api/niveles")
public class NivelController {
    @Autowired
    private NivelService nivelService;

    @GetMapping
    public ResponseEntity<List<Nivel>> getNiveles() {
        List<Nivel> niveles = this.nivelService.getNiveles();
        return ResponseEntity.ok(niveles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Nivel> getNivel(@PathVariable int id) {
        return nivelService.getNivel(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Nivel> createNivel(Nivel nivel) {
        Nivel niv = nivelService.createNivel(nivel);
        return ResponseEntity.status(HttpStatus.CREATED).body(niv);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Nivel> updateNivel(@PathVariable int id, Nivel nivel) {
        return nivelService.updateNivel(id, nivel).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNivel(@PathVariable int id, Nivel nivel) {
        boolean deleted = nivelService.deleteNivel(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

}
