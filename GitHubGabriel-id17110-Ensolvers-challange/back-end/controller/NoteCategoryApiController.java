package com.exercise.ensolvers.controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.ensolvers.interfaceService.INoteCategoryService;
import com.exercise.ensolvers.model.Category;
import com.exercise.ensolvers.model.Note;

@RestController
@CrossOrigin
@RequestMapping(path="/noteCategory", produces = MediaType.APPLICATION_JSON_VALUE)
public class NoteCategoryApiController {

	@Autowired
	private INoteCategoryService iNoteCategoryService;
	
	@GetMapping("/findByCategory{id}")
	public List<Note> findByCategory(Integer id) {
		return (List<Note>)iNoteCategoryService.findByIdCategory(id);
	}

	@GetMapping("/findByNote{id}")
	private List<Category> findByNote(Integer id){
		return (List<Category>)iNoteCategoryService.findByIdNote(id);
	}

	@PostMapping("/addNoteCategory")
	public void addNoteCategory(@RequestBody String[] cadena){
		iNoteCategoryService.addNoteCategory(cadena);
	}
	
}
