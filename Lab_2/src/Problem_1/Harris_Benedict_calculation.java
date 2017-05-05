package Problem_1;
import java.util.*;
public class Harris_Benedict_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("This program will calculate the number of 230 calorie");
		System.out.println("candy bars to eat to maintain your weight.");
		System.out.println("What is your age in years?");
		int age = keyboard.nextInt();
		System.out.println("what is your total height in inches?");
		int height = keyboard.nextInt();
		System.out.println("What is your weight in pounds?");
		int pounds = keyboard.nextInt();
		System.out.println("Enter \'M\' for male calculation or \'F\' for female calculation.");
		String gender = keyboard.next().toLowerCase();
		//check user input for usable result
	    while((!gender.equals("m")) && (!gender.equals("f")))
	    {
	    	System.out.println("You must Enter \'M\' for male calculation or \'F\' for female calculation.");
	    	gender = keyboard.next().toLowerCase();
	    }
	    
		System.out.println("Are you:");
		System.out.println("\tA. Sedentary");
		System.out.println("\tB. Somewhat active (exercise occasionally)");
		System.out.println("\tC. Active (exerise 3-4 days per week)");
		System.out.println("\tD. Highly active (exercise everyday");
		System.out.println("Enter A,B,C, or D.");
		String activity = keyboard.next().toUpperCase();
		
		//initialize calculating variables 
		double BMG = 0.0, bars = 0.0, bar_calories = 230;
		
		//calculate BMG per gender
		if(gender.equals("m")) {
			gender = "male";
			BMG = (66 + (6.3 * pounds) + (12.9 * height) - (6.8 * age));
		} else {
			gender = "female";
			BMG = (655 + (4.3 * pounds) + (4.7 * height) - (4.7 * age));
		}

		//factor in activity and resolve bar quantity
		switch(activity) {
		case "A":
			bars = (BMG * 1.2)/bar_calories;
			break;
		case "B":
			bars = (BMG * 1.3)/bar_calories;
			break;
		case "C":
			bars = (BMG * 1.4)/bar_calories;
			break;
		case "D":
			bars = (BMG * 1.5)/bar_calories;
			break;
		default:
			System.out.print("You did not enter a valid activity.");
			System.exit(0);
		
		}		
			System.out.print("A " + gender + " with those measurements should eat ");
			
			//format bars for desired output
			System.out.printf("%.2f", bars);
			System.out.print(" candy bars per day to maintain the same weight.");
	}
}