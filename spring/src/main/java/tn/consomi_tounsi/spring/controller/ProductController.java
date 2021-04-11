package tn.consomi_tounsi.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.consomi_tounsi.spring.entities.Product;
import tn.consomi_tounsi.spring.repos.ProductRepository;
import tn.consomi_tounsi.spring.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductRepository productRepository;
	@PostMapping("/product/add")
	public String addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
		
	}
    @GetMapping("/product")
	public List<Product> getProducts(){
		return productService.getProducts();
	} 
    
    
    @GetMapping("/product/quantity")
    public List<Product> ShowProductByQuantity(){
    	
    	return productService.ShowSercice();
    }

	@PutMapping("/product/buy")
	 public String isBuyed (@RequestBody Product p) {
		   int x = 0;
		   int y = 0;
		  
		  List<Product> list = new ArrayList<Product>();
		  list =  productRepository.findAll();
		  System.out.println(list);
		  
		  for( Product p1 : list) {
			  System.out.println(p.getName());
			  System.out.println(p1.getName());
			  System.out.println(p1.getName() == p.getName());
			  if(p1.getName().equals(p.getName())) { 
				   System.out.println(p1.getName());
				   x=p1.getQuantity();
			       x--;
			       p1.setQuantity(x);
			       y =p1.getNbr_vente();
			       y++;
			       p1.setNbr_vente(y);
			       productRepository.save(p1);
			  }
			       
			       
		  }
		
		return "changement affected";
		  
		}
	@GetMapping("/product/top_vente")
	public List<Product> ShowProductByVente(){
		return productRepository.Showvente();
	};
	}

