package com.exercise.ensolvers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.ensolvers.interfaceService.ICategoryService;
import com.exercise.ensolvers.model.Category;

@RestController
@CrossOrigin
@RequestMapping("/category")
public class CategoryApiController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@GetMapping("/list")
	public List<Category> findAllCategories() {
		return categoryService.findAll();
	}
	
	@PostMapping("/add")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.save(category);
	}

}
