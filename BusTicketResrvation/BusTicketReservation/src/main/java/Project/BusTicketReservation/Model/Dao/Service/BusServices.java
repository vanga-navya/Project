package Project.BusTicketReservation.Model.Dao.Service;

import java.util.List;

import Project.BusTicketReservation.Model.Pojo.BusDetails;



public interface BusServices {
	String insertBusDetails(BusDetails B);
	List<BusDetails> GetAll();
	BusDetails getById(String id);
	void saving(BusDetails BD);
}
