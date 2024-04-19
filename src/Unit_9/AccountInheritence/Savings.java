package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class Savings extends Bank {
	private double interest;

	public Savings() {
		super();
		interest = 0;
	}

	public Savings(double b, String n, double i) {
		super(b, n);
		interest = i;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double i) {
		this.interest = interest;
	}

	public int amountInAccount(double st) {
		return (int) Math.ceil((Math.log(st / getBalance())) / (12 * (Math.log(1 + (getInterest() / 12)))));
	}

	public void withdrawl(int w) {
		if (getBalance() - w < 0) {
			System.out.println("Withdrawl amount too high balance would be negative.");
		}
		setBalance(getBalance() - w);
	}

	public String toString() {
		return super.toString() + "\nInterest: " + interest + "\n Savings balance: " + getBalance();
	}

}
