package com.exercise.ensolvers.interfaceService;

import java.util.List;
import java.util.Optional;

import com.exercise.ensolvers.model.Category;


public interface ICategoryService {

	public List<Category>findAll();
	
	public Optional<Category>findByid(Integer id);
	
	public Category save(Category category);
	
	public void delete(Integer id);
}
