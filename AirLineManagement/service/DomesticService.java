package in.management.maven.AirLineManagement.service;
import java.util.ArrayList;
import in.management.maven.AirLineManagement.entity.DomesticAirLine;

public class DomesticService {
	private static final String Name = null;
	
	private static ArrayList<DomesticAirLine> flight = new ArrayList<DomesticAirLine>();
	
	public static ArrayList<DomesticAirLine> getAllFlight(){
		return flight;
	}
	public String userRegistration(String Name,String MobileNo,String Address,String PassportNo,String Nationality) {
		flight.add(null);
		return Name;	
	}
	
	public boolean Login(DomesticAirLine mobileNo) {
		flight.add(mobileNo);
		return true;
	}

	public String addFlight(String flight_Id, String flightName, String flightSource, String flightDestination,
			float arrivalTime, float depatureTime)
	{
		flight.add(new DomesticAirLine(flight_Id, flightName, flightSource, flightDestination, arrivalTime, depatureTime, depatureTime));
				return "Flight Added Successfully";
	}
	public boolean displayFlightDetails() {
		return flight.addAll(0, flight);
	}
	
	}
	
	
		
	

