package JAN_Pac;

public class Lab16_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab16_Account smith = new Lab16_Account("smith",2000);
		Lab16_Account kathy = new Lab16_Account("kathy",3000);
		smith.deposit(2000);
		kathy.withdraw(3000);
		smith.displaybalance();
		kathy.displaybalance();

	}

}
