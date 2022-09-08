package Project.BusTicketReservation.Model.Dao.ServiceImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.BusTicketReservation.Model.Dao.Service.CancelTicketServices;
import Project.BusTicketReservation.Model.Pojo.CancelTicket;
import Project.BusTicketReservation.Model.Pojo.Customer;
import Project.BusTicketReservation.Model.Pojo.TicketBooking;
import Project.BusTicketReservation.Repository.CancelRepository;
import Project.BusTicketReservation.Repository.CustomerRepository;
import Project.BusTicketReservation.Repository.TicketBookingRepository;

@Service
public class CancelTicketImpl implements CancelTicketServices {
	@Autowired
	CancelRepository cancelRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	TicketBookingRepository bookingRepository;
//Getting all records of cancellation
	@Override
	public List<CancelTicket> GetAll() {
		return cancelRepository.findAll();
	}
//Insertion of cancelled tickets
	@Override
	public String insertintoCancelTicket(CancelTicket C) {
		List<CancelTicket> Cu = cancelRepository.findAll();
		LocalDate d = LocalDate.now();
		int yy = d.getYear();
		String y = Integer.toString(yy);
		if (Cu.isEmpty()) {
			int i = 1000;
			String Id =  y + i;
			C.setCancelT_Id(Integer.parseInt(Id));
			Optional<Customer> B1 = customerRepository.findById(C.getCustId());//Get customer details by customer 
			if (B1.isPresent()) {
				C.setCustomerId(B1.get());
				Optional<TicketBooking> B2 = bookingRepository.findById(C.getTickId());
				if (B2.isPresent()) {
					System.out.println("Ticket id not found");
					System.out.println(B2.get().toString());
					C.setTicketId(B2.get());
					cancelRepository.save(C);
					return "Your Ticket is  Cancel";
				} else {
					return "TicketId not Present";
				}
			} else {
				return "customer Id NotPresent";
			}
		} else {
		
			C.setCancelT_Id(cancelRepository.maxvalue()+1);
			
			Optional<Customer> B1 = customerRepository.findById(C.getCustId());
			if (B1.isPresent()) {
				System.out.println(B1.get().toString());
			
				C.setCustomerId(B1.get());
				Optional<TicketBooking> B2 = bookingRepository.findById(C.getTickId());
				if (B2.isPresent()) {
					System.out.println(B2.get().toString());
				
					C.setTicketId(B2.get());
					
					cancelRepository.save(C);
					return "Your CancelTid:" + "  " + C.getCancelT_Id();
				} else {
					return "busid notPresent";
				}
			} else {
				return "customer Id NotPresent";
			}	
		}
	}

}
