package in.management.maven.AirLineManagement.entity;

import java.time.LocalDateTime;

public class DomesticAirLine {
	String Flight_Id;
	String FlightName;
	String FlightSource;
	String FlightDestination;
	float ArrivalTime;
	float DepatureTime;
	double TicketCost;
	public DomesticAirLine(String flight_Id, String name, String flightSource, String flightDestination,
			float arrivalTime, float depatureTime, double ticketCost) {
		super();
		Flight_Id = flight_Id;
		FlightName = name;
		FlightSource = flightSource;
		FlightDestination = flightDestination;
		ArrivalTime = arrivalTime;
		DepatureTime = depatureTime;
		TicketCost = ticketCost;
	}
	public String getFlight_Id() {
		return Flight_Id;
	}
	public void setFlight_Id(String flight_Id) {
		Flight_Id = flight_Id;
	}
	public String getName() {
		return FlightName;
	}
	public void setName(String name) {
		FlightName = name;
	}
	public String getFlightSource() {
		return FlightSource;
	}
	public void setFlightSource(String flightSource) {
		FlightSource = flightSource;
	}
	public String getFlightDestination() {
		return FlightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		FlightDestination = flightDestination;
	}
	public LocalDateTime getArrivalTime() {
		return Helper.StringToDateTimeFormatter(getFlightDestination());
	}
	//public void setArrivalTime(float arrivalTime) {
	//	ArrivalTime = Helper.StringToDateTimeFormatter(getFlightDestination);
	//}
	public float getDepatureTime() {
		return DepatureTime;
	}
	public void setDepatureTime(float depatureTime) {
		DepatureTime = depatureTime;
	}
	public double getTicketCost() {
		return TicketCost;
	}
	public void setTicketCost(double ticketCost) {
		TicketCost = ticketCost;
	}
	@Override
	public String toString() {
		return "DomesticAirLine [Flight_Id=" + Flight_Id + ", Name=" + FlightName + ", FlightSource=" + FlightSource
				+ ", FlightDestination=" + FlightDestination + ", ArrivalTime=" + ArrivalTime + ", DepatureTime="
				+ DepatureTime + ", TicketCost=" + TicketCost + "]";
	}

}
