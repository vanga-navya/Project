package Project.BusTicketReservation.Model.Dao.ServiceImplementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.BusTicketReservation.Model.Dao.Service.CustomerServices;
import Project.BusTicketReservation.Model.Pojo.Customer;
import Project.BusTicketReservation.Repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerServices {
	@Autowired
	CustomerRepository customerRepository;
//To get all customer records
	@Override
	public List<Customer> GetAll() {
		return customerRepository.findAll();

	}
//Insertion of customer details
	@Override
	public String insertintoCustomer(Customer C) {
		List<Customer> Cu = customerRepository.findAll();
		LocalDate d = LocalDate.now();
		int yy = d.getYear();
		String y = Integer.toString(yy);
		int mm = d.getMonthValue();
		String m = Integer.toString(mm);

		if (Cu.isEmpty()) {
			int i = 1000;
			String Id = y + m + i;
			C.setCustomerId(Integer.parseInt(Id));
			customerRepository.save(C);
			return "Your Registration Id:" + " " + C.getCustomerId();
		} else {
			C.setCustomerId(customerRepository.maxvalue() + 1);
			customerRepository.save(C);
			return "Your Registration Id:" + "  " + C.getCustomerId();

		}
//			Customer Ele = Cu.get(Cu.size() - 1);
//			int custId = Ele.getCustomerId();
//			custId++;
//			String Id = Integer.toString(custId);
//			C.setCustomerId(Integer.parseInt(Id));
//			customerRepository.save(C);
//			return "1 Row Inserted CustomerId"+C.getCustomerId();
//		}

	}

	@Override
	public String update(Customer C) {
		customerRepository.save(C);
		return "Successfully Updated";
	}
	public Customer GetById(int id) {
		return customerRepository.findById(id).get();
	}

}
