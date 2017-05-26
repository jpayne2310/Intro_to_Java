
public class BuyNItemsGetOneFree extends DiscountPolicy {

	int n;
	
	public BuyNItemsGetOneFree(int newn) {
		n = newn;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	float computeDiscount(int count, float itemCost) {
		// TODO Auto-generated method stub
		int discount = (int) ((count/n) * itemCost);
		return discount;
	}

}
