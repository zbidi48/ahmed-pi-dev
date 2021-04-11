package com.Gestion.vente.demo.Model;

import java.sql.Date;

public class CommandeAjoutModel {


	
private Date datecomande;
	
private String paymenttype;

private long idclient;

private long idproduit;

private int quantity;

private long idpayementtype;
private String typedepay;
public Date getDatecomande() {
	return datecomande;
}
public void setDatecomande(Date datecomande) {
	this.datecomande = datecomande;
}
public String getPaymenttype() {
	return paymenttype;
}
public void setPaymenttype(String paymenttype) {
	this.paymenttype = paymenttype;
}
public long getIdclient() {
	return idclient;
}
public void setIdclient(long idclient) {
	this.idclient = idclient;
}
public long getIdproduit() {
	return idproduit;
}
public void setIdproduit(long idproduit) {
	this.idproduit = idproduit;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public long getIdpayementtype() {
	return idpayementtype;
}
public void setIdpayementtype(long idpayementtype) {
	this.idpayementtype = idpayementtype;
}
public String getTypedepay() {
	return typedepay;
}
public void setTypedepay(String typedepay) {
	this.typedepay = typedepay;
}






}
