package com.Gestion.vente.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduct;
	@Column(name = "Name", nullable = false)
	private String name;
	@Column(name = "Price", nullable = false)
	private double price;
	@Column(name = "Weight", nullable = false)
	private float weight;
	@Column(name = "Quantity", nullable = false)
	private float quantity;
	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "photoURL", nullable = true)
	private String photoURL;
	
	
	
	public String getPhotoURL() {
		return photoURL;
	}


	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}


	@ManyToOne()
	@JoinColumn( name="categories_id" )
	private Categuorie categuorie;

	public Product(long idProduct, String name, double price, float weight, float quantity, String date,
			Categuorie categuorie) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.quantity = quantity;
		this.date = date;
		this.categuorie = categuorie;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public float getQuantity() {
		return quantity;
	}


	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Categuorie getCateguorie() {
		return categuorie;
	}


	public void setCateguorie(Categuorie categuorie) {
		this.categuorie = categuorie;
	}


	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}


	
	public long getIdProduct() {
		return idProduct;
	}


	public Product() {
		super();

	}

}