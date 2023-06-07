package adminInterface.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adminInterface.exception.FlatNotFoundException;
import adminInterface.model.Flat;
import adminInterface.repo.FlatRepo;

@Service
@Transactional
public class FlatService implements FlatServiceImpl{
    private final FlatRepo flatRepo;

    @Autowired
    public FlatService(FlatRepo flatRepo) {
        this.flatRepo = flatRepo;
    }

    public Flat addFlatDetails(Flat flat) {
    	flat.setFlatCode(UUID.randomUUID().toString());
        return flatRepo.save(flat);
    }

    public List<Flat> getAllFlatDetails() {
        return flatRepo.findAll();
    }

    public Flat updateFlatDetails(Flat flat) {
        return flatRepo.save(flat);
    }

    public Flat getFlatDetailsById(Long id) {
        return flatRepo.findEmployeeById(id)
                .orElseThrow(() -> new FlatNotFoundException("Flat with provided ID: " + id + " was not found"));
    }

    public void deleteFlatDetails(Long id){
    	flatRepo.deleteEmployeeById(id);
    }
}
