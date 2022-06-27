package com.exercise.ensolvers.interfaceService;

import java.util.List;

import com.exercise.ensolvers.model.Category;
import com.exercise.ensolvers.model.Note;

public interface INoteCategoryService {

	public List<Note>findByIdCategory(Integer id);

	public List<Category>findByIdNote(Integer id);

	public void addNoteCategory(String[] cadena);
}
