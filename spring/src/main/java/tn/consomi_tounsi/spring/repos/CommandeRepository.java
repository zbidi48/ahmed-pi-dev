package tn.consomi_tounsi.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.consomi_tounsi.spring.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
	void findByPaymenttype(String name);
	
	

}
