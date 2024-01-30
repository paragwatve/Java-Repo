package JAN_Pac;

import java.util.Scanner;

public class Positiveandnegativenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is positive");
		}

	}

}
