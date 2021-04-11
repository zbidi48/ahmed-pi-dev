package com.Gestion.vente.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gestion.vente.demo.Entities.Categuorie;

public interface CategorieRepository extends JpaRepository<Categuorie,Long> {

}
