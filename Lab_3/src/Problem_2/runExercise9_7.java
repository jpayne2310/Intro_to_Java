package Problem_2;

public class runExercise9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122, 20000);
		
		account.setAnnualInterestRate(4.5);
		
		account.withdraw(2500);
		
		account.deposit(3000);
		
		System.out.printf("Balance is $%.2f", account.getBalance());
		System.out.println(" ");
		
		System.out.printf("Monthly interest is $%.2f", account.getMonthlyInterest());
		System.out.println(" ");		
		
		System.out.print("This account was created at " +
				account.getDateCreated());
	}

}