package Project.BusTicketReservation.Model.Dao.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.BusTicketReservation.Model.Dao.Service.BusServices;
import Project.BusTicketReservation.Model.Pojo.BusDetails;
import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;
import Project.BusTicketReservation.Model.Pojo.ScheduleBus;
import Project.BusTicketReservation.Repository.BusRepository;
import Project.BusTicketReservation.Repository.RouteMapRepository;
import Project.BusTicketReservation.Repository.ScheduleBusRepository;

@Service
public class BusServiceImplementation implements BusServices {
	@Autowired
	BusRepository busRepository;
	@Autowired
	RouteMapRepository routeMapRepository;
	@Autowired
	ScheduleBusRepository scheduleBusRepository;
	
	
	
	//Bus details are inserted into database using route id and sheduleId//
	@Override
	public String insertBusDetails(BusDetails B) {
		List<BusDetails> Cu = busRepository.findAll();
		if (Cu.isEmpty()) {
			int i = 0;
			String Id = "B-" + Integer.toString(i);
			B.setBusId(Id);
			Optional<RouteMapDetails> B1 = routeMapRepository.findById(B.getRid().trim());
			if (B1.isPresent()) {
				B.setRouteId(B1.get());
				Optional<ScheduleBus> B2 = scheduleBusRepository.findById(B.getSid().trim());
				if (B1.isPresent()) {
					B.setScheduleId(B2.get());
					System.out.println(B.toString());
					busRepository.save(B);
					// System.out.println(B);
					return "New Bus added" ;
				} else {
					return "Schedule Id Not Found";
				}
			} else {
				return "Route Id Not Found";
			}
		} else {
			Integer mn = Cu.stream().map(i -> Integer.parseInt(i.getBusId().split("-")[1])).reduce(0,
					(a, b) -> Integer.max(a, b)) + 1;
			System.out.println(mn);
			B.setBusId("B-" + mn);
			busRepository.save(B);
			return "1 Row Inserted and ScheduleId" ;
		}
	}
	
		//Getting all Details of Buses
	@Override
	public List<BusDetails> GetAll() {
		return busRepository.findAll();
	}

	//Getting bus details by busId
	@Override
	public BusDetails getById(String id) {
		return busRepository.findById(id).get();
	}
//updating bus details
	@Override
	public void saving(BusDetails BD) {
		 busRepository.save(BD);
	}
	

}
