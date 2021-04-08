package tn.esprit.Project.Controller;

import java.util.List;
//import java.util.Optional;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.Project.Service.ProductService;
import tn.esprit.Project.entites.Product;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService ;
	
	@GetMapping("/Product")
	public List <Product> ShowProduct(){
		return productService.getAllProducts(); 
	}
	@PostMapping("/Product/Add")
	public Product AddProduct (@RequestBody Product p) {
		  
		  return productService.SaveProduct(p) ;
	}
	@DeleteMapping("/Product/Delete/{id}")
	public void Delete (@PathVariable("id") Long id) {
		 
		productService.DeletProductById(id);
	}
	@GetMapping("/Product/{id}")
	public Product GetById (@PathVariable("id") Long id) {
	  
	  return productService.getProduct(id);
	}
	@PutMapping("/Product/Update/{id}")
	public Product updateProduct (@RequestBody Product newproduct, @PathVariable Long id) {
	  
	      return productService.UpadateProduct(newproduct);
	}
	@GetMapping ("/Product/Cheaper")
	public List <Product> Cheaper(){
		
		return productService.getProductCheap();
	}
	
	@GetMapping("/Product/Search")
	public List<Product> searchProduct(@RequestParam("nomProduits") Optional<String> nomProduits) 
	{

		return productService.SearchProduct(nomProduits.orElse("_"));
	}

}