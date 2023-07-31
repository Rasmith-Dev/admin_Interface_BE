package adminInterface.service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adminInterface.exception.FlatNotFoundException;
import adminInterface.model.Flat;
import adminInterface.model.LastPaidDetails;
import adminInterface.repo.FlatRepo;

@Service
@Transactional
public class FlatService implements FlatServiceImpl{
    @Autowired
	private FlatRepo flatRepo;
    
    @Autowired
    private LastPaidDetailsRepo lastPaidDetailsRepo;
    
//    @Autowired
//    public FlatService(FlatRepo flatRepo) {
//        this.flatRepo = flatRepo;
//    }

    public Flat addFlatDetails(Flat flat) {
    	flat.setFlatCode(UUID.randomUUID().toString());
        return flatRepo.save(flat);
    }

    public List<Flat> getAllFlatDetails() {
        return flatRepo.findAll();
    }

    public Flat updateFlatDetails(Flat flat) {
    	Flat flatDB =flatRepo.findFlatByFlatNumber(flat.getFlatNumber());
    	
    	if(flatDB.getLastPaid() == null) {
    		LastPaidDetails lastPaidDetails = new LastPaidDetails();
    		lastPaidDetails.setLastPaid(flat.getLastPaid());
    		lastPaidDetails.setFlat(flat);
    		lastPaidDetailsRepo.save(lastPaidDetails);
    	}
    	
    	if(!Objects.equals(flatDB.getLastPaid(), flat.getLastPaid())){
    		LastPaidDetails lastPaidDetails = new LastPaidDetails();
    		lastPaidDetails.setLastPaid(flat.getLastPaid());
    		lastPaidDetails.setFlat(flat);
    		lastPaidDetailsRepo.save(lastPaidDetails);
    	}
        return flatRepo.save(flat);
    }

    public Flat getFlatDetailsById(Long id) {
        return flatRepo.findById(id)
                .orElseThrow(() -> new FlatNotFoundException("Flat with provided ID: " + id + " was not found"));
    }

    public void deleteFlatDetails(Long id){
    	flatRepo.deleteEmployeeById(id);
    }
}
