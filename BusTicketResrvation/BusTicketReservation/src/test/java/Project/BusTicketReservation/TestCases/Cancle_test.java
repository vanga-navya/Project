package Project.BusTicketReservation.TestCases;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Project.BusTicketReservation.Model.Dao.Service.CancelTicketServices;
import Project.BusTicketReservation.Model.Pojo.BusDetails;
import Project.BusTicketReservation.Model.Pojo.CancelTicket;
import Project.BusTicketReservation.Model.Pojo.Customer;
import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;
import Project.BusTicketReservation.Model.Pojo.ScheduleBus;
import Project.BusTicketReservation.Model.Pojo.TicketBooking;
import Project.BusTicketReservation.Repository.CancelRepository;

@SpringBootTest
class Cancle_test {
	@Autowired
	CancelTicketServices cancelTicketServices;
	@MockBean
	CancelRepository CancelRepository;



	@Test
	void testGetAll() {
		Customer C = new Customer(202291000, "abc", "xyz", LocalDate.parse("2022-09-03"), "abc", "ayc", "aoc", "aec",
				"aic", 23, "aoc", "aec", "aic", "sdf");
		RouteMapDetails R = new RouteMapDetails("R-1", "Hyd", "Sec", 34);
		ScheduleBus S = new ScheduleBus("abc", LocalDate.parse("2022-09-01"), "cvb");
		BusDetails B = new BusDetails("1326367", "xyz", "abc", 23, "sdf", R, S);
		TicketBooking T = new TicketBooking(175, C, B, 23, LocalDate.parse("2022-09-03"), 6.8);
		when(CancelRepository.findAll()).thenReturn(Stream
				.of(new CancelTicket(15, C, LocalDate.parse("2022-09-03"), 12, T, 2.8)).collect(Collectors.toList()));
		assertEquals(1, cancelTicketServices.GetAll().size());
	}
	@Test
	void testinsertintoCancelTicket() {
		
		 Customer	C=new Customer(202291000,"abc", "xyz",LocalDate.parse("2022-09-03"), "abc","ayc","aoc","aec","aic", 23,"aoc","aec","aic", "sdf");
			RouteMapDetails R = new RouteMapDetails("R-1", "Hyd", "Sec", 34);
			ScheduleBus S = new ScheduleBus("abc", LocalDate.parse("2022-09-01"), "cvb");
			BusDetails B = new BusDetails("1326367", "xyz", "abc", 23, "sdf", R, S);
			TicketBooking T = new TicketBooking(175, C, B, 23, LocalDate.parse("2022-09-03"), 6.8);
			CancelTicket C1=new CancelTicket(1,C,LocalDate.parse("2022-09-01"),12,T,2.8);
			when(CancelRepository.save(C1)).thenReturn(C1);
				 assertEquals("customer Id NotPresent", cancelTicketServices.insertintoCancelTicket(C1));
	
	}
}
