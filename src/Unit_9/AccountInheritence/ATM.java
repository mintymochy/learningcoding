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
		System.out.print("Enter your account balance: ");
		double tbal = u.nextDouble();
		Account a = new Account(tbal);
		Bank b = new Bank(name);
		System.out.print("Enter your APR as a decimal(0.XX): ");
		double apr = u.nextDouble();
		System.out.print("Enter your credit card balance: ");
		double cbal = u.nextDouble();
		Credit c = new Credit(apr, cbal);
		System.out.print("What is your overdraft fee?: ");
		double over = u.nextDouble();
		Checking ch = new Checking(over);
		System.out.print("Enter your savings account balance: ");
		double sbal = u.nextDouble();
		System.out.print("What is your interest rate?: ");
		double i = u.nextDouble();
		Savings s = new Savings(i, sbal);
	}

	public static void mainMenu() {
		System.out.println("1. ");
	}
}
