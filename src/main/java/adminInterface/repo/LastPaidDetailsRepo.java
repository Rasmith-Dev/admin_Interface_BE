package adminInterface.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import adminInterface.model.LastPaidDetails;

public interface LastPaidDetailsRepo extends JpaRepository<LastPaidDetails, Long> {

}
