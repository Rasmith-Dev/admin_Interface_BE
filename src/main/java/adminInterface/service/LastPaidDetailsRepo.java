package adminInterface.service;

import org.springframework.data.jpa.repository.JpaRepository;

import adminInterface.model.LastPaidDetails;

public interface LastPaidDetailsRepo extends JpaRepository<LastPaidDetails, Long> {

}
