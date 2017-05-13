package Problem_2;

public class Doctor extends Person{
	//class local variables
	String specialty;
	double officeVisitFee;
	
	//constructor
	
	//default
	public Doctor(String name) {
		super(name);
		specialty = "";
		officeVisitFee = 0.00;	
	}
	
	public Doctor(String name, String newSpecialty, double newOfficeVisitFee) {
		super(name);
		specialty = newSpecialty;
		officeVisitFee = newOfficeVisitFee;	
	}
	
	//accessors and mutators
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public double getOfficeVisitFee() {
		return officeVisitFee;
	}

	public void setOfficeVisitFee(double officeVisitFee) {
		this.officeVisitFee = officeVisitFee;
	}

	//methods
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Office Fee: " + officeVisitFee 
			+ "\nSpecialty: " + specialty);

	}
	
}
