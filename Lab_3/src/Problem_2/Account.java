package Problem_2;

import java.util.*;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = new Date();
	}

	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();

	}

	// mutators for id, balance, and annualInterestRate
	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	// normal gets and sets
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	// deposit method
	public void deposit(double amount) {
		balance += amount;
	}

	// withdraw method
	public void withdraw(double amount) {
		balance -= amount;
	}

	// figure out monthly interest
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
}