package com.ciclo3.reto.retoTres.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciclo3.reto.retoTres.entidad.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

}
