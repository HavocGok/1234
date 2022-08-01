package in.management.maven.AirLineManagement;
import java.util.Scanner;
import in.management.maven.AirLineManagement.Dao.*;
import in.management.maven.AirLineManagement.entity.DomesticAirLine;
import in.management.maven.AirLineManagement.service.DomesticService;

public class App {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    System.out.println("Welcome The AIRLINE-RESERVATION MANAGEMENT SYSTEM");
    System.out.println();
    System.out.println("What You Looking For?");
    System.out.println();
    System.out.println("1. Domestic Airline \n2. International Airline");
    System.out.println();
    System.out.println("Give your choice :");
    int choice = s.nextInt();
    char ch;
    while(choice ==1 || choice ==2) {
    	switch(choice) {
    	
    	case 1:
    		ch = 'C';
    		while(ch == 'C') {
    			System.out.println();
    		
    			System.out.println("Domestic Airline");
    			System.out.println();
    			DomesticService urs = new DomesticService();
    			System.out.println(urs.displayFlightDetails());
    			System.out.println("%%%%%%%%%%%%%%%%%%");
    			System.out.println();
    			System.out.println("1. User Registration \n2. Login \n3.Reservation \n4. Cancellation \n5. Update Flight details \n6. Inventory  \n7. Online-Transcations \n8. E-Ticket Operations");
    			System.out.println("Enter the option :");
    			System.out.println();
    			int option = s.nextInt();
    			
    			String  Name,PassportNo,Nationality;
				String MobileNo;
    			switch(option) {
    			case 1:
    				System.out.println("Flight Details");
        			System.out.println();
        			System.out.print(urs.displayFlightDetails());
    			}
    		}
     
    			/*case 2:
        			System.out.println("User Registration :");
    				System.out.println();
    				System.out.println("Enter your Name :");
    				Name = s.next();
    				System.out.println("Enter your MobileNo :");
    				MobileNo = s.next();
    				System.out.println("Enter your PassPort Number :");
    				PassportNo = s.next();
    				System.out.println("Enter your Nationality :");
    				Nationality = s.next();
    				System.out.println();
    				System.out.println("Hii " +urs.userRegistration(Name, MobileNo, MobileNo, PassportNo, Nationality)+  " your Registration Successfully Completed!!");
    				System.out.println();
    				break;
    		
    			case 3:
    				System.out.println("Login");
    				System.out.println();
    				System.out.println("Enter your MobileNo :");
    				MobileNo =s.next();
    				if(MobileNo == MobileNo) {
    					System.out.println();
    				}
    				System.out.println(urs.Login(null));
    				System.out.println("Login Successfully");
    				break;
    				
    			case 4:
    				System.out.println("View AllFlights :");
    				for(DomesticAirLine c : DomesticService.getAllFlight()) {
    					System.out.println(c);
    				}
    				break;
    			case 5:
    				System.out.println("Reservation");
    				
    				
    			}
    		*/
    			
    		}
    		
    	}
    }
    
    
    
  }

