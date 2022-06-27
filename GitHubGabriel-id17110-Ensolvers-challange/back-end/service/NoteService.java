package com.exercise.ensolvers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.ensolvers.interfaceService.INoteService;
import com.exercise.ensolvers.interfaces.INote;
import com.exercise.ensolvers.interfaces.INoteCategory;
import com.exercise.ensolvers.model.Note;
import com.exercise.ensolvers.model.NoteCategory;

@Service
public class NoteService implements INoteService {
	
	@Autowired
	private INote iNote;

	@Autowired
	private INoteCategory iNoteCategory;
	
	@Override
	public List<Note> findByStatus(boolean bool) {
		return (List<Note>) iNote.findByStatus(bool);
	}

	@Override
	public Note save(Note note) {
		return iNote.save(note);
	}
	
	@Override
	public Note saveById(Note note) {
		return iNote.save(note);
	}
	
	@Override
	public void delete(Integer id) {
		List<NoteCategory> noteCategories = iNoteCategory.findByIdNote(id);
		for (NoteCategory noteCategory : noteCategories) {
			iNoteCategory.delete(noteCategory);
		}
		iNote.deleteById(id);
	}

	@Override
	public Optional<Note> findByIdNote(Integer id) {
		return (Optional<Note>)iNote.findById(id);
	}

	@Override
	public void archivedNote(Integer id) {
		Optional<Note> note = iNote.findById(id);
		if(note.isPresent()){
			Note n = new Note();
			n.setIdNote(note.get().getIdNote());
			n.setTitle(note.get().getTitle());
			n.setText(note.get().getText());
			n.setDateUpdate(note.get().getDateUpdate());
			n.setUser(note.get().getUser());
			if(note.get().isStatus()){
				n.setStatus(false);
				iNote.save(n);
			}else{
				n.setStatus(true);
				iNote.save(n);
			}
		}
	}

}
