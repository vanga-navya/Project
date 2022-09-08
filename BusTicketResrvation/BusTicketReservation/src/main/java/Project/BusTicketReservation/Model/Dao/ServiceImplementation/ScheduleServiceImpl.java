package Project.BusTicketReservation.Model.Dao.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.BusTicketReservation.Model.Dao.Service.ScheduleServices;
import Project.BusTicketReservation.Model.Pojo.ScheduleBus;
import Project.BusTicketReservation.Repository.ScheduleBusRepository;

@Service
public class ScheduleServiceImpl implements ScheduleServices {
	@Autowired
	ScheduleBusRepository busRepository;
//Getting all records of schedule bus
	@Override
	public List<ScheduleBus> GetAll() {
		return busRepository.findAll();
	}
//Inserting date into schedule bus
	@Override
	public String insertintoScheduleBus(ScheduleBus SB) {
		List<ScheduleBus> Cu = busRepository.findAll();
		if (Cu.isEmpty()) {
			int i = 0;
			String Id = "S-" + Integer.toString(i);
			SB.setScheduleId(Id);
			busRepository.save(SB);
			return "Succesfully Shedule Added";
		} else {
			Integer mn = Cu.stream().map(i -> Integer.parseInt(i.getScheduleId().split("-")[1])).reduce(0,
					(a, b) -> Integer.max(a, b)) + 1;
			System.out.println(mn);
			SB.setScheduleId("S-" + mn);
			busRepository.save(SB);
			return "Succesfully Shedule Added";
		}
	}
// getting schedule details by schedule id
	@Override
	public ScheduleBus getById(String id) {
		return busRepository.findById(id.trim()).get();
	}
}
