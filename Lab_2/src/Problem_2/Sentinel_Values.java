package Problem_2;

import java.util.*;
public class Sentinel_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter an integer (0 ends the input) : ");
		int input = -1, largest = 0, counter = 0;
		while(input != 0) {
			input = keyboard.nextInt();
			if(input == largest) {
				counter++;
			}
			if(input > largest) {
				largest = input;
				counter = 1;
			}
		}		
		System.out.println("The largest number is " + largest);
		System.out.println("The number " + largest + " appears " + counter + " times");
	}

}