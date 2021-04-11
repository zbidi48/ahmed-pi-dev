package com.Gestion.vente.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public  class Categuorie {

	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id ;
	
	
	@Column(name="name",nullable =false,unique=true)	
	private String name;
	
	@Column(name="description",nullable =false)	
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Categuorie(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Categuorie() {
		super();
	}
	
	
}
