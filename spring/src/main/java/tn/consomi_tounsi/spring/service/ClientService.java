package tn.consomi_tounsi.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomi_tounsi.spring.entities.Client;
import tn.consomi_tounsi.spring.repos.ClientRepository;
@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	 
	
	public String addClientService(Client client) {
		clientRepository.save(client);
		return "client addded";
		
		
	}
	
}
