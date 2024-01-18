package com.example.gestion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.models.Grado;
import com.example.gestion.service.GradoService;

@RestController
@RequestMapping("/api/grado")
public class GradoController {
    @Autowired
    private GradoService gradoService;

    @GetMapping
    public ResponseEntity<List<Grado>> getGrados() {
        List<Grado> grados = gradoService.getGrados();
        return ResponseEntity.ok(grados);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grado> getGrado(@PathVariable int id) {
        return gradoService.getGrado(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Grado> createGrado(@RequestBody Grado grado) {
        Grado gradoCreate = gradoService.createGrado(grado);
        return ResponseEntity.status(HttpStatus.CREATED).body(gradoCreate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grado> updateGrado(@PathVariable int id, Grado grado) {
        Optional<Grado> gradoUpdate = gradoService.updateGrado(id, grado);
        return gradoUpdate.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrado(@PathVariable int id) {
        boolean deleted = gradoService.deleteGrado(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

}
