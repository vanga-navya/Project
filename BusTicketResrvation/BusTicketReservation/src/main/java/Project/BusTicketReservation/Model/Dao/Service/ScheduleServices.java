package Project.BusTicketReservation.Model.Dao.Service;

import java.util.List;

import Project.BusTicketReservation.Model.Pojo.ScheduleBus;

public interface ScheduleServices {
	List<ScheduleBus> GetAll();
	String insertintoScheduleBus(ScheduleBus SB);
	ScheduleBus getById(String id);
}
