package Project.BusTicketReservation.Model.Pojo;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Tbl_S")
public class ScheduleBus {
	@Id
	private String scheduleId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate s_date;
	private String Time;
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
	public ScheduleBus(String scheduleId, LocalDate s_date, String time) {
		super();
		this.scheduleId = scheduleId;
		this.s_date = s_date;
		Time = time;
	}
	public ScheduleBus() {
		super();
	}

}
