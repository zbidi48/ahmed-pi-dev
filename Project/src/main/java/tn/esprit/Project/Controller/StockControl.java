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

import tn.esprit.Project.Service.StockService;
import tn.esprit.Project.entites.Stock;

@RestController
public class StockControl {
  @Autowired
  private StockService ss ;
  
  @GetMapping("/Stock")
  public List<Stock> showStock(){
	  return ss.showS();
  }
  @PostMapping("/Stock/Add")
  public Stock AddStock (@RequestBody Stock l) {
	  
	  return ss.SaveStock(l);
  }
  @DeleteMapping("/Stock/Delete/{id}")
  public void Delete (@PathVariable("id") Long id) {
 	 
 	 ss.DeletStockById(id);
  }
  @GetMapping("/Stock/{id}")
  public Stock GetById (@PathVariable("id") Long id) {
    
    return ss.getStock(id);
  }
  @PutMapping("/Stock/Update/{id}")
  public Stock updateStock (@RequestBody Stock newstock, @PathVariable Long id) {
    
        return ss.UpadateStock(newstock);
      }
}

