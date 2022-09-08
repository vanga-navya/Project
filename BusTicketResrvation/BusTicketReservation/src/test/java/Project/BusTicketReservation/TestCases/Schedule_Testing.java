package Project.BusTicketReservation.TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Project.BusTicketReservation.Model.Dao.Service.RouteServices;
import Project.BusTicketReservation.Model.Dao.Service.ScheduleServices;
import Project.BusTicketReservation.Model.Pojo.ScheduleBus;
import Project.BusTicketReservation.Repository.ScheduleBusRepository;

@SpringBootTest
public class Schedule_Testing {
	@Autowired
	ScheduleServices scheduleServices;
	@MockBean
	ScheduleBusRepository scheduleBusRepository;
	
	@Test
	void testGetAll() {
		when(scheduleServices.GetAll()).thenReturn(Stream.of(new ScheduleBus("S-0",LocalDate.parse("2022-09-12"),"10:30"),
				new ScheduleBus("S-1",LocalDate.parse("2022-10-22"),"12:30")).collect(Collectors.toList()));
		assertEquals(2, scheduleServices.GetAll().size());
	}
	
	@Test
	void testinsertintoScheduleBus() {
		ScheduleBus S=new ScheduleBus("S-0",LocalDate.parse("2022-09-12"),"10:30");
		when(scheduleBusRepository.save(S)).thenReturn(S);
		assertEquals("Succesfully Shedule Added", scheduleServices.insertintoScheduleBus(S));
	}
	
	@Test
	void testgetById() {
		ScheduleBus S=new ScheduleBus("S-0",LocalDate.parse("2022-09-12"),"10:30");
		when(scheduleBusRepository.findById(S.getScheduleId())).thenReturn(Optional.of(S));
		assertSame(S, scheduleServices.getById(S.getScheduleId()));
	}

}
