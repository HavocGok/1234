package in.management.maven.AirLineManagement.entity;

public class UserRegistration {
	private String Name;
	private int Cus_id;
	private int Age;
	private String Mobileno;
	private String Address;
	private String Email;
	String PassportNo;
	String Nationality;
	
	public UserRegistration(String name, int cus_id, int age, String mobileno, String address,String Email,String passportno,String nationality) {
		super();
		Name = name;
		Cus_id = cus_id;
		Age = age;
		Mobileno = mobileno;
		Address = address;
		PassportNo = passportno;
		Nationality = nationality;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCus_id() {
		return Cus_id;
	}

	public void setCus_id(int cus_id) {
		Cus_id = cus_id;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getMobileno() {
		return Mobileno;
	}

	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		Email = Email;
	}
	

	public String getPassportNo() {
		return PassportNo;
	}

	public void setPassportNo(String passportNo) {
		PassportNo = passportNo;
	}
	
	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	@Override
	public String toString() {
		return "Passengers [Name=" + Name + ", Cus_id=" + Cus_id + ", Age=" + Age + ", Mobileno=" + Mobileno
				+ ", Address=" + Address + ", Email=" + Email + ", PassportNo=" + PassportNo + ",Nationality="+Nationality+"]";
	}

	public void displayPassengersDetails(){
		
	System.out.println("Full Name =" + Name);
	System.out.println("passport No =" + PassportNo);
	System.out.println("Age =" + Age);
	System.out.println("Mobile No =" + Mobileno);
	System.out.println("Nationality =" + Nationality);
	}
}
