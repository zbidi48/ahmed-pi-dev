package tn.consomi_tounsi.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.consomi_tounsi.spring.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long > {
	

}
