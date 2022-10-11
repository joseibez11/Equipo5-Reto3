package com.ciclo3.reto.retoTres.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.retoTres.entidad.Category;
import com.ciclo3.reto.retoTres.repositorio.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> getCategory() {
		return repository.findAll();
	}
	
	public Category getCategoryById(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Category saveCategory(Category category) {
		return repository.save(category);
	}
	
	public void deleteCategory(long id) {
		repository.deleteById(id);
	}
	
	public Category updateCategory (Category update) {
		Category OldCategory = getCategoryById(update.getId());
		OldCategory.setName(update.getName());
		OldCategory.setDescription(update.getDescription());
		return repository.save(OldCategory);
	}
}
