import java.util.*;
public class Lab_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyBoard = new Scanner(System.in);
		LinkedList <String>stadiumNames = new LinkedList<String>();
		LinkedList <Double>gameRevenue = new LinkedList<Double>();
		String name = "bob", target = " ";
		double money = 0.00, totalMoney = 0.00, stadiumMoney;
		Iterator <String>iterator;
		int counter = 0;
		
		System.out.println("Enter the data now.");
		System.out.println("On each line enter a stadium name and game revenue");
		System.out.println("Enter done when you are finished");
		name = keyBoard.next();
		while(!name.equals("done")) { 
			stadiumNames.add(name);
			money = keyBoard.nextDouble();
			gameRevenue.add(money);
			name = keyBoard.next();	 
		}
		
		System.out.println("Enter the name of the stadium to get the total revenue:");
		target = keyBoard.next();
		iterator = stadiumNames.iterator();
		//Iterator<Double> iterator2 = gameRevenue.iterator();;
		  while (iterator.hasNext()){
			  
			  if(iterator.next().equals(target)) {
				  stadiumMoney = gameRevenue.get(counter);
				  totalMoney = totalMoney + stadiumMoney;
			  }
			  counter++;
			    
		  }
		  System.out.println(target + " " + totalMoney);
	}

}
