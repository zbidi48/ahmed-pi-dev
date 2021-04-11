package com.Gestion.vente.demo.Response;

public class ResponseController {
	private String message;
	private boolean succes;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSucces() {
		return succes;
	}
	public void setSucces(boolean succes) {
		this.succes = succes;
	}
	public ResponseController(String message, boolean succes) {
		super();
		this.message = message;
		this.succes = succes;
	}
	public ResponseController()
	{
		super();
	}

}
