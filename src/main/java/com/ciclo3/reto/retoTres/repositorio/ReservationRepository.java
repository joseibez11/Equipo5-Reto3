package com.ciclo3.reto.retoTres.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciclo3.reto.retoTres.entidad.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
