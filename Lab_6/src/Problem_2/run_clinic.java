package Problem_2;

public class run_clinic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Two doctors created:");
		
		Doctor d1 = new Doctor("Spock", "Pediatrician", 200.0);
		Doctor d2 = new Doctor("Dolittle", "Witch", 175.0);
		
		d1.writeOutput();
		d2.writeOutput();
		
		System.out.println("\nTwo patients created:");	
		
		Patient p1 = new Patient("Calvin", "123-45-6789");
		Patient p2 = new Patient("Hobbes", "987-65-4321");
		
		p1.writeOutput();
		p2.writeOutput();
		
		System.out.println("\nThree billing records created:\n");
		
		Billing b1 = new Billing(d1, p1);
		b1.writeOutput(b1);
		
		Billing b2 = new Billing(d1, p2);
		b2.writeOutput(b2);
		
		Billing b3 = new Billing(d2, p1);
		b3.writeOutput(b3);
		
		System.out.println("\nFirst billing record equal to the second = " + b1.compareRecord(b2));
	}	
}
