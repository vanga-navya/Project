package Project.BusTicketReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project.BusTicketReservation.Model.Dao.ServiceImplementation.BusServiceImplementation;
import Project.BusTicketReservation.Model.Pojo.BusDetails;


@RestController
public class BusController {
	@Autowired
	BusServiceImplementation busServiceImplementation;

	@RequestMapping("/")
	public String pageView() {
		return "Home";
	}
	@PostMapping("/insertbusDetails")
	public String insertintoBus(@RequestBody BusDetails B) {
		System.out.println("In server");
		System.out.println(B.toString());
		String s = busServiceImplementation.insertBusDetails(B);
		return s;
	}

	@GetMapping("/getAll")
	public List<BusDetails> GetAll() {
		return busServiceImplementation.GetAll();
	}
	@GetMapping("/getByBId/{bid}")
	public BusDetails getById(@PathVariable("bid") String id) {
		return busServiceImplementation.getById(id);
	}
	@PutMapping("/Save")
	public void SaveBD(@RequestBody BusDetails B) {
		System.out.println("In server");
		System.out.println(B.toString());
		 busServiceImplementation.saving(B);
	
	}
}
