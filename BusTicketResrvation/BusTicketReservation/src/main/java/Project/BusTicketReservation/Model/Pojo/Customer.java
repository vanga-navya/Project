package Project.BusTicketReservation.Model.Pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Tbl_CustomerDetails")
@NamedQueries({
	@NamedQuery(name = "Customer.maxvalue",
	query = "Select max(c.customerId) from Customer c ")
})
public class Customer {
	@Id
	private int customerId;
	@Column(length = 40)
	private String customerName;
	@Column
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private String email;
	@Column(length = 20)
	private String contactNo;
	private String country;
	private String state;
	private String city;
	@Column(length = 6)
	private int pinCode;
	private String Address;
	private String customerType;
	private String Password;
	private String confirmPassword;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Customer(int customerId, String customerName, String gender, LocalDate dob, String email, String contactNo,
			String country, String state, String city, int pinCode, String address, String customerType,
			String password, String confirmPassword) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.contactNo = contactNo;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
		Address = address;
		this.customerType = customerType;
		Password = password;
		this.confirmPassword = confirmPassword;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender + ", dob="
				+ dob + ", email=" + email + ", contactNo=" + contactNo + ", country=" + country + ", state=" + state
				+ ", city=" + city + ", pinCode=" + pinCode + ", Address=" + Address + ", customerType=" + customerType
				+ ", Password=" + Password + ", confirmPassword=" + confirmPassword + "]";
	}

}
