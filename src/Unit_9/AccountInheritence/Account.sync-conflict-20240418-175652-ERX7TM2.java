package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class Account {
	private double balance;
	private int accountId;

	public Account(double b) {
		Random r = new Random();
		accountId = r.nextInt(99999) + 1;
		balance = b;
	}

	public Account() {
		Random r = new Random();
		accountId = r.nextInt(99999) + 1;
		balance = 0;
	}

	public int getAccountId() {
		return accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "\nAccount ID: " + accountId + "\nBalance: $" + balance;
	}

}
