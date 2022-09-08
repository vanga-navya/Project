package Project.BusTicketReservation.Model.Pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
@Entity
@NamedQueries({
	@NamedQuery(name = "CancelTicket.maxvalue",
	query = "Select max(c.cancelT_Id) from CancelTicket c ")
})
public class CancelTicket {
	@Id
	private int cancelT_Id;
	@OneToOne
	@JoinColumn(name = "CustomerId")
	private Customer customerId;
	private LocalDate cancelledDate;
	private int noOfTicketCancelled;
	@OneToOne
	@JoinColumn(name = "TicketId")
	private TicketBooking ticketId;
	private double refundAmonut;
	@Transient
	private int custId;
	@Transient
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
	public void setRefundAmonut(double refundAmonut) {
		this.refundAmonut = refundAmonut;
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
	@Override
	public String toString() {
		return "CancelTicket [cancelT_Id=" + cancelT_Id + ", customerId=" + customerId + ", cancelledDate="
				+ cancelledDate + ", noOfTicketCancelled=" + noOfTicketCancelled + ", ticketId=" + ticketId
				+ ", refundAmonut=" + refundAmonut + ", custId=" + custId + ", TickId=" + TickId + "]";
	}
}
