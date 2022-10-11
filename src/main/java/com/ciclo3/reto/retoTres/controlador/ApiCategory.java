package com.ciclo3.reto.retoTres.controlador;

import com.ciclo3.reto.retoTres.entidad.Category;
import com.ciclo3.reto.retoTres.servicio.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*")

public class ApiCategory {
    @Autowired
    private CategoryService service;

    @GetMapping("/all")
    public List<Category> getCategories() {
        return service.getCategory();
    }

    @PostMapping("/save")
    public ResponseEntity saveCategory(@RequestBody Category category) {
        service.saveCategory(category);
        return ResponseEntity.status(201).build();
    }
}
