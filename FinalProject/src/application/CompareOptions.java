package application;

public class CompareOptions extends ClientInfo {
	
	double biWeeklyPayment;
	String biWeeklyPayOff;
	double biWeeklyInt;
	double difference;
	
	public CompareOptions(double homeValue, double loanAmount, double intRate, int loanTerm, String date, double propertyTax, double PMI, double homeIns, double monthlyHOA) {
		super(homeValue, loanAmount, intRate, loanTerm, date, propertyTax, PMI, homeIns, monthlyHOA);
		biWeeklyPayment = 0;
		biWeeklyPayOff = "";
		biWeeklyInt = 0;
	}

	
	
	//methods
	public double CalBiWeeklyPayment(double monthlyPayment) {
		biWeeklyPayment = monthlyPayment / 2;
		return biWeeklyPayment;
	}
	public String CalbiWeeklyPayOff(String closingDate) {
		String yearGrab = closingDate.substring(0,4);
		int newYear = Integer.parseInt(yearGrab) - 4;
		String yearBackToString = Integer.toString(newYear);
		String newClosingDate = yearBackToString + closingDate.substring(4, 10);
		return  newClosingDate;
	}
	public double CalbiWeeklyInt(double loanAmount) {
		biWeeklyInt = loanAmount * .595668;
		return biWeeklyInt;
	}
	public double savings(double totalInterest) {
		difference = totalInterest - biWeeklyInt;
		return difference;
	}

}
