package com.example.gestion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.models.Estudiante;
import com.example.gestion.service.EstudianteService;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    ResponseEntity<List<Estudiante>> getEstudiantes() {
        List<Estudiante> estudiantes = estudianteService.getEstudiantes();
        return ResponseEntity.ok(estudiantes);
    }

    @PostMapping
    ResponseEntity<Estudiante> createEstudiante(@PathVariable Estudiante estudiante) {
        Estudiante est = estudianteService.createEstudiante(estudiante);
        return ResponseEntity.status(HttpStatus.CREATED).body(est);
    }

    @GetMapping("/{id}")
    ResponseEntity<Estudiante> getEstudianteById(@PathVariable("id") int id) {
        Optional<Estudiante> estudiante = estudianteService.getEstudiante(id);
        return estudiante.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    ResponseEntity<Estudiante> updateEstudiante(@PathVariable("id") int id, @RequestBody Estudiante estudiante) {
        Optional<Estudiante> updatedEstudiante = estudianteService.updateEstudiante(id, estudiante);
        return updatedEstudiante.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteEstudiante(@PathVariable("id") int id) {
        boolean deleted = estudianteService.deleteEstudiante(id);
        // noContent 204
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
