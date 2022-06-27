package com.exercise.ensolvers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.ensolvers.interfaceService.ICategoryService;
import com.exercise.ensolvers.interfaces.ICategory;
import com.exercise.ensolvers.model.Category;

@Service
public class CategoryService implements ICategoryService{
	
	@Autowired
	private ICategory iCategory;

	@Override
	public List<Category> findAll() {
		return (List<Category>) iCategory.findAll();
	}
	
	@Override
	public Optional<Category> findByid(Integer id) {
		return (Optional<Category>) iCategory.findById(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category save(Category category) {
		return iCategory.save(category);
	}
}
