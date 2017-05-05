package Problem_3;


import java.util.*;
public class Determine_Fractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String symbol = " / ";
		
		System.out.print("Enter a numerator: ");
		int numerator = keyboard.nextInt();
		if(numerator != 0){
			do{
					System.out.print("Enter a denomiator: ");
					int denomiator = keyboard.nextInt();
					int sum = numerator/denomiator;
					if(numerator < denomiator  && sum < 1) {
						System.out.println(numerator + symbol + denomiator + " is a proper fraction");
						System.out.println(" ");
					}
					else {
							System.out.print(numerator + symbol + denomiator);
							System.out.print(" is an improper fraction and ");						
							
								//check for fractional remainder
								if(numerator%denomiator > 0 ){
									int remainder = numerator - (sum * denomiator);
									System.out.print("its mixed fraction is ");
									System.out.print(sum);
									System.out.println( " + " + remainder + symbol + denomiator);
									System.out.println(" ");
								}
								else {
									System.out.print("it can be reduced to ");
									System.out.println(sum);
									System.out.println(" ");
								}
					}				
				System.out.print("Enter a numerator: ");
				numerator = keyboard.nextInt();
			} while (numerator != 0);
		}
		System.out.println("program exited");
	}
}