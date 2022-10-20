package com.controller;

import java.util.Scanner;

class BankDetails {
	private String accno;
	private String name;
	private long balance;
	Scanner sc = new Scanner(System.in);

	public void openAcc() 	{
		System.out.println("Enter your no:");
		accno = sc.next();
		System.out.println("Enter your Name");
		name = sc.next();
		System.out.println("Enter your Balance");
		balance = sc.nextLong();
	}

	// Display
	public void displayAcc() {
		System.out.println("Name :" + name);
		System.out.println("Account No:" + accno);
		System.out.println("Balance :" + balance);

	}

	public void deposit() {
		long amt;
		System.out.println("Enter amount you want to deposit:");
		amt = sc.nextLong();
		balance = balance + amt;
	}

	public void widthdraw() {
		// by your own
	}

	// seaching
	public boolean search(String ac_no) {
		if (accno.equals(ac_no)) {
			displayAcc();
			return (true);
		}
		return (false);
	}
}

public class BankApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many customers do you want to insert");
		int n = sc.nextInt();
		BankDetails c[] = new BankDetails[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = new BankDetails();
			c[i].openAcc();
		}
		int ch;
		boolean found;
		do {
			System.out.println("Bank Application");
			System.out.println("1.....Display Acc Details \n");
			System.out.println("2.....Deposit Amount");
			System.out.println("3.....Search Acc");
			System.out.println("4.....Exit");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (int i = 0; i < c.length; i++) {
					c[i].displayAcc();
				}
				break;
			case 2:
				System.out.println("Enter Acc no in which you want to deposit");
				String ac_no = sc.next();
				found = false;
				for (int i = 0; i < c.length; i++) {
					found = c[i].search(ac_no);
					if (found) {
						c[i].deposit();
						break;
					}

				}
				if (!found) {
					System.out.println("Search failed!Acc doesn't Exist..!");
				}
				break;
			case 3:
				System.out.println("Searching ");
				System.out.println("Enter acc no:");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < c.length; i++) {
					found = c[i].search(ac_no);
					if (found) {
						c[i].deposit();
						break;
					}

				}
				if (!found) {
					System.out.println("Search Failed!Acc doesn't Exist");
				}
				break;
			case 4:
				System.out.println("Bye Bye");
				break;
			}
		} while (ch != 5);
	}

}
/*
 * 1.All Account Display 2.Deposit 3.Withdraw 4.Exit 5.Search Account By Number
 */
