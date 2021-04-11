package com.Gestion.vente.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestion.vente.demo.repository.BillsReposytory;
import com.Gestion.vente.demo.repository.CategorieRepository;
import com.Gestion.vente.demo.repository.ClientRepositor;

@Service()
public class ClientService {
	@Autowired
	private ClientRepositor clientrepository;
	@Autowired
	private BillsReposytory facturerepository;
	public ClientRepositor getClientrepository() {
		return clientrepository;
	}
	public void setClientrepository(ClientRepositor clientrepository) {
		this.clientrepository = clientrepository;
	}
	public BillsReposytory getFacturerepository() {
		return facturerepository;
	}
	public void setFacturerepository(BillsReposytory facturerepository) {
		this.facturerepository = facturerepository;
	}
	

	
	
	

}
