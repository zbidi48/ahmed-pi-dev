package com.Gestion.vente.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestion.vente.demo.repository.BillsReposytory;
import com.Gestion.vente.demo.repository.CategorieRepository;
import com.Gestion.vente.demo.repository.ClientRepositor;
@Service()
public class FactureService {
	@Autowired
private BillsReposytory facturereprository;
	@Autowired
private ClientRepositor clientrepository;
	
public BillsReposytory getFacturereprository() {
		return facturereprository;
	}

	public void setFacturereprository(BillsReposytory facturereprository) {
		this.facturereprository = facturereprository;
	}



public ClientRepositor getClientrepository() {
		return clientrepository;
	}

	public void setClientrepository(ClientRepositor clientrepository) {
		this.clientrepository = clientrepository;
	}

public FactureService() {
	super();
}
} 
