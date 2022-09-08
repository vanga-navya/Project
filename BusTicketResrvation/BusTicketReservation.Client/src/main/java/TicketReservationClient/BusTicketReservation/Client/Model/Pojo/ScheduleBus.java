package TicketReservationClient.BusTicketReservation.Client.Model.Pojo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class ScheduleBus {
	private String scheduleId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate s_date;
	private String Time;
	public ScheduleBus(String scheduleId, LocalDate s_date) {
		super();
		this.scheduleId = scheduleId;
		this.s_date = s_date;
	}

	public ScheduleBus() {
		super();
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public LocalDate getS_date() {
		return s_date;
	}

	public void setS_date(LocalDate s_date) {
		this.s_date = s_date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

}
