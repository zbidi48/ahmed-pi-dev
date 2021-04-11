package com.Gestion.vente.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Gestion.vente.demo.Entities.Commande;


public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
