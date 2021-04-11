package com.Gestion.vente.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Gestion.vente.demo.Entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
