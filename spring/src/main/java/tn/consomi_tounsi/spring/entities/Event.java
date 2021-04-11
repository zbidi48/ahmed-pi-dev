package tn.consomi_tounsi.spring.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idevent;
	private String title;
	private Date date_event;
	
	
	
	public Event(String title, Date date_event) {
		super();
		this.title = title;
		this.date_event = date_event;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdevent() {
		return idevent;
	}
	public void setIdevent(Long idevent) {
		this.idevent = idevent;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate_event() {
		return date_event;
	}
	public void setDate_event(Date date_event) {
		this.date_event = date_event;
	}
	
	
	
	
}
