package Unit_9.AccountInheritence;

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

	public Savings(double b, String n, double interest) {
		super(b, n);
		this.interest = interest;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int monthsTillGoal(double st) {
		return (int) Math.ceil((Math.log(st / getBalance())) / (12 * (Math.log(1 + (getInterest() / 12)))));
	}

	public void withdrawal(int w) {
		super.withdrawal();
		if (getBalance() - w < 0) {
			System.out.println("Withdrawal amount too high balance would be negative.");
		}
		setBalance(getBalance() - w);
		System.out.println("Transaction completed.");
	}

	public String toString() {
		return super.toString() + "\nInterest: " + interest + "\nSavings balance: " + getBalance();
	}

}
