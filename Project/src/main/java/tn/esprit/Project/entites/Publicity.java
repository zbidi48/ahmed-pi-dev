package tn.esprit.Project.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_ADS")
public class Publicity {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long idPub;
	private String namePub;
	private Date beginDate ;
	private Date endingDate;
	private Integer nbrePersonne ;
	
	
	
	
	
	public Publicity() {
		super();
		}
	
	
	
	public Publicity(String namePub, Date beginDate, Date endingDate, Integer nbrePersonne) {
		super();
		this.namePub = namePub;
		this.beginDate = beginDate;
		this.endingDate = endingDate;
		this.nbrePersonne = nbrePersonne;
	}



	public Long getIdPub() {
		return idPub;
	}
	public void setIdPub(Long idPub) {
		this.idPub = idPub;
	}
	public String getNamePub() {
		return namePub;
	}
	public void setNamePub(String namePub) {
		this.namePub = namePub;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	public Integer getNbrePersonne() {
		return nbrePersonne;
	}
	public void setNbrePersonne(Integer nbrePersonne) {
		this.nbrePersonne = nbrePersonne;
	}



	@Override
	public String toString() {
		return "Publicity [idPub=" + idPub + ", namePub=" + namePub + ", beginDate=" + beginDate + ", endingDate="
				+ endingDate + ", nbrePersonne=" + nbrePersonne + "]";
	}
	
	
	

}
