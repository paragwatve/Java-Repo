package JAN_Pac;

import java.util.UUID;

public class Lab16_Account {

	private String accountno;
	private double balance;
	private String accholderperson;
	private String person;
	
	public Lab16_Account(String accholdername,double initialbal) 
	{
		this.accountno=UUID.randomUUID().toString();
		this.balance=initialbal;
	}
	public void deposit(double amount) 
	{
		balance+=amount;
		System.out.println(amount+"is deposited to your accountnumber"+accountno);
	}
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance=amount;
			System.out.println(amount+"is withdrawn from your accountnumber"+accountno);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	
	}	
		
	public void displaybalance()
	 {
		System.out.println("accountno:"+accountno); 
		System.out.println("accholderperson:"+person);
		System.out.println("balance"+balance);
	 }
}
