package com.ciclo3.reto.retoTres.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.retoTres.entidad.Score;
import com.ciclo3.reto.retoTres.repositorio.ScoreRepository;

@Service
public class ScoreService {
	
	@Autowired
	ScoreRepository repository;
	
	public List<Score> getScores() {
		return repository.findAll();
	}
	
	public Score saveScore(Score score) {
		return repository.save(score);
	}

}
