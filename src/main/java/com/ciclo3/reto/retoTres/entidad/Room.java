package com.ciclo3.reto.retoTres.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String hotel;
	private int stars;
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	@JsonIgnoreProperties("rooms")
	private Category category;
	
	@OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "room")
	@JsonIgnoreProperties({ "room", "client" })
	private List<Message> messages;
	
	@OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "room")
	@JsonIgnoreProperties({ "room", "messages" })
	private List<Reservation> reservations;
}
