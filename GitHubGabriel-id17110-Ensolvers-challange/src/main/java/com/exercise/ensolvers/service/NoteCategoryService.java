package com.exercise.ensolvers.service;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.ensolvers.interfaceService.INoteCategoryService;
import com.exercise.ensolvers.interfaces.ICategory;
import com.exercise.ensolvers.interfaces.INote;
import com.exercise.ensolvers.interfaces.INoteCategory;
import com.exercise.ensolvers.model.Category;
import com.exercise.ensolvers.model.Note;
import com.exercise.ensolvers.model.NoteCategory;

@Service
public class NoteCategoryService implements INoteCategoryService{
	
	@Autowired
	private INoteCategory iNoteCategory;

	@Autowired
	private INote iNote;

	@Autowired
	private ICategory iCategory;
	
	@Override
	public List<Note> findByIdCategory(Integer id) {
		List<NoteCategory> noteCategories = iNoteCategory.findByIdCategory(id);
		List<Note> notes = new ArrayList<Note>();
		for (NoteCategory noteCat : noteCategories) {
			Optional<Note> note = iNote.findById(noteCat.getIdNote());
			if ((note.get().isStatus()) && note.isPresent()) {
				Note n = new Note();
				n.setIdNote(note.get().getIdNote());
				n.setTitle(note.get().getTitle());
				n.setText(note.get().getText());
				n.setDateUpdate(note.get().getDateUpdate());
				n.setStatus(note.get().isStatus());
				n.setUser(note.get().getUser());
				notes.add(n);
			}
		}
		return notes;
	}

	@Override
	public void addNoteCategory(String[] category){
		Optional<Note> note = iNote.getLastIdNote();
		if(note.isPresent()){
			for(int i =0;i<category.length;i++){
				Optional<Category> cat = iCategory.findByNameCategory(category[i]);
				NoteCategory noteCategory = new NoteCategory();
				noteCategory.setIdNote(note.get().getIdNote());
				noteCategory.setIdCategory(cat.get().getIdCategory());
				iNoteCategory.save(noteCategory);
			}
		}	
	}

	@Override
	public List<Category> findByIdNote(Integer id) {
		List<NoteCategory> categories = iNoteCategory.findByIdNote(id);
		List<Category> cat = new ArrayList<Category>();
		for (NoteCategory noteCategory : categories) {
			Optional<Category> category = iCategory.findById(noteCategory.getIdCategory());
			Category temp = new Category();
			temp.setIdCategory(category.get().getIdCategory());
			temp.setNameCategory(category.get().getNameCategory());
			cat.add(temp);
		}
		return cat;
	}
}
