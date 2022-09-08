package Project.BusTicketReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.BusTicketReservation.Model.Dao.ServiceImplementation.CancelTicketImpl;
import Project.BusTicketReservation.Model.Pojo.CancelTicket;

@RestController
public class CancelTicketController {
	@Autowired
	CancelTicketImpl cancelTicketImpl;

	@GetMapping("/getcancelAll")
	public List<CancelTicket> GetAll() {
		return cancelTicketImpl.GetAll();
	}

	@PostMapping("/intoCancelTicket")
	public String insertCancelTicket(@RequestBody CancelTicket C) {
		System.out.println(C.toString());
		String s = cancelTicketImpl.insertintoCancelTicket(C);
		return s;
	}

}
