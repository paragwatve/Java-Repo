package JAN_Pac;

public class Multicatch_blocks {

	public static void main(String[] args) 
	{
	 try {
		 int a = args.length;
		 System.out.println("a="+a);
		 int b=42/a;
		 int c[]= {1};c[42]=99;
	 }
	 catch(ArithmeticException e)
	 {
		System.out.println("Divide by 0"+e); 
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("Array index oob:"+e);
	 }
	 catch(Exception e)
	 {
		 System.out.println("Generic Exception"+e);
	 }
	 System.out.println("After try/catch blocks");
	  
	}
}
