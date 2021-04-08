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

import tn.esprit.Project.Service.TargetService;
import tn.esprit.Project.entites.Target;

@RestController
public class TargetController {
	@Autowired
	private TargetService t ;
	
	
	@GetMapping("/Target")
	  public List<Target> showTarget(){
		  return t.getAllTargets();
	  }
	  @PostMapping("/Target/Add")
	  public Target AddTarget (@RequestBody Target ta) {
		  
		  return t.UpadateTarget(ta);
	  }
	  @DeleteMapping("/Target/Delete/{id}")
	  public void Delete (@PathVariable("id") Long id) {
	 	 
		  t.DeletTargetById(id);;
	  }
	  @GetMapping("/Target/{id}")
	  public Target GetById (@PathVariable("id") Long id) {
	    
	    return t.getTarget(id);/*.orElseThrow(() -> new StockNotFoundException(id));*/
	  }
	  @PutMapping("/Target/Update/{id}")
	  public Target updateTarget (@RequestBody Target newtarget, @PathVariable Long id) {
	    
	        return t.UpadateTarget(newtarget);
	      }
	}




	

