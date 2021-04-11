package tn.consomi_tounsi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.consomi_tounsi.spring.entities.Client;
import tn.consomi_tounsi.spring.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	

	@PostMapping("/client/add")
	public String addClient(@RequestBody Client client) {
		return clientService.addClientService(client);
	}
}
