package Unit_9.AccountInheritence;

import java.util.*;

/*
 04-18-2024
 augustjones
 :3
 */
public class ATM {
	static Scanner u = new Scanner(System.in);

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
		Checking ch = new Checking(tbal, name, f);
		Credit c = new Credit(cbal, apr);
		Savings s = new Savings(sbal, name, i);
	}

	public static void mainMenu() {
		System.out.println("Welcome to the bank!");
		System.out.println("1. Credit Card");
		System.out.println("2. Checking");
		System.out.println("3. Savings");
		System.out.println("4. Quit");
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

	}

	public static void Checking() {

	}

	public static void Savings() {

	}
}
