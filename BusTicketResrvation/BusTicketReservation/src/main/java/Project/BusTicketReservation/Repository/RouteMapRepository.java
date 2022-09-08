package Project.BusTicketReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;

public interface RouteMapRepository extends JpaRepository<RouteMapDetails, String> {


}
