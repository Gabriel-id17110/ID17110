package com.exercise.ensolvers.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.exercise.ensolvers.model.Note;

public interface INote extends CrudRepository<Note, Integer>{

	List<Note> findByStatus(boolean status);

	@Query(value="SELECT * FROM note ORDER BY idnote DESC LIMIT 1;",nativeQuery = true)
	Optional<Note> getLastIdNote();
}
