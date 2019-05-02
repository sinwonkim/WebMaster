
public class Korea {
	String nation = "대한민국";
	String name;
	String ssn;
	int phoneNumber;
	
	
	public Korea(String name, String ssn) {
		this.name = name; // this.필드 = 매개변수;
		this.ssn = ssn;
	}
	
	public Korea(String nation, int phoneNumber ) {
		this.nation = nation;
		this.phoneNumber = phoneNumber;
		
	}
}
