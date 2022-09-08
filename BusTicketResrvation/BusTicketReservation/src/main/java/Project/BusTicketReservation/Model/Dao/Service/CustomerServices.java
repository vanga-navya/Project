package Project.BusTicketReservation.Model.Dao.Service;

import java.util.List;

import Project.BusTicketReservation.Model.Pojo.Customer;

public interface CustomerServices {
	List<Customer> GetAll();
	String insertintoCustomer(Customer C);
	String update(Customer C);
}
