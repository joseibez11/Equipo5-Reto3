package com.ciclo3.reto.retoTres.controlador;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ciclo3.reto.retoTres.entidad.Message;
import com.ciclo3.reto.retoTres.servicio.MessageService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Message/")
public class ApiMessage {
    @Autowired
    private MessageService service;

    @GetMapping("/all")
    public List<Message> getMessages(){
        return service.getMessage();
    }

    @PostMapping("/save")
    public ResponseEntity saveMessage(@RequestBody Message message) {
        service.saveMessage(message);
        return ResponseEntity.status(201).build();
    }
}

