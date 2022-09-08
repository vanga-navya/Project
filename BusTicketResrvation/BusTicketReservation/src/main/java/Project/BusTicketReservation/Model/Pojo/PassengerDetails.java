package Project.BusTicketReservation.Model.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Tbl_Pass_Det")
public class PassengerDetails {
	@Id
	private int Ticket_Id;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customerId;
	@Column(length = 20)
	private String passengerName;
	@Column(length = 3)
	private int age;
	@Column(length = 10)
	private String gender;
	
	public PassengerDetails() {
		super();
	}

	public int getTicket_Id() {
		return Ticket_Id;
	}

	public void setTicket_Id(int ticket_Id) {
		Ticket_Id = ticket_Id;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PassengerDetails(int ticket_Id, Customer customerId, String passengerName, int age, String gender) {
		super();
		Ticket_Id = ticket_Id;
		this.customerId = customerId;
		this.passengerName = passengerName;
		this.age = age;
		this.gender = gender;
	}

}
