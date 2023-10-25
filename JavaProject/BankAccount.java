package com.javaproject.bankaccount;

public class BankAccount {
	protected double balance;
	
	public BankAccount(double minBal ) {
		this.balance = minBal;
		System.out.println(" Account Opened with Minimum Balance : " + minBal);
}
	public void Deposit(double Amount){
		if(Amount > 0) {
			balance = balance + Amount;
			System.out.println("The Amount Deposited in account is : " + Amount);
			
		}else {
			System.out.println("The Amount Trying to Deposit is Invalid Amount");
		}
		
	}
	
	public void Withdraw(double Amount) {
		if(Amount > 0 && Amount <= balance) {
			balance = balance - Amount;
			System.out.println("The Amount Withdrawed is : " + Amount);
		}else {
			System.out.println("The Amount Trying to Withdraw is Invalid Amount");
		}
	}
	public void checkBalance() {
		System.out.println(" The Available Balance is : " + balance);
	}
	public void transfer(double Amount ,BankAccount sendAcc) {
		if(Amount > 0 && Amount <= balance) {
		this.Withdraw(Amount);
		sendAcc.Deposit(Amount);
		System.out.println(" Amount send is : " + Amount);
	}else {
		System.out.println("Invalid Amount to send ");
	}
	}
	}
	
