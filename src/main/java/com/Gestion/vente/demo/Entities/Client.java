package com.Gestion.vente.demo.Entities;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
private long id;
	//@Length(max=15,min=3)
	@Column(name="lastname",nullable =false)
	private String lastname;
	@Column(name="firstname",nullable =false)
	private String firstname;
	@Column(name="garder",nullable =false)
	private String garder;
	@Column(name="psw",nullable =false)
	private String psw;
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private List<Bills> bills;
	
	
public Client(long id, String lastname, String firstname, String garder, String psw, List<Bills> bills) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.garder = garder;
		this.psw = psw;
		this.bills = bills;
	}


public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getGarder() {
		return garder;
	}


	public void setGarder(String garder) {
		this.garder = garder;
	}


	public String getPsw() {
		return psw;
	}


	public void setPsw(String psw) {
		this.psw = psw;
	}


	public List<Bills> getBills() {
		return bills;
	}


	public void setBills(List<Bills> bills) {
		this.bills = bills;
	}


public Client()
{
	super();
}
}
