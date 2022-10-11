package com.ciclo3.reto.retoTres.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.retoTres.entidad.Reservation;
import com.ciclo3.reto.retoTres.repositorio.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	ReservationRepository repository;
	
	public List<Reservation> getReservation(){
		return repository.findAll();
	}
	
	public Reservation getReservationById(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Reservation saveReservation(Reservation reservation) {
		return repository.save(reservation);
	}
	
	public void deleteReservation(long id) {
		repository.deleteById(id);
	}
	
	public Reservation updateReservation(Reservation update) {
		Reservation editReservation = getReservationById(update.getIdReservation());
		editReservation.setStartDate(update.getStartDate());
		editReservation.setDevolutionDate(update.getDevolutionDate());
		editReservation.setStatus(update.getStatus());
		editReservation.setScore(update.getScore());
		return repository.save(editReservation);
		
	}
}
