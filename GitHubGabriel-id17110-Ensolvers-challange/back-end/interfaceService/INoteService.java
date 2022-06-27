package com.exercise.ensolvers.interfaceService;

import java.util.List;
import java.util.Optional;

import com.exercise.ensolvers.model.Note;

public interface INoteService {

	public List<Note>findByStatus(boolean bool);
	
	public Note save(Note note);
	
	public Note saveById(Note note);

	public void archivedNote(Integer id);
	
	public void delete(Integer id);

	public Optional<Note> findByIdNote(Integer id);
}
