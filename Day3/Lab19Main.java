package Day3;

public class Lab19Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab19_SavingAccount2 sav1 = new Lab19_SavingAccount2("Anagha", 7000);
		Lab19_CurrentAccount2 cur1 = new Lab19_CurrentAccount2("Rupali", 5000);
		
		sav1.display();
		cur1.display();
		
		sav1.withdraw(2000);
		cur1.withdraw(1000);
	}

}

