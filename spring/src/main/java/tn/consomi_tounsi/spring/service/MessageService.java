package tn.consomi_tounsi.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomi_tounsi.spring.entities.Client;
import tn.consomi_tounsi.spring.entities.Message;
import tn.consomi_tounsi.spring.repos.ClientRepository;
import tn.consomi_tounsi.spring.repos.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepository;
	@Autowired
	private ClientRepository clientRepository;
	
	List<Client> listclient= new ArrayList<Client>();
	List<Message> listmessage= new ArrayList<Message>();
	List<Integer> listverification= new ArrayList<Integer>();
	List<Message> list_discussion= new ArrayList<Message>();



	public String sendTextService (Message m) {
		boolean isexist =false;
		List<Client> listclient= new ArrayList<Client>();	
		listclient =clientRepository.findAll();
		
		for(Client c : listclient) {
			if(m.getId_recepteur()==c.getId_client()) {
				isexist=true;
			}
			else if(m.getId_emmetteur()==c.getId_client()) {
				isexist=true;
			} 
		}
		if(isexist) {
			System.out.println("ready to save");
			messageRepository.save(m);
			System.out.println(m.getText());
			
		}
		return " text envoyer";
		
		
		
	}
	
	
	public boolean verify (int x, List<Integer> l) {
		boolean test = true;
		for(int i:l) {
			if(x==i) {
				test=false;
			}
		}
		return test;
	}
	
	
	
	public List<Message> showmessageService(int id){
		
		
		Message m=new Message();
		List<Message> listmessage= new ArrayList<Message>();
		List<Integer> listverification= new ArrayList<Integer>();
        boolean t1=false;
        boolean t2=false;
		List<Message> list_discussion= new ArrayList<Message>();
		listmessage= messageRepository.afficheMsgRepository();
		int id_discussion=0;
		for (Message message : listmessage) {
			if(message.getId_recepteur()==id || message.getId_emmetteur()==id) {
				if(message.getId_recepteur()==id ) {
					id_discussion= message.getId_emmetteur();
				}
				else if (message.getId_emmetteur()==id) {
					id_discussion= message.getId_recepteur();
				}
				if(verify(id_discussion, listverification)) {
					listverification.add(id_discussion);
					for(Message i : listmessage) {
						t1 = id == i.getId_recepteur() && id_discussion == i.getId_emmetteur();
						t2 = id == i.getId_emmetteur() && id_discussion == i.getId_recepteur();
						if( t1 || t2) {
							m.setDate_message(i.getDate_message());
							m.setId_emmetteur(i.getId_emmetteur());
							m.setId_recepteur(i.getId_recepteur());
							m.setText(i.getText());
							System.out.println(m.getText());
							list_discussion.add(m);
						}
					}
				}
			}
			
		}
		return list_discussion;
	}
	
}
