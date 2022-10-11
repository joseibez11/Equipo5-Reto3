package com.ciclo3.reto.retoTres.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.retoTres.entidad.Message;
import com.ciclo3.reto.retoTres.repositorio.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	MessageRepository repository;
	
	public List<Message> getMessage() {
		return repository.findAll();
	}
	
	public Message getMessagebyId(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Message saveMessage(Message message) {
		return repository.save(message);
	}
	
	public void deleteMessage(long id) {
		repository.deleteById(id);
	}
	
	public Message updateMessage(Message update) {
		Message OldMessage = getMessagebyId(update.getIdMessage());
		OldMessage.setMessageText(update.getMessageText());
		return repository.save(OldMessage);
	}
}
