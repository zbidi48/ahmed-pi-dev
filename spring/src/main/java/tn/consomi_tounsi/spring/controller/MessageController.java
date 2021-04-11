package tn.consomi_tounsi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.consomi_tounsi.spring.entities.Message;
import tn.consomi_tounsi.spring.service.MessageService;


@RestController
public class MessageController {
	@Autowired
	private MessageService messageService;
	@PostMapping("/message/send")
	public String sendText (@RequestBody Message m) {
		return messageService.sendTextService(m);
	}
	
	@GetMapping("/message/discussion/{id}")
	public List<Message> showmessageService(@PathVariable int id){
		
		return messageService.showmessageService(id);
	}
	
}
