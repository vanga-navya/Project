package TicketReservationClient.BusTicketReservation.Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import TicketReservationClient.BusTicketReservation.Client.Model.Dao.CustomerServiceImpl;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("BusTicket ReservationClient is Ready!...");
	}

	@Bean
	public RestTemplate getRestteRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CustomerServiceImpl bookServiceImpl() {
		return new CustomerServiceImpl();
	}

}
