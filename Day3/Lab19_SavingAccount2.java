package Day3;

public class Lab19_SavingAccount2 extends Lab19_Account2 {

final double minbalance;
	
	
	public Lab19_SavingAccount2(String accholder, double initialval) {
		super(accholder, initialval);
		this.minbalance = 2000;
	}

	@Override
	public void withdraw(double withdraw) {
		if(balance>=minbalance) {
			balance-=withdraw;
			System.out.println("Your balance is : "+ balance);
		}else
			System.out.println("Minimum Balance insufficient");
	}
}
