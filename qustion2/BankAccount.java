package qustion2;

import java.util.Scanner;


public class BankAccount {
int accno;
double balance;
public BankAccount(int accno, double balance) {
	super();
	this.accno = accno;
	this.balance = balance;
}

public void withdraw() throws Exception
{
	System.out.println("Enter the amount you want to withdraw: ");
	try (Scanner sc = new Scanner(System.in)) {
		int amt=sc.nextInt();
		try
		{
		if(this.balance - amt >0)
		{
			this.balance=this.balance - amt;
			System.out.println(amt+" amount withdrawed succesfully! ");
			System.out.println("balance in your account is "+this.balance);
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
	
public void show()
{
	System.out.println("Welcome to our bank! ");
	System.out.println(" Your account no is " +this.accno);
	System.out.println(" balance of your account is "+this.balance);
	
}
public static void main (String args[]) throws Exception
{
	BankAccount B1 = new BankAccount(123,25478);
	B1.withdraw();
	B1.show();
}
}
