package adminInterface.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import adminInterface.model.Flat;

public interface FlatRepo extends JpaRepository<Flat, Long> {
    void deleteEmployeeById(Long id);

    Optional<Flat> findEmployeeById(Long id);
}
