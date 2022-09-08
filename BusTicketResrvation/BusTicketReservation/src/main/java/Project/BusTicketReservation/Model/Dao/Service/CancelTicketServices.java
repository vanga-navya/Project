package Project.BusTicketReservation.Model.Dao.Service;

import java.util.List;

import Project.BusTicketReservation.Model.Pojo.CancelTicket;

public interface CancelTicketServices {
	List<CancelTicket> GetAll();
	String insertintoCancelTicket(CancelTicket C);
}
