package tn.consomi_tounsi.spring.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcommande;
	private Integer paymenttype;
@OneToMany(cascade=CascadeType.ALL,mappedBy ="commandes")
	private Set<Product> products;
	public Integer getPaymenttype() {
	return paymenttype;
}
public void setPaymenttype(Integer paymenttype) {
	this.paymenttype = paymenttype;
}
}
