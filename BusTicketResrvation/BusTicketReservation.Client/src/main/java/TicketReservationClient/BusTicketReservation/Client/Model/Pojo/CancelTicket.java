package TicketReservationClient.BusTicketReservation.Client.Model.Pojo;

import java.time.LocalDate;


public class CancelTicket {

	private int cancelT_Id;
	private Customer customerId;
	private LocalDate cancelledDate;
	private int noOfTicketCancelled;
	private TicketBooking ticketId;
	private double refundAmonut;
	private int custId;
	private int TickId;
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public LocalDate getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(LocalDate cancelledDate) {
		this.cancelledDate = cancelledDate;
	}
	public int getNoOfTicketCancelled() {
		return noOfTicketCancelled;
	}
	public void setNoOfTicketCancelled(int noOfTicketCancelled) {
		this.noOfTicketCancelled = noOfTicketCancelled;
	}
	public TicketBooking getTicketId() {
		return ticketId;
	}
	public void setTicketId(TicketBooking ticketId) {
		this.ticketId = ticketId;
	}
	public double getRefundAmonut() {
		return refundAmonut;
	}
	public Double setRefundAmonut(double refundAmonut) {
		return this.refundAmonut = refundAmonut;
	}
	
	public CancelTicket() {
		super();
	}
	public int getCancelT_Id() {
		return cancelT_Id;
	}
	public void setCancelT_Id(int cancelT_Id) {
		this.cancelT_Id = cancelT_Id;
	}
	public CancelTicket(int cancelT_Id, Customer customerId, LocalDate cancelledDate, int noOfTicketCancelled,
			TicketBooking ticketId, double refundAmonut) {
		super();
		this.cancelT_Id = cancelT_Id;
		this.customerId = customerId;
		this.cancelledDate = cancelledDate;
		this.noOfTicketCancelled = noOfTicketCancelled;
		this.ticketId = ticketId;
		this.refundAmonut = refundAmonut;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getTickId() {
		return TickId;
	}
	public void setTickId(int tickId) {
		TickId = tickId;
	}
}
