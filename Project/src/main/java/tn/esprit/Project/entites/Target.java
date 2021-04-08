package tn.esprit.Project.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="T_TARGET")
public class Target {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long idTraget ;
	private int age ;
	private String gender;
	
	
	public Target() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Target(int age, String gender) {
		super();
		this.age = age;
		this.gender = gender;
	}


	public Long getIdTraget() {
		return idTraget;
	}
	public void setIdTraget(Long idTraget) {
		this.idTraget = idTraget;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Target [idTraget=" + idTraget + ", age=" + age + ", gender=" + gender + "]";
	}
	

}
