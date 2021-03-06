
public class BulkDiscount extends DiscountPolicy {
	
	private static float discount = 0;
	int minimumRequired;
	float percent;
	
	public BulkDiscount(int newMinimumRequired, float newPercent) {
		minimumRequired = newMinimumRequired;
		percent = newPercent;
	}
	
	

	public int getMinimumRequired() {
		return minimumRequired;
	}



	public void setMinimumRequired(int minimumRequired) {
		this.minimumRequired = minimumRequired;
	}



	public float getPercent() {
		return percent;
	}



	public void setPercent(float newPersent) {
		this.percent = newPersent/100;
	}



	@Override
	float computeDiscount(int count, float itemCost) {
		// TODO Auto-generated method stub
		if(count >= minimumRequired) {
			 discount =  getPercent() * itemCost * count;
		}
		return discount;
	}

}
