package tn.esprit.Project.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.Project.entites.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}
