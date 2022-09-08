package TicketReservationClient.BusTicketReservation.Client.Controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import TicketReservationClient.BusTicketReservation.Client.Model.Dao.CustomerServiceImpl;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.BusDetails;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.CancelTicket;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.Customer;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.RouteMapDetails;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.ScheduleBus;
import TicketReservationClient.BusTicketReservation.Client.Model.Pojo.TicketBooking;

@Controller
@SessionAttributes({ "customerId", "customerName" })
public class CustomerControllers {

	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@RequestMapping("/")
	public String pageView() {
		return "home";
	}
	@RequestMapping("/Home1")
	public String HomeAdmin() {
		return "Home1";
	}
	@RequestMapping("/home")
	public String HomeLog() {
		return "home";
	}

	@RequestMapping("/About")
	public String About() {
		return "About";
	}

	@RequestMapping("/profile")
	public String profile(Model M, @SessionAttribute("customerId") int custId) {
		M.addAttribute("C", customerServiceImpl.geyByCustId(custId));
		return "profile";
	}

	@RequestMapping("/PV")
	public String profileView(Model M, @SessionAttribute("customerId") int custId) {
		System.out.println(custId);
		M.addAttribute("Customer", customerServiceImpl.geyByCustId(custId));
		return "EProfile";
	}

	@RequestMapping("/EE")
	public String EditProfile(Model M, @ModelAttribute("Cu") Customer C, @SessionAttribute("customerId") int custId) {
		C.setCustomerId(custId);
		C.setConfirmPassword(C.getPassword());
		customerServiceImpl.saveCustomer(C);
		M.addAttribute("msg", "Profile Updated");
		return "EProfile";
	}

	@RequestMapping("/BookT")
	public String pageBookTTi1(Model M) {
		M.addAttribute("c", "1");
		M.addAttribute("E", customerServiceImpl.getallBus());
		return "Book_ticket";
	}

	@RequestMapping("/BookT1")
	public String pageBookTTi(Model M, @ModelAttribute("T") TicketBooking TB) {
		System.out.println(TB.toString());
		BusDetails B0 = customerServiceImpl.getbyBid(TB.getBid());
		RouteMapDetails RM = customerServiceImpl.getbyId(B0.getRouteId().getR_Id());
		System.out.println("after Multiplication of Ti Cost");
		Double Am = (double) (RM.getDist_cost() * TB.getNoOfSeatsBooked());
		System.out.println(Am);
		M.addAttribute("amount", "Your Have to Pay :" + Am);
		TB.setAmount(Am);
		System.out.println(TB.toString());
		System.out.println("After Bus Booked:");
		System.out.println(B0.toString());
		B0.setTotalSeats((B0.getTotalSeats() - TB.getNoOfSeatsBooked()));
		System.out.println(B0.toString());
		customerServiceImpl.saveBD(B0);
		customerServiceImpl.InsertIntoTicket_Booking(TB);
		return "Book_ticket";
	}

	@RequestMapping("/cancelT")
	public String cancelTicket1() {
		return "cancel_Ticket";
	}
	
	@RequestMapping("/check1")
	public String checkTicket1() {
		return "search";
	}

	@RequestMapping("/cancelT1")
	public String cancelTicket(Model M, @RequestParam("ticketId") int Tid) {
		System.out.println(Tid);
		CancelTicket C = new CancelTicket();
		TicketBooking TB = customerServiceImpl.geyByTId(Tid);
		System.out.println(TB.toString());
		TB.getCustomerId().getCustomerId();
		LocalDate D = LocalDate.now();
		C.setCancelledDate(D);
		C.setNoOfTicketCancelled(TB.getNoOfSeatsBooked());
		BusDetails B0 = TB.getBusId();
		B0.setTotalSeats(B0.getTotalSeats() + TB.getNoOfSeatsBooked());
		C.setCustId(TB.getCustomerId().getCustomerId());
		C.setTickId(Tid);
		LocalDate D1 = TB.getDateOfBooking();
		customerServiceImpl.saveBD(B0);
		Double amount = TB.getAmount();
		System.out.println("After Amount");
		System.out.println(amount);
		if (D1.compareTo(D) >= 1 && D1.compareTo(D) < 2) {
			amount = amount - 0.25 * amount;
		}
		Double mn = C.setRefundAmonut(amount);
		M.addAttribute("ref", "Your Refund Amount:" + mn);
		TB.setAmount(mn);
		TB.setStatus("Ticket Cancelled");
		customerServiceImpl.saveCanceTick(TB);
		customerServiceImpl.InsertIntoCanellT(C);
		System.out.println(customerServiceImpl.InsertIntoCanellT(C).toString());
		M.addAttribute("msg", "Ticket Cancelled");
		return "cancel_Ticket";
	}

	@RequestMapping("/bus_form")
	public String pageView1(Model m) {
		m.addAttribute("c", customerServiceImpl.getallBus().size());
		List<BusDetails> l = customerServiceImpl.getallBus();
		if(l.isEmpty()) m.addAttribute("msg", "Bus Details not found!!");
		else m.addAttribute("E", customerServiceImpl.getallBus());
		m.addAttribute("Bus", "No Busess Allocated");
		System.out.println("Bus From");
		return "bus_form";
	}

	@RequestMapping("/AllCustomersD")
	public String GetAllBooks(Model M) {
		M.addAttribute("Customers", customerServiceImpl.GetAll());
		return "AllCustomers";
	}

	@RequestMapping("/insert")
	public String insert(Model m) {
		Customer C = new Customer();
		m.addAttribute("C", C);
		return "signup1";
	}

	/* Customers Added */
	@RequestMapping("/inserted")
	public String insertintoCustomer(Model M, @Valid @ModelAttribute("C") Customer C, BindingResult bs) {
		if (bs.hasErrors()) {
			return "signup1";
		} else {
			System.out.println(C.getCustomerName());

			C.setConfirmPassword(C.getPassword());
			System.out.println("client " + C.toString());
			M.addAttribute("msg", customerServiceImpl.insert(C));
			return "signup1";
		}
	}

	/* Here Check the Login Credentials of Customer */
	@RequestMapping("/LoginHere")
	public String Login1(Model m) {
		Customer L = new Customer();
		m.addAttribute("login", L);
		return "login";
	}

	@RequestMapping("/check")
	public String checkLogin(@Valid @ModelAttribute("login") Customer login, BindingResult bs, Model m) {
		if (bs.hasErrors()) {
			return "login";
		} else {
			System.out.println(login.getPassword());
			if (login.getCustomerId() == 12345 && login.getPassword().equals("Admin")) {
				m.addAttribute("customerId", login.getCustomerId());
				System.out.println(login.getCustomerId());
				return "adminHome";
			}/*else if(login.getCustomerId() != 12345) {
				m.addAttribute("msg", "Invalid UserId");
				return "login";
			}
			
			 * else if(!login.getPassword().equals("Admin")) { m.addAttribute("msg",
			 * "Invalid Password"); return "login"; }
			 */
			else {
				int L = customerServiceImpl.getEmpDetails(login.getCustomerId(), login.getPassword());
				if (L == -1) {
					m.addAttribute("msg", "Wrong CustomerId");
					return "login";
				} else if (L == 0) {
					m.addAttribute("msg", "Password Wrong");
					return "login";
				}
				m.addAttribute("customerId", login.getCustomerId());
				return "search";
			}
		}
	}

	// customer Logout session//
	@RequestMapping("/logout")
	public String logout(SessionStatus s, Model m) {
		s.setComplete();
		Customer L = new Customer();
		m.addAttribute("login", L);
		return "home";
	}

	/* Buses Added */
	@RequestMapping("/insertintobus")
	public String insertintoBus(Model m) {
		m.addAttribute("E", customerServiceImpl.getallRoute());
		m.addAttribute("E1", customerServiceImpl.getAllShedule());
		return "add_bus";
	}

	@RequestMapping("/insertedintoBus")
	public String insertintoBus(Model M, @ModelAttribute("C") BusDetails B) {
		System.out.println(B.toString());
		RouteMapDetails R = customerServiceImpl.getbyId(B.getRid());
		B.setRouteId(R);
		ScheduleBus S = customerServiceImpl.getbySId(B.getSid());
		B.setScheduleId(S);
		M.addAttribute("msg", customerServiceImpl.insertBus(B));
		return "add_bus";
	}

	/* Schedule Added */
	@RequestMapping("/insertintoschedule")
	public String insertintoShedule() {
		return "add_schedule";
	}

	@RequestMapping("/insertedintoSchedule")
	public String insertintoSchedule(Model M, @ModelAttribute("C") ScheduleBus B) {
		System.out.println(B.getTime() + " " + B.getS_date());
		M.addAttribute("msg", customerServiceImpl.insertSchedule(B));
		return "add_schedule";
	}

	/* Routes Added */
	@RequestMapping("/add_route")
	public String insertintoRoute() {
		return "add_route";
	}

	@RequestMapping("/insertedintoRoute")
	public String insertintoRoute(Model M, @ModelAttribute("R") RouteMapDetails R) {
		M.addAttribute("msg", customerServiceImpl.insertRoute(R));
		return "add_route";
	}

	/* Display's All Buses */
	@RequestMapping("/allBus")
	public String allBus(Model M) {
		M.addAttribute("E", customerServiceImpl.getallBus());
		return "bus_details";
	}

	/* Display's Tickets History */
	@RequestMapping("/History")
	public String allTicketHistroty(Model M,@SessionAttribute("customerId") int custId) {
		M.addAttribute("E", customerServiceImpl.getByCustomerId(custId));
		return "Tickets_Histroty";
	}

	/* Display All the Schedules */
	@RequestMapping("/AllSchedules")
	public String AllSChd(Model m) {
		m.addAttribute("sl", customerServiceImpl.getAllShedule());
		return "allSchedule";
	}

	/* Display All the Routes */
	@RequestMapping("/AllRoutes")
	public String AllSChd1(Model m) {
		m.addAttribute("sl", customerServiceImpl.getallRoute());
		return "allroutes";
	}
	
	@RequestMapping("/AllHistory")
	public String AllTickets(Model M)
	{
		M.addAttribute("LS", customerServiceImpl.getAllTickets());
		return "AllHistory";
	}
}
