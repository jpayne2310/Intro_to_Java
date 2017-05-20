package application;

public class ClientInfo {
	public class java {

	}

	private static double MonthlyTaxPaid = 0;

	double homeValue;
	double loanAmount;
	double intRate;
	int loanTerm;
	double propertyTax;
	double PMI;
	double homeIns;
	double monthlyHOA;
	
	public ClientInfo() {
		homeValue = 0;
		loanAmount = 0;
		intRate = 0;
		loanTerm = 0;
		propertyTax = 0;
		PMI = 0;
		homeIns = 0;
		monthlyHOA = 0;
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
		this.intRate = intRate;
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

	public double getPMI() {
		return PMI;
	}

	public void setPMI(double pMI) {
		PMI = pMI;
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

}
