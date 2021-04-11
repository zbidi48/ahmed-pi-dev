package com.Gestion.vente.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Gestion.vente.demo.Entities.Bills;




public interface BillsReposytory extends JpaRepository<Bills,Long> {
	@Query(value="SELECT * FROM `bills` ORDER BY amount",nativeQuery=true) 
	public List<Bills> trierfactureordercroissant();
	

}
