package Project.BusTicketReservation.Model.Dao.ServiceImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.BusTicketReservation.Model.Dao.Service.TicketBookingServices;
import Project.BusTicketReservation.Repository.BusRepository;
import Project.BusTicketReservation.Repository.CustomerRepository;
import Project.BusTicketReservation.Repository.TicketBookingRepository;
import Project.BusTicketReservation.Model.Pojo.BusDetails;
import Project.BusTicketReservation.Model.Pojo.Customer;
import Project.BusTicketReservation.Model.Pojo.TicketBooking;

@Service
public class TicketBookingServiceImpl implements TicketBookingServices {
	@Autowired
	TicketBookingRepository ticketBookingRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	BusRepository busRepository;
//Inserting booking Tickets
	@Override
	public String insertintoTicketBooking(TicketBooking T) {
		List<TicketBooking> Cu = ticketBookingRepository.findAll();
		LocalDate d = LocalDate.now();
		int yy = d.getYear();
		String y = Integer.toString(yy);
		int mm = d.getMonthValue();
		String m = Integer.toString(mm);
		if (Cu.isEmpty()) {
			int i = 1000;
			String Id = m + y + i;
			T.setTicketId(Integer.parseInt(Id));
			Optional<Customer> B1 = customerRepository.findById(T.getSid());
			if (B1.isPresent()) {
				System.out.println(B1.get().toString());
				T.setCutomerId(B1.get());
				Optional<BusDetails> B2 = busRepository.findById(T.getBid().trim());
				if (B2.isPresent()) {
					System.out.println(B2.get().toString());
					T.setBusId(B2.get());
					T.setStatus("Booked");
					ticketBookingRepository.save(T);
					return "Your TicketId:" + "  " + T.getTicketId();
				} else {
					return "BusId notPresent";
				}
			} else {
				return "customer Id NotPresent";
			}
		} else {
			T.setTicketId(ticketBookingRepository.maxvalue() + 1);
			Optional<Customer> B1 = customerRepository.findById(T.getSid());
			if (B1.isPresent()) {
				System.out.println(B1.get().toString());
				T.setCutomerId(B1.get());
				Optional<BusDetails> B2 = busRepository.findById(T.getBid().trim());
				if (B2.isPresent()) {
					System.out.println(B2.get().toString());
					T.setBusId(B2.get());
					T.setStatus("Booked");
					ticketBookingRepository.save(T);
					return "Ticket Generated";
				} else {
					return "BusId notPresent";
				}
			} else {
				return "customer Id NotPresent";
			}
		}
	}
//Getting all  booking Details
	@Override
	public List<TicketBooking> getAll() {
		return ticketBookingRepository.findAll();
	}
//Getting booking details by ticket id
	@Override
	public TicketBooking getById(int id) {
		return ticketBookingRepository.findById(id).get();
	}
//Deleting tickets by ticket id 
	@Override
	public String deletebyIdTicket(TicketBooking id) {
		ticketBookingRepository.delete(id);
		return "Deleted";
	}
//Updating Ticket details 
	@Override
	public String Save(TicketBooking TBK) {
				ticketBookingRepository.save(TBK);
				return "Saved";
	}
	//Getting booking details by ticket id
	@Override
	public List<TicketBooking> getByIdAllId(int id) {
		
		Customer c = customerRepository.findById(id).orElseGet(()->null);
		return  ticketBookingRepository.findByCustomerId(c);
	}

	
}
