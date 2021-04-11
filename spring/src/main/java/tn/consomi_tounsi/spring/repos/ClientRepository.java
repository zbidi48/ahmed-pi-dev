package tn.consomi_tounsi.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.consomi_tounsi.spring.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
