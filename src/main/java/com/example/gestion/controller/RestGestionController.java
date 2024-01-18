package com.example.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.models.Departamento;
import com.example.gestion.models.Estudiante;
import com.example.gestion.models.Grado;
import com.example.gestion.models.Nivel;
import com.example.gestion.repo.IDepartamentoRepo;
import com.example.gestion.repo.IEstudianteRepo;
import com.example.gestion.repo.IGradoRepo;
import com.example.gestion.repo.INivelRepo;

// @RestController
// @RequestMapping("/api")
// public class RestGestionController {
// @Autowired
// private IEstudianteRepo estudianteRepo;
// @Autowired
// private IGradoRepo gradoRepo;
// @Autowired
// private IDepartamentoRepo departamentoRepo;
// @Autowired
// private INivelRepo nivelRepo;

// @GetMapping("/estudiante")
// public List<Estudiante> getEstudiantes() {
// return estudianteRepo.findAll();
// }

// @PostMapping("/estudiante")
// public void insertEstudiante(@RequestBody Estudiante estudiante) {
// estudianteRepo.save(estudiante);
// }

// @PutMapping("/estudiante")
// public void updateEstudiante(@RequestBody Estudiante estudiante) {
// estudianteRepo.save(estudiante);
// }

// @DeleteMapping("/estudiante/{id}")
// public void deleteEstudiante(@PathVariable("id") int id) {
// estudianteRepo.deleteById(id);
// }

// @PostMapping("/grado")
// public void insertGrado(@RequestBody Grado grado) {
// gradoRepo.save(grado);
// }

// @GetMapping("/grado")
// public List<Grado> getGrados() {
// return gradoRepo.findAll();
// }

// @DeleteMapping("/grados/{id}")
// public void deleteGrado(@PathVariable("id") int id) {
// gradoRepo.deleteById(id);
// }

// @PostMapping("/nivel")
// public void insertNivel(@RequestBody Nivel nivel) {
// nivelRepo.save(nivel);
// }

// @GetMapping("/nivel")
// public List<Nivel> getNivel() {
// return nivelRepo.findAll();
// }

// @DeleteMapping("/nivel/{id}")
// public void deleteNivel(@PathVariable("id") int id) {
// nivelRepo.deleteById(id);
// }

// @PutMapping("/nivel/{id}")
// public void updateNivel(@PathVariable int id, @RequestBody Nivel nivel) {
// nivelRepo.save(nivel);
// }

// @PostMapping("/departamento")
// public void insertDepartamento(@RequestBody Departamento departamento) {
// departamentoRepo.save(departamento);
// }

// @GetMapping("/departamento")
// public List<Departamento> getDepartamento() {
// return departamentoRepo.findAll();
// }

// @DeleteMapping("/departamento/{id}")
// public void deleteDepartamento(@PathVariable int id) {
// departamentoRepo.deleteById(id);
// }

// }
