package javaassignmet;
import java.util.Scanner;
 class SavingsAccount {
	static double annualInterestRate;
	private double savingsBalance;
	private double interest;

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;

	}

	public SavingsAccount() {

		savingsBalance = 0.0;

	}
	public void calculateMonthlyInterest()
	{
		interest = (savingsBalance*annualInterestRate)/12;
		savingsBalance = interest + savingsBalance;
	}
	public static void setAnnualInterestRate(double annualInterestRate)
	{
		SavingsAccount.annualInterestRate=annualInterestRate/100;
	}
	

	@Override
	public String toString() {
		return "SavingsAccount [savingsBalance=" + savingsBalance + ", interest=" + interest + "]";
	}
 }
public class TestAccount {
	public static void main(String[] args) {
		 SavingsAccount sa = new  SavingsAccount(20000);
		 SavingsAccount.setAnnualInterestRate(3);
		 sa.calculateMonthlyInterest();
		 System.out.println(sa);
		 SavingsAccount.setAnnualInterestRate(4);
		 sa.calculateMonthlyInterest();
		 System.out.println(sa);

	}
}


