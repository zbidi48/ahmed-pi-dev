package tn.esprit.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Project.Respository.PublicityRepository;
import tn.esprit.Project.entites.Publicity;

@Service
public class PublicityService {
@Autowired
 PublicityRepository publicityRepository ;

public Publicity SavePublicity (Publicity p) {
	return publicityRepository.save(p);
}

public Publicity UpadatePublicity (Publicity p) {
	return publicityRepository.save(p);
}

public void DeletePublicity (Publicity p) {
publicityRepository.delete(p);
}

public void DeletPublicityById (Long id) {
publicityRepository.deleteById(id);	
}

public Publicity getPublicity (Long id) {
	return publicityRepository.findById(id).get();
}
public List<Publicity>getAllPublicitys (){
return publicityRepository.findAll();
}
}

