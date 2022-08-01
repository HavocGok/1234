package in.management.maven.AirLineManagement.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DomesticAirlineDao<Details> {
	private Connection con;
	private java.sql.Statement st;

	public DomesticAirlineDao() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b7262", "root", "Gokulgokul123");
		} catch (ClassNotFoundException e) {
			System.out.println("No class Found " + e);
		} catch (SQLException e) {
			System.out.println("SOL Error " + e);
		}

	}

	public void FlightsDetails() {
		ArrayList<Details> fd = new ArrayList<Details>();
		try {
			st = con.createStatement();
			String srl ="select * from AirlineReservation";
			ResultSet rs = st.executeQuery(srl);
			
		}
		
		catch (SQLException e) {
			System.out.println("DATABASE ERROR....." + e);
		}
		}
}

