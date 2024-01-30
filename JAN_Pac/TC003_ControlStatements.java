package JAN_Pac;

public class TC003_ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=-1;
		while(n>0) {
			System.out.println("The value of n is:"+n);
			n--;
		}
		do 
		{
		System.out.println("The value of m is:"+m);
		m--;
		}
		while(m>0);

		
		for(int i=0;i<=4;i++) {
			switch(i) {
			case 0:
			System.out.println("i value is zero");
			break;
			case 1:
			System.out.println("i value is one");
			break;
			case 2:
			System.out.println("i value is two");
			break;
			case 3:
			System.out.println("i value is three");
			break;
			default:
				System.out.println("i value is greater than 3");
				
			}
		}

	}

}
