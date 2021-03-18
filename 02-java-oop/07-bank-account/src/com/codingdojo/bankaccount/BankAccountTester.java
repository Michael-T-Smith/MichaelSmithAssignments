package com.codingdojo.bankaccount;

public class BankAccountTester {
	public static void main(String[] args) {
		BankAccount michael = new BankAccount();
		BankAccount tyler = new BankAccount();
		tyler.depositMoneyToChecking(300);
		System.out.println(michael.getCheckingBalance());
		michael.depositMoneyToChecking(200);
		System.out.println(michael.getCheckingBalance());
		michael.withdrawMoneyFromChecking(400);
		System.out.println(michael.getCheckingBalance());
		System.out.println(michael.totalMoney());
		michael.depositMoneyToSavings(6000);
		System.out.println(michael.totalMoney());
		System.out.println("Number of active accounts is: " + BankAccount.numberOfAccounts);
	}
}
