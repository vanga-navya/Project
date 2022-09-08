package Project.BusTicketReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.BusTicketReservation.Model.Pojo.CancelTicket;

public interface CancelRepository extends JpaRepository<CancelTicket, Integer> {
	public int maxvalue();
}
