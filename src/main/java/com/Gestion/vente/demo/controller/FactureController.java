package com.Gestion.vente.demo.controller;


import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gestion.vente.demo.Entities.Bills;
import com.Gestion.vente.demo.Entities.Categuorie;
import com.Gestion.vente.demo.Entities.Client;
import com.Gestion.vente.demo.Entities.Commande;
import com.Gestion.vente.demo.Entities.Product;
import com.Gestion.vente.demo.Model.CommandeAjoutModel;
import com.Gestion.vente.demo.Model.ProduitAjoutModel;
import com.Gestion.vente.demo.Model.factureajoutmodel;
import com.Gestion.vente.demo.services.ClientService;
import com.Gestion.vente.demo.services.FactureService;
import com.Gestion.vente.demo.services.ProduitService;



@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/bills")
public class FactureController {
	@Autowired
	private FactureService factureService;
	@Autowired
	private ClientService clientservice;
	
	
	
	@GetMapping("/list")

	public List<Bills> getProduitsList(){
		
		return  this.factureService.getFacturereprository().findAll();
	}
	@PostMapping("/add")
	private void addNewfacture( @Validated @RequestBody factureajoutmodel b  ) {
		Bills facture = new Bills();
		
		facture.setType(b.getType());
		facture.setAmount(b.getAmount());
		
		Client client = this.factureService.getClientrepository().findById(b.getClient_id()).get();
		facture.setClient(client);
		

		this.factureService.getFacturereprository().save(facture);
		
	
	}	
	 @PostMapping("/update/{id}")
	 public void modiferfacture(@PathVariable(value ="id") Long id, @Validated @RequestBody factureajoutmodel f )
	 {


		 Bills facture= this.factureService.getFacturereprository().findById(id).get();
		 facture.setAmount(f.getAmount());
		 facture.setType(f.getType());
		 

	 }
	@GetMapping("/delete/{id}")
	private void deletefacture(@Validated @PathVariable(value="id") long id )
	{
		this.factureService.getFacturereprository().delete((this.factureService.getFacturereprository().findById(id).get()));
	}
	@GetMapping("/list/filter/{idclient}")
	public List<Bills> getfacturelistParclient(@PathVariable(value ="idclient") long idclient)
	{
		List<Bills> res =new ArrayList<Bills>();
		
		List<Bills> dbbills= this.factureService.getFacturereprository().findAll();
		
		for(Bills b :dbbills)
		{
			if(b.getClient().getId()==idclient)
		
				res.add(b);
			}
		
		return res;
		}
         
		
		
		@GetMapping("/list/filterage/{typefacture}") 
		private List<Bills> getfacturepartype(@PathVariable(value="typefacture") String typefacture)
		{
			//System.out.println(typefacture);
			List<Bills> res = new ArrayList<Bills>();
			List<Bills> dbbills = this.factureService.getFacturereprository().findAll();
			for(Bills b :dbbills)
			{
				//System.out.println(b.getType());
				if(b.getType().equals(typefacture))
				{
					res.add(b);
				}
			}
			return res;
		}
		@GetMapping("/list/trierfacture")
		
		public  List<Bills> trierfactureordercroissant()
		{
			List<Bills> dbfact = this.factureService.getFacturereprository().trierfactureordercroissant();
			
		return dbfact;
		}
		@GetMapping("/listpdf")
		public ResponseEntity<InputStreamResource> getbillsListPf(){
			
			List<Bills> bills =  this.factureService.getFacturereprository().trierfactureordercroissant();
			
			ByteArrayInputStream bis = Generatepdfrapport.clientsReporte(bills);
			
			
			HttpHeaders headers = new HttpHeaders();
	        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

	        return ResponseEntity
	                .ok()
	                .headers(headers)
	                .contentType(MediaType.APPLICATION_PDF)
	                .body(new InputStreamResource(bis));
			
			
		}

		
		 @GetMapping("/detailfacture/{id}")
		 public Bills afficherdetailfacture(@PathVariable(value ="id") Long id)
		 {
		
			 Bills facture = new Bills();
			try
			{
				
				facture = this.factureService.getFacturereprository().findById(id).get();
			}
			catch(NoSuchElementException e)
			{
				System.out.println(e.getMessage());
			}
			catch(Exception e)
			{
				
			}
			
			return facture;
		 }
			 
	
		
	
	
}
