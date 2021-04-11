package com.Gestion.vente.demo.Model;

public class factureajoutmodel {
	

	private String type;
	private float amount;
	private long client_id;
	
	
	
	


	



	public factureajoutmodel(String type, float amount, long client_id) {
		super();
		this.type = type;
		this.amount = amount;
		this.client_id = client_id;
	}










	public String getType() {
		return type;
	}










	public void setType(String type) {
		this.type = type;
	}










	public float getAmount() {
		return amount;
	}










	public void setAmount(float amount) {
		this.amount = amount;
	}










	public long getClient_id() {
		return client_id;
	}










	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}










	public factureajoutmodel()
	{
		super();
	}
}
