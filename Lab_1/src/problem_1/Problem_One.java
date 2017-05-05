package problem_1;

import java.util.*;
public class Problem_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
	
		System.out.print("Enter x1 and y1: ");
		Float x1 = keyboard.nextFloat();
		Float y1 = keyboard.nextFloat();
		
		System.out.print("Enter x2 and y2: ");
		Float x2 = keyboard.nextFloat();
		Float y2 = keyboard.nextFloat();
		
		Float subx = (x2 - x1)*(x2 - x1);
		Float suby = (y2 - y1)*(y2 - y1);
		float totalxy = subx + suby;
		
		System.out.print("The distance of the two points is ");
		System.out.print(Math.pow(totalxy, 0.5));
	}
}