package com.Gestion.vente.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestion.vente.demo.repository.CategorieRepository;

@Service()
public class CategorieService {
	@Autowired
private CategorieRepository  categorierepository;

	public CategorieRepository getCategorierepository() {
		return categorierepository;
	}

	public void setCategorierepository(CategorieRepository categorierepository) {
		this.categorierepository = categorierepository;
	}




}
