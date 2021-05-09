package com.Gestion.vente.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Gestion.vente.demo.Entities.Client;
import com.Gestion.vente.demo.Entities.Product;
import com.Gestion.vente.demo.Model.ClientAjoutModel;
import com.Gestion.vente.demo.Response.ResponseController;
import com.Gestion.vente.demo.services.ClientService;
import com.Gestion.vente.demo.services.FactureService;

@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/client")
public class ClientController {

@Autowired
private ClientService clientsevice;
@Autowired
private FactureService factureservice;
@GetMapping("/list")

public List<Client> getClientslist()
{
	return this.clientsevice.getClientrepository().findAll();
}
@PostMapping("/add")
private ResponseController addNewclient( @RequestBody ClientAjoutModel c ) {
	Client client = new Client();
	
	if(c.getFirstname().length()>1 && c.getLastname().length()>1 && 8<c.getPsw().length() && c.getPsw().length()<16 )
	{
		client.setFirstname(c.getFirstname());
		client.setLastname(c.getLastname());
		
		client.setGarder(c.getGarder());
		client.setPsw(c.getPsw());
		
		this.clientsevice.getClientrepository().save(client);
		return new ResponseController("client ajouter avec succe",true);
		
	}
	else
	{
		return new ResponseController("nom&&prenom doit etre non vide superieure a 1 et mot de passe doit etre composer au moin de 8 caractere et au max 18",false);
	}
}
@GetMapping("/delete/{id}")
public void deleteclient(@PathVariable(value ="id") Long id){
	 this.clientsevice.getClientrepository().delete(   this.clientsevice.getClientrepository().findById(id).get()  );
}

@PostMapping("/update/{id}")
public void modiferProduit(@PathVariable(value ="id") Long id,@RequestBody ClientAjoutModel c ){

	Client client =  this.clientsevice.getClientrepository().findById(id).get();
    client.setLastname(c.getLastname());
    client.setFirstname(c.getFirstname());
	
	client.setPsw(c.getPsw());
	client.setGarder(c.getGarder());
	this.clientsevice.getClientrepository().save(client);
}
@GetMapping("/detailclient/{id}")
public Client afficherdetailclient(@PathVariable(value ="id") Long id)
{
	
	Client client = new Client();
	
	try
	{
		
		client=this.clientsevice.getClientrepository().findById(id).get();
	}
	catch(NoSuchElementException e)
	{
		System.out.println(e.getMessage());
	}
	catch(Exception e)
	{
		
	}
	
	return client;
}
	 

}

