package adminInterface.service;

import java.util.List;

import adminInterface.model.Flat;

public interface FlatServiceImpl {

	    public Flat addFlatDetails(Flat flat);

	    public List<Flat> getAllFlatDetails();

	    public Flat updateFlatDetails(Flat flat);

	    public Flat getFlatDetailsById(Long id);

	    public void deleteFlatDetails(Long id);
}
