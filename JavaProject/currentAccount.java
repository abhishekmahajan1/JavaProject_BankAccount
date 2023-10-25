package com.javaproject.bankaccount;

public class currentAccount extends BankAccount {
	public currentAccount(double minBal) {
		super(minBal);

}
	public void Withdraw(double Amount) {
		if(Amount > 0 && Amount <= balance) {
			
		//Withdraw charges deduction from current Account
		if(Amount >= 200) {
			Amount = Amount + 200;
		}
		super.Withdraw(Amount);
	    }
		else {
			System.out.println("The Amount Trying to Withdraw is Invalid Amount");
		}
	
	}
	
	
}