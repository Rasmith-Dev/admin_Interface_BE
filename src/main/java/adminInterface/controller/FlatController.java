package adminInterface.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adminInterface.model.Flat;
import adminInterface.service.FlatService;

@RestController
@RequestMapping("/flat")
public class FlatController {
    private final FlatService flatService;

    public FlatController(FlatService FlatService) {
        this.flatService = FlatService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Flat>> getAllFlatDetails() {
        List<Flat> flats = flatService.getAllFlatDetails();
        return new ResponseEntity<>(flats, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Flat> getFlatDetailsById(@PathVariable("id") Long id) {
        Flat flat = flatService.getFlatDetailsById(id);
        return new ResponseEntity<>(flat, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Flat> addFlatDetails(@RequestBody Flat flat) {
        Flat newFlat = flatService.addFlatDetails(flat);
        return new ResponseEntity<>(newFlat, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Flat> updateFlatDetails(@RequestBody Flat flat) {
        Flat updateFlatDetails = flatService.updateFlatDetails(flat);
        return new ResponseEntity<>(updateFlatDetails, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFlatDetails(@PathVariable("id") Long id) {
    	flatService.deleteFlatDetails(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
