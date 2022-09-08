package Project.BusTicketReservation.TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Project.BusTicketReservation.Model.Dao.Service.RouteServices;
import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;
import Project.BusTicketReservation.Repository.RouteMapRepository;

@SpringBootTest
public class Testing {
	@Autowired
	RouteServices routeServices;
	@MockBean
	RouteMapRepository routeMapRepository;
	
	@Test
	void testGetAll() {
		when(routeServices.GetAll()).thenReturn(Stream.of(new RouteMapDetails("R-0","Hyd","Mumbai",450),
				new RouteMapDetails("R-1","Goa","Chennai",950)).collect(Collectors.toList()));
		assertEquals(2, routeServices.GetAll().size());
	}
	
	@Test
	void testinsertintoRouteMap() {
		RouteMapDetails R=new RouteMapDetails("R-0","Goa","Chennai",950);
		when(routeMapRepository.save(R)).thenReturn(R);
		assertEquals("1 Row Inserted and ScheduleId"+ " " + R.getR_Id(), routeServices.insertintoRouteMap(R));
		verify(routeMapRepository).save(R);
	}
	
	@Test
	void testgetById() {
		RouteMapDetails R=new RouteMapDetails("R-0","Goa","Chennai",950);
		when(routeMapRepository.findById(R.getR_Id())).thenReturn(Optional.of(R));
		assertSame(R, routeServices.getById(R.getR_Id()));
	}

}
