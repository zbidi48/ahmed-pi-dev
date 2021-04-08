package tn.esprit.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.Project.Service.PublicityService;
import tn.esprit.Project.entites.Publicity;


@RestController
public class PublicityController {
	@Autowired
	private PublicityService publicityservice;
	
	 @GetMapping("/Pub")
	  public List<Publicity> showPub(){
		  return publicityservice.getAllPublicitys();
	  }
	  @PostMapping("/Pub/Add")
	  public Publicity AddPublicity (@RequestBody Publicity p) {
		  
		  return publicityservice.UpadatePublicity(p);
	  }
	  @DeleteMapping("/Pub/Delete/{id}")
	  public void Delete (@PathVariable("id") Long id) {
	 	 
		  publicityservice.DeletPublicityById(id);
	  }
	  @GetMapping("/Pub/{id}")
	  public Publicity GetById (@PathVariable("id") Long id) {
	    
	    return publicityservice.getPublicity(id);/*.orElseThrow(() -> new StockNotFoundException(id));*/
	  }
	  @PutMapping("/pub/Update/{id}")
	  public Publicity updatePublicity (@RequestBody Publicity newpub, @PathVariable Long id) {
	    
	        return publicityservice.UpadatePublicity(newpub);
	      }
	}



