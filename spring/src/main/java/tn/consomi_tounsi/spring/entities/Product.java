package tn.consomi_tounsi.spring.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="PRODUCT")

public class Product { 
	public Product(Long idproduct, String name, Double price, Date date_add, String descrption, int quantity,
			int nbr_vente, Commande commandes) {
		super();
		this.idproduct = idproduct;
		this.name = name;
		Price = price;
		this.date_add = date_add;
		this.descrption = descrption;
		this.quantity = quantity;
		this.nbr_vente = nbr_vente;
		this.commandes = commandes;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idproduct;
	private String name;
	private Double Price;
	private Date date_add;
	private String descrption;
	private int quantity;
	private int nbr_vente;
	
	
	@ManyToOne
    private Commande commandes;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	


	public Long getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(Long idproduct) {
		this.idproduct = idproduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public Date getDate_add() {
		return date_add;
	}
	public void setDate_add(Date date_add) {
		this.date_add = date_add;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Integer getNbr_vente() {
		return nbr_vente;
	}



	public void setNbr_vente(Integer nbr_vente) {
		this.nbr_vente = nbr_vente;
	}
	
	
	
	
}
