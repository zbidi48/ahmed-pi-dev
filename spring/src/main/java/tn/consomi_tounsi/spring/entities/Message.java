package tn.consomi_tounsi.spring.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MESSAGE")
public class Message {
	
	public Message(int id_message, int id_emmetteur, int id_recepteur, String text, Date date_message) {
		super();
		this.id_message = id_message;
		this.id_emmetteur = id_emmetteur;
		this.id_recepteur = id_recepteur;
		this.text = text;
		this.date_message = date_message;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_message;
	private int id_emmetteur;
	private int id_recepteur;
	private String text;
	private Date date_message;
	public int getId_message() {
		return id_message;
	}
	public void setId_message(int id_message) {
		this.id_message = id_message;
	}
	public int getId_emmetteur() {
		return id_emmetteur;
	}
	public void setId_emmetteur(int id_emmetteur) {
		this.id_emmetteur = id_emmetteur;
	}
	public int getId_recepteur() {
		return id_recepteur;
	}
	public void setId_recepteur(int id_recepteur) {
		this.id_recepteur = id_recepteur;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate_message() {
		return date_message;
	}
	public void setDate_message(Date date_message) {
		this.date_message = date_message;
	}

}
