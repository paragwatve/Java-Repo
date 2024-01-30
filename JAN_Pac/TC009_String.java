package JAN_Pac;

public class TC009_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("Pooja");
		String str2 = new String("Sam");
		System.out.println("String1:"+str1+"________String2:"+str2);
		String str3= new String("Pooja");
		String str4=str3;
		System.out.println("String1:"+str3+"______String2:"+str4);

		System.out.println("length:"+str1.length());
		System.out.println("indexof:"+str1.indexOf("j"));
		String s1="This is beautiful day                ";
		System.out.println(s1.trim().concat("hello"));
		System.out.println(s1.substring(8,17));
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.equals(s1));
		System.out.println(str1==s1);
		
		StringBuffer s2 = new StringBuffer("Welcome");
		System.out.println(s2.append("to 2024"));
	}

}
