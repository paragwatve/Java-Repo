package JAN_Pac;

public class TC015_Interface {
	
 interface simplecalc
{
	int add(int a, int b);
}
class calc implements simplecalc
{
	public int add (int a,int b)
	{
		return a+b;
	}
	
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		calc calc = new calc();
		calc.add(10,10);

	}
 }

