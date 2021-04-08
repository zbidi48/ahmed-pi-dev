package tn.esprit.Project.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.Project.entites.Target;
@Repository
public interface TargetRepository extends JpaRepository<Target, Long> {

}
