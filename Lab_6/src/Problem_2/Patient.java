package Problem_2;

public class Patient extends Person{
	String idNumber;
	
	//constructor
	public Patient(String name) {
		super(name);
		idNumber = "";
	}

	//accessors and mutatord
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	//methods
	public void writeOutput() {
		System.out.println("Social Security #: " + idNumber);
	}
}
