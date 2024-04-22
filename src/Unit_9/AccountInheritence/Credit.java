package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class Credit extends Account {
	private double apr;
	Scanner u = new Scanner(System.in);

	public Credit() {
		super();
		apr = 0;
	}

	public Credit(double b, double apr) {
		super(b);
		this.apr = apr;
	}

	public void setapr(double apr) {
		this.apr = apr;
	}

	public double getapr() {
		return apr;
	}

	public void makePurchase() {
		System.out.println("How much is your purchase?: ");
		double c = u.nextDouble();
		setBalance(getBalance() + c);
		System.out.println("Transaction Completed.");
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

	public String toString() {
		return super.toString() + "\nAPR: " + apr;
	}
}
