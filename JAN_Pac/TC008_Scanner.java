package JAN_Pac;

import java.util.Scanner;

public class TC008_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc1 = new Scanner("1 2 3 4 5 6 7 8 9");
         while(sc1.hasNextInt()) 
         {
        	int num=sc1.nextInt();
        	if(num%2==0)
        	{
        		System.out.println(num);
        	}
        	else
        	{
        		System.out.println("This is odd number"+num);
        	}
         
        	
         }
         
	}
}	
