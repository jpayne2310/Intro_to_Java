package Problem_1;

public class run_PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPay easyJob = new RegularPay(7.5);
		HazardPay hardJob = new HazardPay(7.5);
		
		System.out.println("40 hours regular pay 7.5 is " + easyJob.getPay(40));
		System.out.println("40 hours regular pay 7.5 is " + hardJob.getPay(40));
		
		
		easyJob.changeRate(17.00);
		hardJob.changeRate(17.00);
		
		System.out.println(" ");
		System.out.println("40 hours regular pay 17 is " + easyJob.getPay(40));
		System.out.println("40 hours regular pay 17 is " + hardJob.getPay(40));
	}

}
