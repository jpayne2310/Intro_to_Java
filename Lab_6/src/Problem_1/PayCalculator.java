package Problem_1;

public abstract class PayCalculator {
double payRate;
	
	public PayCalculator(double newPayRate) {
		payRate = newPayRate ;
	}
	
	//accessor and mutator
	

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	//methods
	public double getPay(double hours) {
		double pay = hours * payRate;
		return pay;
	}
	
	public void changeRate(double rate) {
		setPayRate(rate);
	}

}
