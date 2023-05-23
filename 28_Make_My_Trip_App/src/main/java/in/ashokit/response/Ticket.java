package in.ashokit.response;

import lombok.Data;

@Data
public class Ticket {

	private Integer ticketNum;
	private String status;
	private Double ticketCost;
	private String name;
	private String fromm;
	private String tto;
	private String doj;
	private String trainNumber;

}
