package Project.BusTicketReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.BusTicketReservation.Model.Pojo.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public int maxvalue();
}
