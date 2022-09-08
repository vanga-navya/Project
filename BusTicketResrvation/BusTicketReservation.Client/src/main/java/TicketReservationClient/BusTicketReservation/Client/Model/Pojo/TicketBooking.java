package TicketReservationClient.BusTicketReservation.Client.Model.Pojo;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;

public class TicketBooking {
	private int ticketId;
	private Customer customerId;
	private BusDetails busId;
	private int noOfSeatsBooked;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBooking;
	private Double amount;
	private String status;
	private String bid;
	private int sid;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public BusDetails getBusId() {
		return busId;
	}

	public void setBusId(BusDetails busId) {
		this.busId = busId;
	}

	public int getNoOfSeatsBooked() {
		return noOfSeatsBooked;
	}

	public void setNoOfSeatsBooked(int noOfSeatsBooked) {
		this.noOfSeatsBooked = noOfSeatsBooked;
	}

	public LocalDate getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(LocalDate dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public Double getAmount() {
		return amount;
	}

	
	public TicketBooking(int ticketId, Customer customerId, BusDetails busId, int noOfSeatsBooked,
			LocalDate dateOfBooking, Double amount) {
		super();
		this.ticketId = ticketId;
		this.customerId = customerId;
		this.busId = busId;
		this.noOfSeatsBooked = noOfSeatsBooked;
		this.dateOfBooking = dateOfBooking;
		this.amount = amount;
	}

	public TicketBooking() {
		super();
	}

	

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TicketBooking [ticketId=" + ticketId + ", CutomerId=" + customerId + ", busId=" + busId
				+ ", noOfSeatsBooked=" + noOfSeatsBooked + ", dateOfBooking=" + dateOfBooking + ", amount=" + amount
				+ ", status=" + status + ", bid=" + bid + ", sid=" + sid + "]";
	}
}
