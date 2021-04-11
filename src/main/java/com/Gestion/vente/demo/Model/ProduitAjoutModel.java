package com.Gestion.vente.demo.Model;



import java.sql.Date;



import com.Gestion.vente.demo.Entities.Categuorie;

public class ProduitAjoutModel {

private String name;
private double price;
private float weight;
private float quantity;
private String date;

private long categuorie_id;

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

public long getCateguorie_id() {
	return categuorie_id;
}

public void setCateguorie_id(long categuorie_id) {
	this.categuorie_id = categuorie_id;
}

public ProduitAjoutModel()
{
	super();
}
}
