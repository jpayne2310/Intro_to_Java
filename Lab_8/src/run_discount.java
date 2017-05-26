
public class run_discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 4;
		float itemCost = 20;
		int minimumRequired = 5;
		float percent = 20;
		int n = 3;
		
		BulkDiscount num1 = new BulkDiscount(minimumRequired, percent);
		num1.setPercent(percent);
		BuyNItemsGetOneFree num2 = new BuyNItemsGetOneFree(n);
		
		System.out.println(num1.computeDiscount(count, itemCost));
		System.out.println(num2.computeDiscount(count, itemCost));
		
	}

}
;