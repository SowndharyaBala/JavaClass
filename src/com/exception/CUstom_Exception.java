package com.exception;

class FundException extends RuntimeException{
	public FundException (String message) {
		super(message);
	}
}

class BankAccount{
	private String accHolder;
	private double balance;
	
	public BankAccount(String acc, double bal) {
		this.accHolder = acc;
		this.balance = bal;
	}
	
	public void withdraw(double amount) throws FundException{
		
		if(amount > balance) {
			throw new FundException("INsuffiecient balance");
		}
		balance -= amount;
		System.out.println("withdraw successful : New balanace : " + balance);
	}
}

public class CUstom_Exception {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Sow", 8900.00d);
		
		try {
			System.out.println("Attempting to withdraw 10000 ");
			acc.withdraw(10000);
		}catch(FundException e) {
			System.out.println(e.getMessage());
		}

	}

}
