package Project.BusTicketReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.BusTicketReservation.Model.Dao.ServiceImplementation.CustomerServiceImplementation;
import Project.BusTicketReservation.Model.Pojo.Customer;

@RestController
public class CustomerController {
	@Autowired
	CustomerServiceImplementation customerServiceImplementation;

	@GetMapping("/getAllcustomer")
	public List<Customer> GetAll() {
		return customerServiceImplementation.GetAll();
	}

	@PostMapping("/inserCustomer")
	public String insertCustomer(@RequestBody Customer C) {
		System.out.println(C.toString());
		String s = customerServiceImplementation.insertintoCustomer(C);
		return s;
	}

	@GetMapping("/getbyId/{id}")
	public Customer GetAllById(@PathVariable("id") int id) {
		return customerServiceImplementation.GetById(id);
	}
	@PutMapping("/updateCustomer")
	public String update(@RequestBody Customer C) {
		return customerServiceImplementation.update(C);
	}
	
}
