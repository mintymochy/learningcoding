package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class Checking extends Bank {
	private double fee;

	public Checking() {
		super();
		fee = 10.0;
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
}
