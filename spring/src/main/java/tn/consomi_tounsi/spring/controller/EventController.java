package tn.consomi_tounsi.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import tn.consomi_tounsi.spring.entities.Event;
import tn.consomi_tounsi.spring.service.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService es;
	
	@PostMapping("/Event/add")
       public String addE(@RequestBody Event e) {
		    return es.addEvent(e);
		}
	@GetMapping("/Event")
	public List<Event> showE(){
		return es.show();
	}
	@DeleteMapping("/Event/delete/{id}")
	public String deleteE(@PathVariable("id") Long id) {
		return es.deleteEvent(id);
	}
}
