package Project.BusTicketReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.BusTicketReservation.Model.Pojo.BusDetails;

public interface BusRepository extends JpaRepository<BusDetails, String> {

}
