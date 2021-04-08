package tn.consomi_tounsi.spring.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.consomi_tounsi.spring.entities.Message;
@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
	@Query( "select msg from Message msg order by msg.date_message desc")
	public List<Message> afficheMsgRepository();

}
