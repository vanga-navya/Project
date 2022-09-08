package TicketReservationClient.BusTicketReservation.Client.Model.Pojo;

public class RouteMapDetails {
	private String r_Id;
	private String r_from;
	private String r_to;
	private int dist_cost;

	public RouteMapDetails() {
		super();
	}

	public String getR_Id() {
		return r_Id;
	}

	public void setR_Id(String r_Id) {
		this.r_Id = r_Id;
	}

	public String getR_from() {
		return r_from;
	}

	public void setR_from(String r_from) {
		this.r_from = r_from;
	}

	public String getR_to() {
		return r_to;
	}

	public void setR_to(String r_to) {
		this.r_to = r_to;
	}

	public int getDist_cost() {
		return dist_cost;
	}

	public void setDist_cost(int dist_cost) {
		this.dist_cost = dist_cost;
	}

	public RouteMapDetails(String r_Id, String r_from, String r_to, int dist_cost) {
		super();
		this.r_Id = r_Id;
		this.r_from = r_from;
		this.r_to = r_to;
		this.dist_cost = dist_cost;
	}

	@Override
	public String toString() {
		return "RouteMapDetails [r_Id=" + r_Id + ", r_from=" + r_from + ", r_to=" + r_to + ", dist_cost=" + dist_cost
				+ "]";
	}

}
