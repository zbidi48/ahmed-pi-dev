package com.Gestion.vente.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="methodeofpay")

public class Methodeofpay {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name",nullable =false)
	private String name;
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
	public Methodeofpay(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
public Methodeofpay()
{
	super();
}
}
