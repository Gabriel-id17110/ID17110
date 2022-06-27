package com.exercise.ensolvers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.ensolvers.interfaceService.INoteService;
import com.exercise.ensolvers.model.Note;

@RestController
@CrossOrigin
@RequestMapping(path = "/note", produces = MediaType.APPLICATION_JSON_VALUE)
public class NoteApiController {

	@Autowired
	private INoteService iNoteService;
	
	@GetMapping("/noteByStatus{bool}")
	public List<Note> findByStatus(boolean bool){
		return (List<Note>)iNoteService.findByStatus(bool);
	}
	
	@GetMapping("/noteById{id}")
	public Optional<Note> findById(Integer id) {
		return (Optional<Note>)iNoteService.findByIdNote(id);
	}
	
	@PostMapping("/add")
	public Note addNoote(@RequestBody Note note) {
		return iNoteService.save(note);
	}
	
	@PutMapping("/updateNote")
	public Note updateNote(@RequestBody Note note) {
		return iNoteService.save(note);
	}

	@PutMapping("/archivedUnarchived{id}")
	public String archiveNote(Integer id){
		iNoteService.archivedNote(id);
		return "Archived Unarchived note"+id;
	}
	
	@DeleteMapping("/delete{id}")
	public String deleteNote(Integer id) {
		iNoteService.delete(id);
		return "Se eliminó la nota: "+id;
	}
}
