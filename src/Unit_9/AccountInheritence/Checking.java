package Unit_9.AccountInheritence;

/*
 04-18-2024
 augustjones
 :3
 */
public class Checking extends Bank {
	private double fee;

	public Checking() {
		super();
		fee = 0;
	}

	public Checking(double b, String n, double fee) {
		super(b, n);
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void withdrawl() {
		super.withdrawl();
		if (getBalance() > 0) {
			setBalance(getBalance() - fee);
		}
	}

	public String toString() {
		return super.toString() + "\nFee: " + fee;
	}
}
