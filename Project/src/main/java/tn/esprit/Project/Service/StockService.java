package tn.esprit.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Project.Respository.StockRepository;
import tn.esprit.Project.entites.Stock;

@Service
public class StockService {
	@Autowired
    private StockRepository stockRepository ;
	
	
	public Stock SaveStock (Stock s) {
		return stockRepository.save(s);
	}
	
	public Stock UpadateStock (Stock s) {
		return stockRepository.save(s);
	}
	
	public void DeleteStock (Stock s) {
		stockRepository.delete(s);
	}
	
	public void DeletStockById (Long id) {
		stockRepository.deleteById(id);	
	}
	
	public Stock getStock (Long id) {
		return stockRepository.findById(id).get();
	}
    public List<Stock> showS(){
    	return stockRepository.findAll();
    }
}


