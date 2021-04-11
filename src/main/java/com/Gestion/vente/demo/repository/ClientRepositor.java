package com.Gestion.vente.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gestion.vente.demo.Entities.Client;



public interface ClientRepositor extends JpaRepository<Client,Long>  {

}
