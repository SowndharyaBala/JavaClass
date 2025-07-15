package com.nestedclass;

public class Static_Inner {

	public static void main(String[] args) {
		Bank.Account acc = new Bank.Account();
		acc.displayBalance();
	}

}

class Bank{
	static int balance = 5000;
	static class Account{
		void displayBalance() {
			System.out.println("Balance : Rs. " + balance );
		}
	}
}
