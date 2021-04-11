package com.Gestion.vente.demo.Entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="bills")
@JsonIgnoreProperties( {"hibernateLazyInitializer","handler","client"} )
public class Bills {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
private long idbill;
	@Column(name="Amount",nullable =false)
private float amount;
@Column(name="type",nullable =false)
private String type;



@ManyToOne()
@JoinColumn( name= "client_id" )
private Client client;



public long getIdbill() {
	return idbill;
}



public void setIdbill(long idbill) {
	this.idbill = idbill;
}



public float getAmount() {
	return amount;
}



public void setAmount(float amount) {
	this.amount = amount;
}



public String getType() {
	return type;
}



public void setType(String type) {
	this.type = type;
}



public Client getClient() {
	return client;
}



public void setClient(Client client) {
	this.client = client;
}



public Bills(long idbill, float amount, String type, Client client) {
	super();
	this.idbill = idbill;
	this.amount = amount;
	this.type = type;
	this.client = client;
}



public Bills()
{
	super();
}
}
