package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class Bank extends Account {
	private String name;
	Scanner uI = new Scanner(System.in);

	public Bank() {
		super();
		name = "unknown";
	}

	public Bank(double b, String n) {
		super(b);
		name = n;
	}

	public void setName(String n) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void deposit() {
		System.out.println("How much do you want to deposit?: ");
		double x = uI.nextDouble();
		double bal = getBalance();
		setBalance(x + bal);
	}

	public void withdrawl() {
		System.out.println("How much do you want to withdrawl?: ");
		double x = uI.nextDouble();
		double bal = getBalance();
		setBalance(x - bal);
	}

	public String toString() {
		return super.toString() + "\nName: " + name + "\n";
	}
}
