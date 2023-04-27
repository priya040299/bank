package org.bank; //over  ride qn no 6

public class AxisBank extends BankInfo{
	
	public void deposit() 
	{
		System.out.println("amount deposit in private bank");
		super.deposit();
		System.out.println("hello");
		System.out.println("hello");

		
	}
public static void main(String[] args) {
			AxisBank a = new AxisBank();
			a.saving();
			a.fixed();
			a.deposit();
			BankInfo b = new BankInfo();
			b.deposit();
			b.fixed();
			b.saving();
		}}
