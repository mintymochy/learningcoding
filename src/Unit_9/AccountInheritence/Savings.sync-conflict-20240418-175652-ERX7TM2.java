package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class Savings extends Bank {
	private double interest;
	private double bal;

	public Savings() {
		super();
		interest = 0;
		bal = 0;
	}

	public Savings(double i, double b) {
		super();
		interest = i;
		bal = b;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double i) {
		this.interest = interest;
	}

	public void setBal(double b) {
		this.bal = bal;
	}

	public double getBal() {
		return bal;
	}

	public int amountInAccount(double st) {
		return (int) Math.ceil((Math.log(st / getBalance())) / (12 * (Math.log(1 + (getInterest() / 12)))));
	}

	public void withdrawl(int w) {
		if (getBal() - w < 0) {
			System.out.println("Withdrawl amount too high balance would be negative.");
		}
		setBal(getBalance() - w);
	}

	public String toString() {
		return super.toString() + "\nInterest: " + interest + "\n Savings balance: " + bal;
	}

}
