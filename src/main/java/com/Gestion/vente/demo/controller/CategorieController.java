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

import com.Gestion.vente.demo.Entities.Bills;
import com.Gestion.vente.demo.Entities.Categuorie;

import com.Gestion.vente.demo.Model.CategorieAjoutModel;
import com.Gestion.vente.demo.Model.factureajoutmodel;
import com.Gestion.vente.demo.services.CategorieService;


@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/categorie")
public class CategorieController {
	@Autowired
	private CategorieService categorieservice;
	
	@GetMapping("/list")

	public List<Categuorie> getCategorieList(){
		
		return  this.categorieservice.getCategorierepository().findAll();
	}
	@PostMapping("/add")
	private void addNewfacture( @RequestBody CategorieAjoutModel c ) {
		Categuorie cat = new Categuorie();
		
		
		cat.setName(c.getName());
		cat.setDescription(c.getDescription());
		this.categorieservice.getCategorierepository().save(cat);
	}	
	@GetMapping("/delete/{id}")
	private void deletecatergorie(@PathVariable(value="id") long id )
	{
		this.categorieservice.getCategorierepository().delete(this.categorieservice.getCategorierepository().findById(id).get());
	}
	 @PostMapping("/update/{id}")
	 public void modiferProduit(@PathVariable(value ="id") Long id,@Validated @RequestBody  CategorieAjoutModel c){

		 Categuorie cat =  this.categorieservice.getCategorierepository().findById(id).get();

	
		cat.setName(c.getName());
		cat.setDescription(c.getDescription());
		 this.categorieservice.getCategorierepository().save(cat);

	 }
	 @GetMapping("/detailcategorie/{id}")
	 public Categuorie afficherdetailcategorie(@PathVariable(value ="id") Long id)
	 {
	
		Categuorie cat = new Categuorie();
		try
		{
			
			cat = this.categorieservice.getCategorierepository().findById(id).get(); 
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			
		}
		
		return cat;
	 }
	 
}
