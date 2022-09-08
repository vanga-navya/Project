package Project.BusTicketReservation.TestCases;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Project.BusTicketReservation.Model.Dao.Service.TicketBookingServices;
import Project.BusTicketReservation.Model.Pojo.BusDetails;
import Project.BusTicketReservation.Model.Pojo.Customer;
import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;
import Project.BusTicketReservation.Model.Pojo.ScheduleBus;
import Project.BusTicketReservation.Model.Pojo.TicketBooking;
import Project.BusTicketReservation.Repository.TicketBookingRepository;
@SpringBootTest
class ticketBookingTest {
	
@Autowired
TicketBookingServices ticketBookingServices ;

@MockBean
TicketBookingRepository ticketBookingRepository ;
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	String insertintoTicketBooking(TicketBooking T);
//	public List<TicketBooking> getAll() ;
//	TicketBooking getById(int id);
//	String deletebyIdTicket(TicketBooking id);
//	String Save(TicketBooking TBK);
	@Test
	void testgetAll()
	{
		Customer	C=new Customer(202291000,"abc", "xyz",LocalDate.parse("2022-09-03"), "abc","ayc","aoc","aec","aic", 23,"aoc","aec","aic", "sdf");
		RouteMapDetails R = new RouteMapDetails("R-1", "Hyd", "Sec", 34);
		ScheduleBus S = new ScheduleBus("abc", LocalDate.parse("2022-09-01"), "cvb");
		BusDetails B=new BusDetails("1326367","xyz","abc",23,"sdf",R,S);
		
		when(ticketBookingRepository.findAll()).thenReturn(Stream.of(
				
				new TicketBooking(175,C, B,23,LocalDate.parse("2022-09-03"),6.8)).collect(Collectors.toList()));
				assertEquals(1, ticketBookingServices.getAll().size());
	}
	void testinsertintoTicketBooking()
	{
		Customer	C=new Customer(202291000,"abc", "xyz",LocalDate.parse("2022-09-03"), "abc","ayc","aoc","aec","aic", 23,"aoc","aec","aic", "sdf");
		RouteMapDetails R = new RouteMapDetails("R-1", "Hyd", "Sec", 34);
		ScheduleBus S = new ScheduleBus("abc", LocalDate.parse("2022-09-01"), "cvb");
		BusDetails B=new BusDetails("1326367","xyz","abc",23,"sdf",R,S);
		TicketBooking T=new TicketBooking(175,C, B,23,LocalDate.parse("2022-09-03"),6.8);
			when(ticketBookingRepository .save(T)).thenReturn(T);
				 assertEquals("Ticket Generated", ticketBookingServices.insertintoTicketBooking(T));
//			
//
	verify(ticketBookingRepository,times(1)).save(T);
	}
	
}
