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

import Project.BusTicketReservation.Model.Dao.Service.CustomerServices;
import Project.BusTicketReservation.Model.Pojo.BusDetails;
import Project.BusTicketReservation.Model.Pojo.Customer;
import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;
import Project.BusTicketReservation.Model.Pojo.ScheduleBus;
import Project.BusTicketReservation.Repository.CustomerRepository;
@SpringBootTest
class customerTest {

	
	@Autowired
	CustomerServices customerServices ;
	@MockBean
	   CustomerRepository customerRepository ;
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	void testGetAll()
	{
		when(customerRepository.findAll()).thenReturn(Stream.of(
				new Customer(175,"abc", "xyz",LocalDate.parse("2022-09-03"), "abc","ayc","aoc","aec","aic", 23,"aoc","aec","aic", "sdf")).collect(Collectors.toList()));
				assertEquals(1, customerServices.GetAll().size());
	}
	@Test
	void testinsertintoCustomer()
	{
		 Customer	C=new Customer(202291000,"abc", "xyz",LocalDate.parse("2022-09-03"), "abc","ayc","aoc","aec","aic", 23,"aoc","aec","aic", "sdf");
		
	when(customerRepository .save(C)).thenReturn(C);
		 assertEquals("Your Registration Id:" + " " + C.getCustomerId(), customerServices.insertintoCustomer(C));
	

	verify(customerRepository ,times(1)).save(C);
	}
	@Test
	void testupdate() {
		 Customer	C=new Customer(202291000,"abc", "xyz",LocalDate.parse("2022-09-03"), "abc","ayc","aoc","aec","aic", 23,"aoc","aec","aic", "sdf");
			
			when(customerRepository .save(C)).thenReturn(C);
				 assertEquals("Successfully Updated", customerServices.update(C));
			

			verify(customerRepository ,times(1)).save(C);
		
	}
	
}
