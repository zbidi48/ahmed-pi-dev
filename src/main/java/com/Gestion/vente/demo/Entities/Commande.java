package com.Gestion.vente.demo.Entities;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="cammande")
public class Commande {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)

private long idcomande;
	@Column(name="Date_of_comande",nullable =false)
private Date datecomande;

	
	@Column(name="quantity",nullable =false)
	private int quantity;
	
	
	
	@ManyToOne()
	@JoinColumn( name="Client_id" )
	private Client client;
	

	@ManyToOne()
	@JoinColumn( name="Product_id" )
	private Product produit;
	
	@ManyToOne()
	@JoinColumn(name="methodeofpay_id")
	private Methodeofpay methodepay;
	
	
	
	
	





public Commande(long idcomande, Date datecomande, String paymenttype, int quantity, Client client, Product produit,
			Methodeofpay methodepay) {
		super();
		this.idcomande = idcomande;
		this.datecomande = datecomande;
		this.quantity = quantity;
		this.client = client;
		this.produit = produit;
		this.methodepay = methodepay;
	}










public long getIdcomande() {
		return idcomande;
	}










	public void setIdcomande(long idcomande) {
		this.idcomande = idcomande;
	}










	public Date getDatecomande() {
		return datecomande;
	}










	public void setDatecomande(Date datecomande) {
		this.datecomande = datecomande;
	}























	public int getQuantity() {
		return quantity;
	}










	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}










	public Client getClient() {
		return client;
	}










	public void setClient(Client client) {
		this.client = client;
	}










	public Product getProduit() {
		return produit;
	}










	public void setProduit(Product produit) {
		this.produit = produit;
	}










	public Methodeofpay getMethodepay() {
		return methodepay;
	}










	public void setMethodepay(Methodeofpay methodepay) {
		this.methodepay = methodepay;
	}










public Commande()
{
super();
}
}

