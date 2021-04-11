package com.Gestion.vente.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestion.vente.demo.repository.CommandeRepository;
import com.Gestion.vente.demo.repository.MethodeofpayRepository;

@Service()
public class CommandeService {
	@Autowired
	private CommandeRepository commanderepository;
	@Autowired
	private MethodeofpayRepository methodeofpayRepository;

	public MethodeofpayRepository getMethodeofpayRepository() {
		return methodeofpayRepository;
	}

	public void setMethodeofpayRepository(MethodeofpayRepository methodeofpayRepository) {
		this.methodeofpayRepository = methodeofpayRepository;
	}

	public CommandeRepository getCommanderepository() {
		return commanderepository;
	}

	public void setCommanderepository(CommandeRepository commanderepository) {
		this.commanderepository = commanderepository;
	}
	

}
