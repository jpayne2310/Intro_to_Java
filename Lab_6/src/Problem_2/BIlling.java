package Problem_2;

public class BIlling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Two doctors created:");
		System.out.println("");
		
		Doctor d1 = new Doctor("Spock");
		Doctor d2 = new Doctor("Dolittle");
		
		d1.setOfficeVisitFee(200.0);
		d2.setOfficeVisitFee(175.0);
		
		d1.setSpecialty("Pediatrician");
		d2.setSpecialty("Witch");
		
		d1.writeOutput();
		System.out.println("");
		System.out.println("");
		d2.writeOutput();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Two patients created:");
		System.out.println("");
		
		Patient p1 = new Patient("Calvin");
		Patient p2 = new Patient("Hobbes");
		
		p1.setIdNumber("123-45-6789");
		p1.setIdNumber("987-65-4321");
		
		p1.writeOutput();
		System.out.println("");
		System.out.println("");
		p2.writeOutput();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Three billing records created:");
		System.out.println("");
		
		System.out.println("Doctor: " + d1.getName());
		System.out.println("Patient: " + p1.getName());
		System.out.println("Billing Amount: $" + d1.getOfficeVisitFee());
		System.out.println("===============================================");
		
		System.out.println("");
		System.out.println("Doctor: " + d1.getName());
		System.out.println("Patient: " + p2.getName());
		System.out.println("Billing Amount: $" + d1.getOfficeVisitFee());
		System.out.println("===============================================");
		
		System.out.println("");
		System.out.println("Doctor: " + d2.getName());
		System.out.println("Patient: " + p1.getName());
		System.out.println("Billing Amount: $" + d2.getOfficeVisitFee());
		System.out.println("===============================================");
		
		System.out.println("");
		System.out.println("");
		//System.out.println("First billing record equal to the second =" + Person.hasSameName("Hobbes"));
	}
	

}
