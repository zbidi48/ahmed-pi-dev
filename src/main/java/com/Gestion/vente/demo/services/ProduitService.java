package com.Gestion.vente.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestion.vente.demo.repository.CategorieRepository;
import com.Gestion.vente.demo.repository.ProductRepository;

@Service()
public class ProduitService {
	@Autowired
	private ProductRepository produitRepository;
	
	@Autowired
	private CategorieRepository categorieRepository;

	public ProductRepository getProduitRepository() {
		return produitRepository;
	}

	public void setProduitRepository(ProductRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	public CategorieRepository getCategorieRepository() {
		return categorieRepository;
	}

	public void setCategorieRepository(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}
	
	
}
