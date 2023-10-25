package com.javaproject.bankaccount;

public class savingAccount extends BankAccount {
	public savingAccount(double minBal) {
	super(minBal);
	}
	
public void Interest(double Amount) {
	double interest = Amount*0.03;
	Deposit( interest);
	System.out.println("The Interest on the deposit is :" + interest);
	

}
}