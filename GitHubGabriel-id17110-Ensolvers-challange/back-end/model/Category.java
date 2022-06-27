package com.exercise.ensolvers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@Column(name = "idcategory")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCategory;
	
	@Column(name = "namecategory" )
	private String nameCategory;
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	
}
