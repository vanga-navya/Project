package Project.BusTicketReservation.Model.Dao.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.BusTicketReservation.Model.Dao.Service.RouteServices;
import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;
import Project.BusTicketReservation.Repository.RouteMapRepository;

@Service
public class RouteServiceImpl implements RouteServices {
	@Autowired
	RouteMapRepository mapRepository;
// To get all route details
	@Override
	public List<RouteMapDetails> GetAll() {
		return mapRepository.findAll();
	}
//Inserting data into routeMap
	@Override
	public String insertintoRouteMap(RouteMapDetails RM) {
		List<RouteMapDetails> Cu = mapRepository.findAll();
		if (Cu.isEmpty()) {
			int i = 0;
			String Id = "R-" + Integer.toString(i);
			RM.setR_Id(Id);
			mapRepository.save(RM);
			return "1 Row Inserted and ScheduleId" + " " + RM.getR_Id();
		} else {
			Integer mn = Cu.stream().map(i -> Integer.parseInt(i.getR_Id().split("-")[1])).reduce(0,
					(a, b) -> Integer.max(a, b)) + 1;
			System.out.println(mn);
			RM.setR_Id("R-" + mn);
			mapRepository.save(RM);
			return "1 Row Inserted and ScheduleId" + "  " + RM.getR_Id();
		}
	}
//Getting route details by route id
	@Override
	public RouteMapDetails getById(String id) {
		return mapRepository.findById(id.trim()).get();
	}
}
