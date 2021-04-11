package tn.consomi_tounsi.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomi_tounsi.spring.entities.Product;
import tn.consomi_tounsi.spring.repos.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	List<Product> list = new ArrayList<Product>();
	public String addProduct(Product product) {
		productRepository.save(product);
		return "element added";
		
	}
	public List<Product> getProducts() {
		return productRepository.findAll();
	}
	public Optional<Product> getProductsById(Long id) {
		return productRepository.findById(id);
	}
	
	
	
	public List<Product> ShowSercice(){
		
		return productRepository.ShowR();
		
	}

   /*public Product isBuyed (Product p) {
	   int x = 0;
	   int y = 0;
	  //Product p1 = new Product();
	  List<Product> list = new ArrayList<Product>();
	  list =  productRepository.findAll();
	  
	  for( Product p1 : list) {
		  if(p1.getName() == p.getName())
			   x=p1.getQuantity();
		       x--;
		       p1.setQuantity(x);
		       y =p1.getNbr_vente();
		       y++;
		       p1.setNbr_vente(y);
		       
	  }
	  return p1;
	
	  
	}*/ 
}
