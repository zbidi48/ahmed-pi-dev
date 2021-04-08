package tn.esprit.Project.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="T_PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long IdProduit;
	private String nomProduits;
	private Double prixProduits;
	private String description;
	private int quantity;
	private Date dateCreate;
	//private int  like;
	
	public Product() {
		super();	
	}
	
	public Product(String nomProduits, double prixProduits, String description, int quantity, Date dateCreate, Integer like) {
		super();
		this.nomProduits = nomProduits;
		this.prixProduits = prixProduits;
		this.description = description;
		this.quantity = quantity;
		this.dateCreate = dateCreate;
	}



	public Long getIdProduit() {
		return IdProduit;
	}
	public void setIdProduit(Long idProduit) {
		IdProduit = idProduit;
	}
	public String getNomProduits() {
		return nomProduits;
	}
	public void setNomProduits(String nomProduits) {
		this.nomProduits = nomProduits;
	}
	public double getPrixProduits() {
		return prixProduits;
	}
	public void setPrixProduits(double prixProduits) {
		this.prixProduits = prixProduits;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}



/*	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}*/

	@Override
	public String toString() {
		return "Product [IdProduit=" + IdProduit + ", prixProduits=" + prixProduits + ", quantity=" + quantity
				+ ", dateCreate=" + dateCreate + "]";
	}
	
	

}
