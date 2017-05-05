package Problem_1;

import java.util.Arrays;
public class Ledger {
	float[] sale = new float[20];
	

	int salesMade = 0;
	int maxSales;
	float totalOfSales = 0;

	//constructors
	public Ledger() {
		salesMade = 0;
		maxSales = 0;
	}
	
	public Ledger(int max) {
		salesMade = 0;
		maxSales = max;
	}
	
	//gets and sets
	

	public int getSalesMade() {
		return salesMade;
	}
	
	public void setSalesMade(int salesMade) {
		this.salesMade = salesMade;
	}

	public int getMaxSales() {
		return maxSales;
	}

	public void setMaxSales(int maxSales) {
		this.maxSales = maxSales;
	}

	public float getSale(int x) {
		return sale[x];
	}

	public void setSale(float[] sale) {
		this.sale = sale;
	}


	
	//Methods
	public void addSale(float d) {	
		sale[salesMade] = d;
		salesMade++;
		totalOfSales = totalOfSales + d;
	}
	
	public int getNumberOfSales() {
		return getSalesMade();
	}
	
	public float getTotalSales() {
		return totalOfSales;
	}
	
	public float getAverageSales() {
			float averageSale = totalOfSales / salesMade;
			return averageSale;
	}
		
	public int getCountAboveTarget(double target) {	
		int count = 0;
		for(int i = 0; i < sale.length; i++) {
			if(sale[i] > target) {
				count++;
			}
		}
		return count;
	}


}