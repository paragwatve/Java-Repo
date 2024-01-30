package JAN_Pac;

import java.util.Arrays;

public class TC015_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Declaration
		int arr[];
		arr=new int[2];
		arr[0]=4;
		arr[1]=5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr.length);
		
		int arr1[]= {500,300,200,100,400};
		Arrays.sort(arr1);
		for(int i:arr1)
		{
			System.out.println("foreach"+i);
		}
		int arr12[]= {100,200,300,400,500};
		for(int i=0;i<arr12.length;i++)
		{
			System.out.println("forloop"+arr12[i]);
		}
		System.out.println(arr1.length);
		System.out.println(arr[0]);
		
		String twodim[][]= new String[2][2];
		System.out.println("Two dim length:"+twodim.length);
		twodim[0][0]="Apple";
		twodim[0][1]="Apple1";
		twodim[1][0]="Apple2";
		twodim[1][1]="Apple3";
		System.out.println(twodim[0][1]);
	}

}
