package tn.consomi_tounsi.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomi_tounsi.spring.entities.Event;
import tn.consomi_tounsi.spring.repos.EventRepository;

@Service
public class EventService {
@Autowired
private EventRepository e ;

public List<Event> show (){
	return e.findAll();
}

public String deleteEvent(Long id) {
	e.deleteById(id);
	return "event delete";
}
public String addEvent (Event event) {
	e.save(event);
	return "event added";

}
}
