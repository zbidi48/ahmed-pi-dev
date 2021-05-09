package com.Gestion.vente.demo.controller;

import java.sql.Date;
import java.util.ArrayList;
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
import com.Gestion.vente.demo.Entities.Commande;
import com.Gestion.vente.demo.Entities.Product;
import com.Gestion.vente.demo.Model.CommandeAjoutModel;
import com.Gestion.vente.demo.repository.CommandeRepository;
import com.Gestion.vente.demo.services.ClientService;
import com.Gestion.vente.demo.services.CommandeService;
import com.Gestion.vente.demo.services.ProduitService;



@RestController
@CrossOrigin("*")
@RequestMapping("/commande")

public class CommandeController {
	@Autowired
	private CommandeService commandeservice;
	@Autowired
	private ProduitService produitservice;
	@Autowired
	private ClientService clientservice;
	
	@GetMapping("/list")
	public List<Commande> getcommandelist()
	{
		return this.commandeservice.getCommanderepository().findAll();
	}
	
	
	@GetMapping("/list/filter/{idtypep}/{idclient}")
	public List<Commande> getcommandelist(@PathVariable(value ="idtypep") Long idtypep,@PathVariable(value ="idclient") Long idclient)
	{
		List<Commande> res =new ArrayList<Commande>();
		List<Commande> bdcommnde =this.commandeservice.getCommanderepository().findAll();
		
		

		
		for(Commande c:bdcommnde) {
			if( c.getClient().getId() ==  idclient) {
				
				if( c.getMethodepay().getId() ==  idtypep) {
					res.add(c);
					
				}
			}
			
		}
		
		
		
		return res;
	}
	

	
	
	
	@PostMapping("/add")
	private void addnewcmd( @RequestBody CommandeAjoutModel cmd )
	{
		Commande commande = new Commande();
		
		commande.setQuantity(cmd.getQuantity());
		commande.setClient(this.clientservice.getClientrepository().findById(cmd.getIdclient()).get());
		commande.setProduit(this.produitservice.getProduitRepository().findById(cmd.getIdproduit()).get());
		commande.setMethodepay( this.commandeservice.getMethodeofpayRepository().findById(cmd.getIdpayementtype()).get() );
	  
		
		
		long m = System.currentTimeMillis();
		
		 commande.setDatecomande( new Date(m) );
		 this.commandeservice.getCommanderepository().save(commande);
	}
	
	
	
	@GetMapping("/delete/{id}")
	 public void deleteProduit(@PathVariable(value ="id") Long id){
		 this.commandeservice.getCommanderepository().delete(   this.commandeservice.getCommanderepository().findById(id).get()  );
	 }

	 @PostMapping("/update/{id}")
	 public void modiferProduit(@PathVariable(value ="id") Long id, @RequestBody CommandeAjoutModel cmd ){

		Commande commande =  this.commandeservice.getCommanderepository().findById(id).get();

		commande.setQuantity(cmd.getQuantity());
		commande.setClient(this.clientservice.getClientrepository().findById(cmd.getIdclient()).get());
		commande.setProduit(this.produitservice.getProduitRepository().findById(cmd.getIdproduit()).get());
		commande.setMethodepay( this.commandeservice.getMethodeofpayRepository().findById(cmd.getIdpayementtype()).get() );
		 commande.setDatecomande(cmd.getDatecomande());
		 commande.setDatecomande(cmd.getDatecomande());
		 this.commandeservice.getCommanderepository().save(commande);
	 }
	 @GetMapping("/detailcommande/{id}")
	 public Commande afficherdetailcommande(@PathVariable(value ="id") Long id)
	 {
	
		 Commande commande = new Commande();
		try
		{
			
			commande = this.commandeservice.getCommanderepository().findById(id).get();
		}

					catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			
		}
		
		return commande;
	 }
		 

}
