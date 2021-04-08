package tn.esprit.Project.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.Project.entites.Publicity;
@Repository
public interface PublicityRepository extends JpaRepository<Publicity, Long> {

}
