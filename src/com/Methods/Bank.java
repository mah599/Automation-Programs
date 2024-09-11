package com.Methods;

public class Bank {
	
	 int currentBalance=5000;
	public static void greetCustemer() {
		System.out.println("welcome to the our banking services");
	}
	
	public void deposit(int amount) {
		currentBalance=currentBalance+amount;
		System.out.println("amount has been deposited");
	}
	public void withdrawal(int amount) {
		currentBalance=currentBalance-amount;
		System.out.println("amount withdraw sucessfully");
	}
	public int getcurrentbalance() {
		return currentBalance;
	}
		public static void main (String[]args) {
			Bank bank=new Bank();
			greetCustemer();
			System.out.println("currentbalance:"+bank.getcurrentbalance());
			bank.deposit (7000);
			System.out.println("currentbalance:"+bank.getcurrentbalance());
			bank.withdrawal(80000);
			System.out.println("currentbalance:"+bank.getcurrentbalance());
			
			
			
		}
	}


