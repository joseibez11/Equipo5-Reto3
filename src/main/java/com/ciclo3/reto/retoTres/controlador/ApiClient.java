package com.ciclo3.reto.retoTres.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ciclo3.reto.retoTres.entidad.Client;
import com.ciclo3.reto.retoTres.servicio.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*")
public class ApiClient {
    @Autowired
    private ClientService service;

    @GetMapping("/all")
    public List<Client> getClients() {
        return service.getClient();
    }

    @PostMapping("/save")
    public ResponseEntity saveClient(@RequestBody Client client) {
        service.saveClient(client);
        return ResponseEntity.status(201).build();
    }
}
