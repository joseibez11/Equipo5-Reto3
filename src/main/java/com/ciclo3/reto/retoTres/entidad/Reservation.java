package com.ciclo3.reto.retoTres.entidad;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReservation;
	private Date startDate;
	private Date devolutionDate;
	private String status = "created";

	@ManyToOne
	@JoinColumn(name = "reservation_id_room")
	@JsonIgnoreProperties("reservations")
	private Room room;
	
	@ManyToOne
	@JoinColumn(name = "reservation_id_client")
	@JsonIgnoreProperties({"reservations","messages"})
	private Client client;
	
	private String score;
}
