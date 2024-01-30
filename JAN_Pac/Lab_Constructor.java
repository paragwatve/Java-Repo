package JAN_Pac;

import java.util.Scanner;

public class Lab_Constructor {
	String first_name;
	String Last_name;
	String Gender;
	
	Lab_Constructor(String first_name,String Last_name,String Gender)
	{
		this.first_name=first_name;
		this.Last_name=Last_name;
		this.Gender=Gender;
	}
	public void showData()
	{
		System.out.println("first_name is:"+first_name);
		System.out.println("Last_name is:"+Last_name);
		System.out.println("Gender is:"+Gender);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Phone number:"+n);
		
	}
	 

}
