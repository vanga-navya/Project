package Project.BusTicketReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.BusTicketReservation.Model.Dao.ServiceImplementation.ScheduleServiceImpl;
import Project.BusTicketReservation.Model.Pojo.ScheduleBus;

@RestController
public class ScheduleController {
	@Autowired
	ScheduleServiceImpl serviceImpl;

	@PostMapping("/insertScheduleDetails")
	public String insertintoBook(@RequestBody ScheduleBus B) {
		
		String s = serviceImpl.insertintoScheduleBus(B);
		return s;
	}

	@GetMapping("/getAllSchedule")
	public List<ScheduleBus> GetAll() {
		return serviceImpl.GetAll();
	}
	@GetMapping("/getBySId/{sid}")
	public ScheduleBus getBySId(@PathVariable("sid") String id) {
		return serviceImpl.getById(id);
	}
}
