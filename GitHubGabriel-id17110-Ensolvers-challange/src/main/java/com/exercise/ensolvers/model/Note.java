package com.exercise.ensolvers.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class Note {

	@Id
	@Column(name = "idnote")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idNote;
	
	@Column(name ="title")
	private String title;
	
	@Column(name = "text")
	private String text;
	
	@Column(name = "dateupdate")
	private LocalDateTime dateUpdate;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name="user_iduser")
	private Integer user;

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdNote() {
		return idNote;
	}

	public void setIdNote(Integer idNote) {
		this.idNote = idNote;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(LocalDateTime dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	
}
