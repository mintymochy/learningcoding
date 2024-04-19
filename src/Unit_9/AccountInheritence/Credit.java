package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class Credit extends Account {
	private double apr;

	public Credit() {
		super();
		this.apr = apr;
	}

	public Credit(double b, double apr) {
		super(b);
		this.apr = apr;
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
