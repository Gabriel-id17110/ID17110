package com.exercise.ensolvers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notecategory")
public class NoteCategory {
	
	@Id
	@Column(name = "idnotecategory")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idnotecategory;
	
	@Column(name = "note_idnote")
	private Integer idNote;
	
	@Column(name = "category_idcategory")
	private Integer idCategory;

	public NoteCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdnotecategory() {
		return idnotecategory;
	}

	public void setIdnotecategory(Integer idnotecategory) {
		this.idnotecategory = idnotecategory;
	}



	public Integer getIdNote() {
		return idNote;
	}

	public void setIdNote(Integer idNote) {
		this.idNote = idNote;
	}

	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}
	
}
