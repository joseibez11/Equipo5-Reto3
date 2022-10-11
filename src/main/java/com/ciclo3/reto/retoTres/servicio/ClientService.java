package com.ciclo3.reto.retoTres.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.retoTres.entidad.Client;
import com.ciclo3.reto.retoTres.repositorio.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	/*Petición Get*/
	public List<Client> getClient() {
		return repository.findAll();
	}
	/*Petición Post*/
	public Client saveClient(Client client) {
		return repository.save(client);
	}
	
	public Client getClientbyId(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteClient(long id) {
		repository.deleteById(id);
	}
	
	public Client updateClient(Client update) {
		Client OldClient = getClientbyId(update.getIdClient());
		OldClient.setEmail(update.getEmail());
		OldClient.setName(update.getName());
		OldClient.setPassword(update.getPassword());
		OldClient.setName(update.getName());
		OldClient.setAge(update.getAge());
		return repository.save(OldClient);
		
	}

}
