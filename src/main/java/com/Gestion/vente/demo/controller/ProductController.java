package com.Gestion.vente.demo.controller;
import java.time.LocalDate;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gestion.vente.demo.Entities.Categuorie;
import com.Gestion.vente.demo.Entities.Product;
import com.Gestion.vente.demo.Model.ProduitAjoutModel;

import com.Gestion.vente.demo.Response.ResponseController;
import com.Gestion.vente.demo.repository.ProductRepository;
import com.Gestion.vente.demo.services.ProduitService;

@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/product")

public class ProductController  {
	@Autowired
	private ProduitService produitService;
	
	@GetMapping("/list")

	public List<Product> getProduitsList(){
		
		return  this.produitService.getProduitRepository().findAll();
	}
	@PostMapping("/add")
	private ResponseController addNewProduit(@Validated @RequestBody ProduitAjoutModel p ) {
		
			Product produit = new Product();
			ResponseController res = new ResponseController();
			if(p.getName().equals("") )
			{
				res.setSucces(false);
				res.setMessage("produit doit etre non vide");
			}
			else
			{
				produit.setName(p.getName());
				produit.setPrice(p.getPrice());
				produit.setQuantity(p.getQuantity());
				produit.setWeight(p.getWeight());
				

				produit.setDate(p.getDate());
				//System.out.println(p.getCateguorie_id()+"zbidi");
				
				Categuorie cteguorie=this.produitService.getCategorieRepository().findById(p.getCateguorie_id()).get();
				
				
				
				//System.out.print(cteguorie.getName());
				
				
				produit.setCateguorie(cteguorie);
				
				this.produitService.getProduitRepository().save(produit);
				res.setSucces(true);
				res.setMessage("produit insirer");
			}
			return res;
			
		
		  
	}
	 @GetMapping("/delete/{id}")
	 public void deleteProduit(@PathVariable(value ="id") Long id){
		 this.produitService.getProduitRepository().delete(   this.produitService.getProduitRepository().findById(id).get()  );
	 }

	 @PostMapping("/update/{id}")
	 public void modifierProduit(@PathVariable(value ="id") Long id,@Validated @RequestBody ProduitAjoutModel p ){

		Product produit =  this.produitService.getProduitRepository().findById(id).get();

		 produit.setName(p.getName());
		 produit.setPrice(p.getPrice());
		 produit.setQuantity(p.getQuantity());
		 produit.setWeight(p.getWeight());
		 produit.setDate(p.getDate());

		 this.produitService.getProduitRepository().save(produit);

	 }
	 @GetMapping("/detailproduit/{id}")
	 public Product afficherdetailproduit(@PathVariable(value ="id") Long id)
	 {
		Product produit = new Product();
		try
		{
			produit=this.produitService.getProduitRepository().findById(id).get();
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			
		}
		
		return produit;
	 }
		 
		 
		 
}
