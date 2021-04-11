package tn.esprit.Project.Service;

import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import tn.esprit.Project.Respository.ProductRepository;
//import tn.esprit.Project.Respository.TargetRepository;
import tn.esprit.Project.entites.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository ;
	//@Autowired
//	private TargetRepository targetRepository ;
	public Product SaveProduct (Product p) {
		return productRepository.save(p);
	}
	
	public Product UpadateProduct (Product p) {
		return productRepository.save(p);
	}
	
	public void DeleteProduct (Product p) {
	productRepository.delete(p);
	}
	
	public void DeletProductById (Long id) {
	productRepository.deleteById(id);	
	}
	
	public Product getProduct (Long id) {
		return productRepository.findById(id).get();
	}
	public List<Product>getAllProducts (){
		return productRepository.findAll();
	}
	
	public List<Product> getProductCheap() {
	    List<Product> product = productRepository.findAll(Sort.by(Sort.Direction.ASC, "prixProduits"));  
	   return product;
	}
	
	public List<Product> SearchProduct(String nomProduits) 
	{
		
	    return productRepository.findBynomProduitsIgnoreCase(nomProduits);
	}

}