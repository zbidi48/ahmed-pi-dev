package com.Gestion.vente.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestion.vente.demo.repository.MethodeofpayRepository;

@Service()
public class MethodepayService {
	@Autowired
	private MethodeofpayRepository methodepayrepository;

	public MethodeofpayRepository getMethodepayrepository() {
		return methodepayrepository;
	}

	public void setMethodepayrepository(MethodeofpayRepository methodepayrepository) {
		this.methodepayrepository = methodepayrepository;
	}
	

}
