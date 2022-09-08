package Project.BusTicketReservation.Model.Dao.Service;

import java.util.List;

import Project.BusTicketReservation.Model.Pojo.RouteMapDetails;
public interface RouteServices {
	List<RouteMapDetails> GetAll();
	String insertintoRouteMap(RouteMapDetails RM);
	RouteMapDetails getById(String id);
	
}
