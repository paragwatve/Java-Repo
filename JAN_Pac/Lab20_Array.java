package JAN_Pac;

import java.util.Arrays;

public class Lab20_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Products[]= {"Pen","pencil","book","scale"};
		System.out.println("String before sorting");
		
		for(String s:Products)
		{
			System.out.println(s);
		}
		System.out.println("String after sorting");
		Arrays.sort(Products);
		for(String s:Products)
		{
			System.out.println(s);
		}
		
		

	}

}
