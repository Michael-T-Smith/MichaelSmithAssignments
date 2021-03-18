package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts = 0;
	public static int totalOfMoney = 0;

	Random r = new Random();

	// Generate random positive 10 digit account number.
	private String ranAccountNum() {
		int n = 10;
		int startNum = (int) Math.pow(10, n - 1);
		int range = (int) (Math.pow(10, n) - startNum + 1);
		int randomNum = r.nextInt(range) + startNum;

		if (randomNum < 0) {
			ranAccountNum();
		} else {
			return this.accountNumber = Integer.toString(randomNum);
		}
		return ranAccountNum();
	}

	// Getters and Setters

	public double getCheckingBalance() {
		return this.checkingBalance;
	}

	public double getSavingsBalance() {
		return this.savingsBalance;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	// Constructor
	public BankAccount() {
		ranAccountNum();
		numberOfAccounts++;
	}

	// Methods
	public void depositMoneyToSavings(double savingsBalance) {
		this.savingsBalance += savingsBalance;
		totalOfMoney += savingsBalance;
	}

	public void depositMoneyToChecking(double checkingBalance) {
		this.checkingBalance += checkingBalance;
		totalOfMoney += checkingBalance;
	}

	public void withdrawMoneyFromSavings(double savingBalance) {
		if (this.savingsBalance - savingBalance <= 0) {
			System.out.println("You have insufficient funds");
			return;
		}
		this.savingsBalance -= savingsBalance;
		totalOfMoney -= savingsBalance;
	}

	public void withdrawMoneyFromChecking(double checkingBalance) {
		if (this.checkingBalance - checkingBalance <= 0) {
			System.out.println("You have insufficient funds");
			return;
		}
		this.checkingBalance -= checkingBalance;
		totalOfMoney -= checkingBalance;
	}

	public int totalMoney() {
		return totalOfMoney;
	}
}
