package com.ciclo3.reto.retoTres.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ciclo3.reto.retoTres.entidad.Score;
import com.ciclo3.reto.retoTres.servicio.ScoreService;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin(origins = "*")
public class ApiScore {
    @Autowired
    private ScoreService service;

    @GetMapping("/all")
    public List<Score> getScores() {
        return service.getScores();
    }

    @PostMapping("/save")
    public ResponseEntity saveScore(@RequestBody Score score) {
        service.saveScore(score);
        return ResponseEntity.status(201).build();
    }
}
