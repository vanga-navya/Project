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

import Project.BusTicketReservation.Model.Dao.Service.BusServices;
import Project.BusTicketReservation.Model.Dao.Service.CustomerServices;
import Project.BusTicketReservation.Model.Dao.Service.TicketBookingServices;
import Project.BusTicketReservation.Model.Pojo.BusDetails;
import Project.BusTicketReservation.Model.Pojo.Customer;
import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;
import Project.BusTicketReservation.Model.Pojo.ScheduleBus;
import Project.BusTicketReservation.Model.Pojo.TicketBooking;
import Project.BusTicketReservation.Repository.BusRepository;
import Project.BusTicketReservation.Repository.CustomerRepository;
@SpringBootTest
class TestAll {
	@Autowired
	BusServices busServices;
	
	
	
		@MockBean
	BusRepository busRepository;
	@Test
	void testGetAll() {
		RouteMapDetails R = new RouteMapDetails("R-1", "Hyd", "Sec", 34);
		ScheduleBus S = new ScheduleBus("abc", LocalDate.parse("2022-09-01"), "cvb");
		
		when(busRepository.findAll()).thenReturn(Stream.of(
				new BusDetails("B-1", "xyz", "abc", 23, "sdf", R, S)).collect(Collectors.toList()));
				assertEquals(1, busServices.GetAll().size());
	}

	
	

	
}
