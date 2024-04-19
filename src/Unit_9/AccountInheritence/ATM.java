package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class ATM {
	static Scanner u = new Scanner(System.in);
	static Checking ch;
	static Credit c;
	static Savings s;

	public static void main(String[] args) {
		System.out.println(
				"Welcome! Today you will be setting up a credit card account, checking account, and a savings account.");
		System.out.print("Enter your name!: ");
		String name = u.next();
		System.out.print("Enter your checking account balance: ");
		double tbal = u.nextDouble();
		System.out.print("Enter your APR as a decimal(0.XX): ");
		double apr = u.nextDouble();
		System.out.print("Enter your credit card balance: ");
		double cbal = u.nextDouble();
		System.out.print("What is your overdraft fee?: ");
		double f = u.nextDouble();
		System.out.print("Enter your savings account balance: ");
		double sbal = u.nextDouble();
		System.out.print("What is your interest rate?: ");
		double i = u.nextDouble();
		ch.setBalance(tbal);
		ch.setName(name);
		ch.setFee(f);
		c.setBalance(cbal);
		c.setapr(apr);
		s.setBalance(sbal);
		s.setInterest(i);
		s.setName(name);
	}

	public static void mainMenu() {
		System.out.println();
		System.out.println("Welcome to the bank!"
				+ "\n1. Credit Card"
				+ "\n2. Checking"
				+ "\n3. Savings"
				+ "\n4. Quit");
		int user = u.nextInt();
		if (user == 1) {
			Credit();
		} else if (user == 2) {
			Checking();
		} else if (user == 3) {
			Savings();
		} else if (user == 4) {
			System.out.println("Thank you for visiting the bank!\nHave a good day!");
		}

	}

	public static void Credit() {
		System.out.println("1. Check Balance"
				+ "2. Make Purchase"
				+ "3. Display Monthly Statement"
				+ "4. Create Monthly Payments"
				+ "5. Back to Main Menu");
		int user = u.nextInt();
		boolean b;
		if (user == 5) {
			b = false;
		} else {
			b = true;
		}
		if (b == true) {
			while (true) {
				if (user == 1) {
					c.toString();
				} else if (user == 2) {
					c.makePurchase();
				} else if (user == 3) {
					c.monthlyStatement();
				} else if (user == 4) {
					System.out.println("How many months would you like to pay off your balance by?: ");
					c.monthsToPayOff(u.nextInt());
				} else if (user == 5) {
					mainMenu();
					break;
				} else {
					System.out.println("Error Enter a value 1-5.");
				}
			}
		}
	}

	public static void Checking() {
		System.out.println("1. Check Balance"
				+ "2. Withdraw"
				+ "3. Deposit"
				+ "4. Back to Main Menu");
		int user = u.nextInt();
		boolean b;
		if (user == 4) {
			b = false;
		} else {
			b = true;
		}
		if (b == true) {
			while (true) {
				if (user == 1) {
					ch.toString();
				} else if (user == 2) {
					ch.withdrawl();
				} else if (user == 3) {
					ch.deposit();
				} else if (user == 4) {
					mainMenu();
					break;
				} else {
					System.out.println("Error Enter a value 1-5.");
				}
			}
		}
	}

	public static void Savings() {
		System.out.println("1. Check Balance"
				+ "2. Withdrawl"
				+ "3. Deposit"
				+ "4. Display Months till goal"
				+ "5. Back to Main Menu");
		int user = u.nextInt();
		boolean b;
		if (user == 5) {
			b = false;
		} else {
			b = true;
		}
		if (b == true) {
			while (true) {
				if (user == 1) {
					s.toString();
				} else if (user == 2) {
					s.withdrawl();
				} else if (user == 3) {
					s.deposit();
				} else if (user == 4) {
					System.out.println("How much money would you like your goal to be?: ");
					double temp = u.nextDouble();
					System.out.println(
							"It will take you " + s.monthsTillGoal(temp) + " Months to get to your goal of $" + temp);
				} else if (user == 5) {
					mainMenu();
					break;
				} else {
					System.out.println("Error Enter a value 1-5.");
				}
			}
		}
	}
}
