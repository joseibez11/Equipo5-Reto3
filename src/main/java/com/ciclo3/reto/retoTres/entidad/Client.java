package com.ciclo3.reto.retoTres.entidad;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idClient;
	private String email;
	private String password;
	private String name;
	private int age;
	
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
	@JsonIgnoreProperties("client")
	private List<Message> messages;
	
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
	@JsonIgnoreProperties("client")
	private List<Reservation> reservations;
}
