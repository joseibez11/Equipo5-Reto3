package com.ciclo3.reto.retoTres.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.retoTres.entidad.Room;
import com.ciclo3.reto.retoTres.repositorio.RoomRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository repository;
	
	public List<Room> getRoom() {
		return repository.findAll();
	}
	
	public Room getRoomById(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Room saveRoom(Room room) {
		return repository.save(room);
	}
	
	public void deleteRoom(long id) {
		repository.deleteById(id);
	}
	
	public Room updateRoom(Room update) {
		Room editRoom = getRoomById(update.getId());
		editRoom.setName(update.getName());
		editRoom.setHotel(update.getHotel());
		editRoom.setStars(update.getStars());
		editRoom.setDescription(update.getDescription());
		return repository.save(editRoom);
	}

}
