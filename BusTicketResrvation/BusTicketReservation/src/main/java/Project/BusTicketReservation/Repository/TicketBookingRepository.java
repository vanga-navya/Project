package Project.BusTicketReservation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.BusTicketReservation.Model.Pojo.Customer;
import Project.BusTicketReservation.Model.Pojo.TicketBooking;

public interface TicketBookingRepository extends JpaRepository<TicketBooking,Integer> {

	int maxvalue();
	List<TicketBooking> findByCustomerId(Customer customerId);
}
