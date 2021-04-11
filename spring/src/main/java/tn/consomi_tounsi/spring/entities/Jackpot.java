package tn.consomi_tounsi.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Jackpot implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idjackpot;
	private Integer sum;
	private Date begining_date;
	private Date end_date;
	
	
	
	
	public Jackpot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jackpot(Integer sum, Date begining_date, Date end_date) {
		super();
		this.sum = sum;
		this.begining_date = begining_date;
		this.end_date = end_date;
	}
	public Long getIdjackpot() {
		return idjackpot;
	}
	public void setIdjackpot(Long idjackpot) {
		this.idjackpot = idjackpot;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Date getBegining_date() {
		return begining_date;
	}
	public void setBegining_date(Date begining_date) {
		this.begining_date = begining_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "Jackpot [idjackpot=" + idjackpot + ", sum=" + sum + ", begining_date=" + begining_date + ", end_date="
				+ end_date + "]";
	}
	
	
	
	
}
