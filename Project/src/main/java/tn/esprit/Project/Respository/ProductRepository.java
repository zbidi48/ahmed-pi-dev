package tn.esprit.Project.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.Project.entites.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> 
{
	@Query("SELECT n FROM Product n WHERE nomProduits LIKE ?1% ")
	List<Product> findBynomProduitsIgnoreCase(@Param("nomProduits") String nomProduits);
}
