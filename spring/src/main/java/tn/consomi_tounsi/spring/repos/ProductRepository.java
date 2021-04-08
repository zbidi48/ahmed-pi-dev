package tn.consomi_tounsi.spring.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.consomi_tounsi.spring.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
@Query("select p from Product p order by p.quantity desc")
public List<Product> ShowR();

@Query("select p from Product p order by p.nbr_vente desc")
public List<Product> Showvente();


/*@Modifying
@Transactional
@Query("update Product p set p.quantity=:newQuantity where p.idproduct=:id")
public List<Product> update_product(@Param("id") Long idproduct ,@Param("newQuantity") int quantity);*/
}
