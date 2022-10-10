package com.ciclo3.reto.retoTres.entidad;

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
@Table(name =  "message")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMessage;
	private String messageText;
	
	@ManyToOne
	@JoinColumn(name = "message_id_room")
	@JsonIgnoreProperties({"messages","reservations"})
	private Room room;
	
	@ManyToOne
	@JoinColumn(name = "message_id_client")
	@JsonIgnoreProperties({"messages","reservations"})
	private Client client;
	

}
