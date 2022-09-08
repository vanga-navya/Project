package Project.BusTicketReservation.Model.Dao.Service;


import java.util.List;

import Project.BusTicketReservation.Model.Pojo.TicketBooking;

public interface TicketBookingServices {
	String insertintoTicketBooking(TicketBooking T);
	public List<TicketBooking> getAll() ;
	TicketBooking getById(int id);
	String deletebyIdTicket(TicketBooking id);
	String Save(TicketBooking TBK);
	List<TicketBooking> getByIdAllId(int id);
}
