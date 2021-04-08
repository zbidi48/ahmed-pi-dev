package tn.esprit.Project.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_STOCK")
public class Stock {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long Idstock;
	private String ProductName;
	private int  nbrestock;
	
	
	
	
	
	
	


	public Stock(Long idstock, String ProductName, int nbrestock) {
		super();
		Idstock = idstock;
		this.nbrestock = nbrestock;
	}
	
	public Stock() {
		super(); 
	}

	public Long getIdstock() {
		return Idstock;
	}
	public void setIdstock(Long idstock) {
		Idstock = idstock;
	}
	public int getNbrestock() {
		return nbrestock;
	}
	public void setNbrestock(int nbrestock) {
		this.nbrestock = nbrestock;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}


	

}
