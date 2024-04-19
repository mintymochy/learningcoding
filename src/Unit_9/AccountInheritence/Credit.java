package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class Credit extends Account {
	private double apr;
	private double cbal;

	public Credit(double apr, double cbal) {
		super();
		this.apr = apr;
		this.cbal = cbal;
	}

	public Credit(double b, double apr, double cbal) {
		super(b);
		this.apr = apr;
		this.cbal = cbal;
	}

	public void setCBal() {
		this.cbal = cbal;
	}

	public void makePurchase(double c) {
		setBalance(getBalance() + c);
	}

	public void monthlyStatement() {
		System.out.println();
		System.out.println("Balance if paid on time: $" + getBalance());
		System.out.println("Balance if not paid on time: $" + getBalance() * (apr / 12));

	}

	public double monthsToPayOff(double m) {
		double r = apr / 12;
		return Math.ceil(getBalance() * ((r * (Math.pow((1 + r), m))) / ((Math.pow((1 + r), m) - 1))));
	}
}
