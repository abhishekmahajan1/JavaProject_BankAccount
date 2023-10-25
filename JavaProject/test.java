package tester;

import com.javaproject.bankaccount.BankAccount;
import com.javaproject.bankaccount.currentAccount;
import com.javaproject.bankaccount.savingAccount;

public class test {
	public static void main(String[]args) {
	
		//BankAccount with minBal
		/*
		BankAccount A1 = new BankAccount(200);
		BankAccount A2 = new BankAccount(500);
		//Withdraw from A1
		A1.Withdraw(100);
		//Deposit in A2
		A2.Deposit(1000);
		A2.transfer(200, A1);
		System.out.println("Bank Account A1 : " + A1);
		A1.checkBalance();
		System.out.println("Bank Account A2 : " + A2);
		A2.checkBalance();
		*/
		
		
		
		//Saving Account Functioning
		
		savingAccount savAccount = new savingAccount(1000);
		/*savAccount.Deposit(500);
		savAccount.Interest(200);
		System.out.println("The Saving Account update is : " + savAccount);
		savAccount.checkBalance();
		*/
		
		
		
		
		
		//Current Account Functioning
		
		currentAccount currAccount = new currentAccount(2000);
		/*currAccount.Withdraw(500);
		System.out.println("The current Account update is : " + currAccount);
		currAccount.checkBalance();*/
		
		
		
		
		//Transfer From Current Account to Saving Account
		
		currAccount.transfer(500, savAccount);
		System.out.println("The current Account update is : " + currAccount);
		currAccount.checkBalance();
		System.out.println("the Saving Account update is : " + savAccount);
		savAccount.checkBalance();
		
		
		
		
	}

}
