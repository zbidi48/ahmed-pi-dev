package tn.esprit.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Project.Respository.TargetRepository;
import tn.esprit.Project.entites.Target;

@Service
public class TargetService {

	@Autowired
	TargetRepository targetRepository ;

	public Target SaveTarget (Target t) {
		return targetRepository.save(t);
	}
	
	public Target UpadateTarget (Target t) {
		return targetRepository.save(t);
	}
	
	public void DeleteTarget (Target t) {
		targetRepository.delete(t);
	}
	
	public void DeletTargetById (Long id) {
		targetRepository.deleteById(id);	
	}
	
	public Target getTarget (Long id) {
		return targetRepository.findById(id).get();
	}
public List<Target>getAllTargets (){
	return targetRepository.findAll();
}
}




