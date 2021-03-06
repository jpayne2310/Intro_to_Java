package Problem_2;

public class Billing extends Person{
	String patientName;
	String doctorName;
	double billingAmount;
	
	//constructor to receive object
	public Billing(Person Doctor, Person Patient) {
		doctorName = Doctor.getName();
		patientName = Patient.getName();
		billingAmount = ((Doctor) Doctor).getOfficeVisitFee();
	}
	
	public void writeOutput(Billing anotherBill) {
			System.out.println("Doctor: " + doctorName + "\nPatient: " + patientName + 
					"\nBilling Amount: " + billingAmount + 
					"\n===============================\n");
		}
	
	//bill comparison
	public Boolean compareRecord(Billing anotherBill) {
		return (this.doctorName.equalsIgnoreCase(anotherBill.doctorName) && 
				this.patientName.equalsIgnoreCase(anotherBill.patientName) && 
				this.billingAmount == anotherBill.billingAmount);
	}
	
}
