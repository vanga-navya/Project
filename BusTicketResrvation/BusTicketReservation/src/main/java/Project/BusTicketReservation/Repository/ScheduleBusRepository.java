package Project.BusTicketReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.BusTicketReservation.Model.Pojo.ScheduleBus;

public interface ScheduleBusRepository extends JpaRepository<ScheduleBus, String> {
}
