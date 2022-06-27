package com.exercise.ensolvers.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.exercise.ensolvers.model.NoteCategory;

public interface INoteCategory extends CrudRepository<NoteCategory,Integer>{

	List<NoteCategory> findByIdCategory(Integer idCategory);
	
	List<NoteCategory> findByIdNote(Integer idNote);
}
