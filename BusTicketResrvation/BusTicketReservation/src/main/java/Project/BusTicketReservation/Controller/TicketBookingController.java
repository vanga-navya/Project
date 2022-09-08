package Project.BusTicketReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.BusTicketReservation.Model.Dao.ServiceImplementation.TicketBookingServiceImpl;
import Project.BusTicketReservation.Model.Pojo.TicketBooking;

@RestController
public class TicketBookingController {
	@Autowired
	TicketBookingServiceImpl bookingServiceImpl;

	@PostMapping("/insertintoT")
	public String insertintoTicketBooking(@RequestBody TicketBooking T) {
		System.out.println(T.toString());
		return bookingServiceImpl.insertintoTicketBooking(T);
	}

	@GetMapping("/getTickets")
	public List<TicketBooking> GetALLTickets() {
		return bookingServiceImpl.getAll();
	}

	@GetMapping("/getByIdTicket/{tid}")
	public TicketBooking getByTId(@PathVariable("tid") int id) {
		return bookingServiceImpl.getById(id);
	}

	@DeleteMapping("/deleteTicketByTId/{Id}")
	public String DeleteTicket(@PathVariable("Id") int Id) {
		System.out.println(Id);
		String s = bookingServiceImpl.deletebyIdTicket(bookingServiceImpl.getById(Id));
		return s;
	}
	@PutMapping("/SaveTicketB")
	public String Save(@RequestBody TicketBooking T) {
				return bookingServiceImpl.Save(T);
	}
	
	@GetMapping("/getByIdTicketAll/{tid}")
	public List<TicketBooking> getByTIdAll(@PathVariable("tid") int id) {
		return bookingServiceImpl.getByIdAllId(id);
	}
	

}
