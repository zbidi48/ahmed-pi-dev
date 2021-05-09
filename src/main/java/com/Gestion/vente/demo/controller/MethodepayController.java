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

import com.Gestion.vente.demo.Entities.Categuorie;
import com.Gestion.vente.demo.Entities.Methodeofpay;
import com.Gestion.vente.demo.Model.CategorieAjoutModel;
import com.Gestion.vente.demo.Model.Methodepaymodel;
import com.Gestion.vente.demo.services.MethodepayService;

@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/methodepay")
public class MethodepayController {
	@Autowired
	private MethodepayService methodepayservice;
	@GetMapping("/list")
public List<Methodeofpay> getmethodepayist(){
		
		return  this.methodepayservice.getMethodepayrepository().findAll();
		
	}
@PostMapping("/add")
private void ajoutmethpay( @RequestBody Methodepaymodel m ) {
	
	Methodeofpay meth = new Methodeofpay();
	meth.setName(m.getName());
	this.methodepayservice.getMethodepayrepository().save(meth);
	
	
}	
@PostMapping("/update/{id}")
public void modiferProduit(@PathVariable(value ="id") Long id, @RequestBody Methodepaymodel m){

	
	Methodeofpay meth=this.methodepayservice.getMethodepayrepository().findById(id).get();
	meth.setName(m.getName());
	//this.methodepayservice.getMethodepayrepository().save(meth);

}
@GetMapping("/delete/{id}")
private void deletecatergorie(@PathVariable(value="id") long id )
{
	
	this.methodepayservice.getMethodepayrepository().delete(this.methodepayservice.getMethodepayrepository().findById(id).get());
}
	


@GetMapping("/detailmethodepay/{id}")
public Methodeofpay afficherdetailmethodepay(@PathVariable(value ="id") Long id)
{

	
	Methodeofpay meth= new Methodeofpay();
	try
	{
		meth = this.methodepayservice.getMethodepayrepository().findById(id).get();
		
	}
	catch(NoSuchElementException e)
	{
		System.out.println(e.getMessage());
	}
	catch(Exception e)
	{
		
	}
	
	return meth;
}
}
