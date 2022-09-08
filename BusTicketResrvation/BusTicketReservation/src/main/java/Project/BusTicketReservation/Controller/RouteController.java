package Project.BusTicketReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.BusTicketReservation.Model.Dao.ServiceImplementation.RouteServiceImpl;
import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;

@RestController
public class RouteController {
	@Autowired
	RouteServiceImpl routeServiceImpl;

	@GetMapping("/getAllroutes")
	public List<RouteMapDetails> GetAll() {
		return routeServiceImpl.GetAll();
	}

	@PostMapping("/inserRouteDetails")
	public String insertCustomer(@RequestBody RouteMapDetails RM) {
		String s = routeServiceImpl.insertintoRouteMap(RM);
		return s;
	}

	@GetMapping("/getByRId/{rid}")
	public RouteMapDetails getById(@PathVariable("rid") String id) {
		return routeServiceImpl.getById(id);
	}
}
