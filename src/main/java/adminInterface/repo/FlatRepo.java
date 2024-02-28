package adminInterface.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import adminInterface.model.Flat;

public interface FlatRepo extends JpaRepository<Flat, Long> {
    void deleteEmployeeById(Long id);
    
    Flat findFlatByFlatNumber(int flatNumber);

   // Optional<Flat> findEmployeeById(Long id);
}
