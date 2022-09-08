package TicketReservationClient.BusTicketReservation.Client.Model.Pojo;

public class BusDetails {
	private String busId;
	private String busName;
	private String busNo;
	private int totalSeats;
	private String busType;

	private RouteMapDetails routeId;

	private ScheduleBus scheduleId;

	private String rid;
	private String sid;

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public RouteMapDetails getRouteId() {
		return routeId;
	}

	public void setRouteId(RouteMapDetails routeId) {
		this.routeId = routeId;
	}

	public ScheduleBus getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(ScheduleBus scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public BusDetails() {
		super();
	}

	public BusDetails(String busId, String busName, String busNo, int totalSeats, String busType,
			RouteMapDetails routeId, ScheduleBus scheduleId) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busNo = busNo;
		this.totalSeats = totalSeats;
		this.busType = busType;
		this.routeId = routeId;
		this.scheduleId = scheduleId;
	}

	@Override
	public String toString() {
		return "BusDetails [busId=" + busId + ", busName=" + busName + ", busNo=" + busNo + ", totalSeats=" + totalSeats
				+ ", busType=" + busType + ", routeId=" + routeId + ", scheduleId=" + scheduleId + ", rid=" + rid
				+ ", sid=" + sid + "]";
	}

}
