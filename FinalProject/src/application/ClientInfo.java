package application;
import java.time.LocalDate;
import java.util.*;
public class ClientInfo {
	

	private static double MonthlyTaxPaid = 0;
	double totalPMI = 0;

	double homeValue;
	private double loanAmount;
	double intRate;
	int loanTerm;
	String date;
	double propertyTax;
	double PMI;
	double homeIns;
	double monthlyHOA;
	
	public ClientInfo() {
		homeValue = 0;
		loanAmount = 0;
		intRate = 0;
		loanTerm = 0;
		date = "";
		propertyTax = 0;
		PMI = .010832;
		homeIns = 0;
		monthlyHOA = 0;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getHomeValue() {
		return homeValue;
	}

	public void setHomeValue(double homeValue) {
		this.homeValue = homeValue;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate/100;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public double getPropertyTax() {
		return propertyTax;
	}

	public void setPropertyTax(double propertyTax) {
		this.propertyTax = propertyTax/100;
	}

	public double getHomeIns() {
		return homeIns;
	}

	public void setHomeIns(double homeIns) {
		this.homeIns = homeIns;
	}

	public double getMonthlyHOA() {
		return monthlyHOA;
	}

	public void setMonthlyHOA(double monthlyHOA) {
		this.monthlyHOA = monthlyHOA;
	}
	
	//methods
	public double CalMonthlyPayment() {
		//double powerCal = Math.pow((1 + intRate), loanTerm);
		//double monthlyPaymentpart1 = (intRate*powerCal)/(powerCal-1);
		double monthlyPayment = (loanAmount*.006356)+CalMonthlyPMI();
		return monthlyPayment;
	}
	public double CalAfterMonthsPMI() {
		double afterMonthsPMI = CalMonthlyPayment()-CalMonthlyPMI();
		return afterMonthsPMI;
	}
	public double CalTotalPMI() {
		double totalPMI =  loanAmount*PMI;
		return totalPMI;
	}
	public double CalMonthlyPMI() {
		double monthlyPMI = CalTotalPMI()/26;
		return monthlyPMI;
	}
	public double CalMonthlyHomeIns() {
		double MonthlyHomeIns = homeIns/12;
		return MonthlyHomeIns;
	}
	public double CalTotalHomeIns() {
		double totalHomeIns = homeIns * loanTerm;
		return totalHomeIns;
	}
	public double CalMonthlyTaxPaid() {
		MonthlyTaxPaid = (homeValue * propertyTax)/12;
		return MonthlyTaxPaid;
	}
	public double CalTotalTaxPaid() {
		double totalTaxPaid = MonthlyTaxPaid * 12 * 30;
		return totalTaxPaid;
	}
	public double CalAnnualPaymentAmount() {
		double annualPaymentAmount = CalAfterMonthsPMI() * 12;
		return annualPaymentAmount;
	}
	public double CalTotalPaymentAmount() {
		double totalPaymentAmount = (CalMonthlyPayment() * 26) + (CalAfterMonthsPMI() * 334);
		return totalPaymentAmount;
	}
	public double CalTotalInterest() {
		double totalInterest = loanAmount*.70786;
		return totalInterest;
	}
	public String CalDate() {
		String startDate = getDate();
		String yearGrab = startDate.substring(0,4);
		int newYear = Integer.parseInt(yearGrab) + getLoanTerm();
		String yearBackToString = Integer.toString(newYear);
		String closingDate = yearBackToString + startDate.substring(4, 10);
		return  closingDate;
	}

}
