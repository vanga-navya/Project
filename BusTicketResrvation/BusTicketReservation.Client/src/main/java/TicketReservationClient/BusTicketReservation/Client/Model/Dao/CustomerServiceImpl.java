package TicketReservationClient.BusTicketReservation.Client.Model.Dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.BusDetails;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.CancelTicket;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.Customer;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.RouteMapDetails;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.ScheduleBus;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.TicketBooking;

public class CustomerServiceImpl {
	@Autowired
	RestTemplate restTemplate;
	public String url = "http://localhost:8090/";

	public List<Customer> GetAll() {
		Customer[] cust = restTemplate.getForObject(url + "getAllcustomer", Customer[].class);
		return Arrays.asList(cust);
	}

	public String insert(Customer c) {
		return restTemplate.postForObject("http://localhost:8090/inserCustomer", c, String.class);
	}

	public int getEmpDetails(int customerId, String password) {
		List<Customer> L = GetAll();
		List<Customer> l1 = L.stream().filter(i -> i.getCustomerId() == customerId).collect(Collectors.toList());
		System.out.println(l1.get(0).getCustomerId());
		if (l1.size() != 0) {
			Customer c=l1.get(0);
			if(c.getPassword().equals(password)) {
				return 1;
			}
			//List<Customer> l2 = l1.stream().filter(i -> i.getPassword().equals(password)).collect(Collectors.toList());
			//if (l2.size() != 0) {
			//	System.out.println("Valid");
			//	return 1;
		//	}
			return 0;
		}
		return -1;
	}

	public String insertBus(BusDetails B) {
		return restTemplate.postForObject("http://localhost:8090/" + "insertbusDetails", B, String.class);
	}

	public void saveBD(BusDetails B) {
		 restTemplate.put("http://localhost:8090/" + "Save", B);
	}

	public String insertSchedule(ScheduleBus B) {
		System.out.println(B.getS_date());
		return restTemplate.postForObject("http://localhost:8090/" + "insertScheduleDetails", B, String.class);
	}

	public String insertRoute(RouteMapDetails R) {
		return restTemplate.postForObject("http://localhost:8090/inserRouteDetails", R, String.class);
	}

	public List<BusDetails> getallBus() {
		BusDetails B[] = restTemplate.getForObject("http://localhost:8090/getAll", BusDetails[].class);
		return Arrays.asList(B);
	}

	public List<RouteMapDetails> getallRoute() {
		RouteMapDetails B[] = restTemplate.getForObject("http://localhost:8090/getAllroutes", RouteMapDetails[].class);
		return Arrays.asList(B);
	}

	public List<ScheduleBus> getAllShedule() {
		ScheduleBus B[] = restTemplate.getForObject("http://localhost:8090/getAllSchedule", ScheduleBus[].class);
		return Arrays.asList(B);
	}

	public RouteMapDetails getbyId(String rid) {
		RouteMapDetails R = restTemplate.getForObject("http://localhost:8090/getByRId/" + rid, RouteMapDetails.class);
		return R;
	}

	public ScheduleBus getbySId(String sid) {
		ScheduleBus R = restTemplate.getForObject("http://localhost:8090/getBySId/" + sid, ScheduleBus.class);
		return R;
	}

	public String InsertIntoTicket_Booking(TicketBooking B) {
		return restTemplate.postForObject("http://localhost:8090/insertintoT", B, String.class);
	}

	public BusDetails getbyBid(String bid) {
		BusDetails R = restTemplate.getForObject("http://localhost:8090/getByBId/" + bid, BusDetails.class);
		return R;
	}

	public List<TicketBooking> getAllTickets() {
		TicketBooking B[] = restTemplate.getForObject("http://localhost:8090/getTickets", TicketBooking[].class);
		return Arrays.asList(B);
	}

	public TicketBooking geyByTId(int tid) {
		TicketBooking R = restTemplate.getForObject("http://localhost:8090/getByIdTicket/" + tid, TicketBooking.class);
		return R;
	}

	public String InsertIntoCanellT(CancelTicket B) {
		return restTemplate.postForObject("http://localhost:8090/intoCancelTicket", B, String.class);
	}
	public void DeleteTId(int tid) {
		 restTemplate.delete("http://localhost:8090/deleteTicketByTId/"+tid);
	}
	public String SaveUpdateTBooking(TicketBooking b)
	{
		return restTemplate.postForObject("http://localhost:8090/Save",b,String.class);
	}
	public void saveCanceTick(TicketBooking tB) {
		 restTemplate.put("http://localhost:8090/" + "SaveTicketB", tB);
	}
	public Customer geyByCustId(int tid) {
		Customer R = restTemplate.getForObject("http://localhost:8090/getbyId/" + tid, Customer.class);
		return R;
	}
	public void saveCustomer(Customer c) {
		 restTemplate.put("http://localhost:8090/" + "updateCustomer", c);
	}
	
	public List<TicketBooking> getByCustomerId(int tid) {
		TicketBooking[] t=restTemplate.getForObject("http://localhost:8090/getByIdTicketAll/" + tid, TicketBooking[].class);
		return  Arrays.asList(t);
		
	}
}