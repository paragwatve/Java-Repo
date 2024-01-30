package JAN_Pac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC016_Regularexpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Welcome";
		String pattern = "Welcome";
		boolean patternmatch=Pattern.matches(str1 ,pattern);
		System.out.println("Matching"+patternmatch);
		
	    String input="Shop,Mop,Hopping,Chopping";
	    Pattern p1 = Pattern.compile("hop");
	    Matcher m1 = p1.matcher(input);
	    System.out.println(m1.matches());
	    while(m1.find())
	    {
	    	System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
	    }
	    String n1="0123456789";
	    String email ="abc@gmail.com";
	    String aadharcard ="1234 1234 1234";
	    
	    String s1 = "Welcome to Amazon 12345";
	    Pattern p4 = Pattern.compile("^(.+)@(\\S+).com");
	    Pattern p2 = Pattern.compile("^[A-Z].*[0-9]$");
	    Pattern p3 = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
	    Pattern p5 = Pattern.compile("^.*[0-12]");
	    		
	    Matcher m2 = p2.matcher(s1);
	    Matcher m3 = p3.matcher(n1);
	    Matcher email_m4 = p4.matcher(email);
	    Matcher aadharcard_m5 =p5.matcher(aadharcard);
	    
	    if(m2.find()) 
	    {
	    	System.out.println("Pattern Matched");
	    }
	    else
	    {
	    	System.out.println("Pattern not Matched");
	    }
	    if(m3.find()) 
	    {
	    	System.out.println("Phone number Pattern Matched");
	    }
	    else
	    {
	    	System.out.println("Phone number Pattern not Matched");
	    }
	    if(email_m4.find()) 
	    {
	    	System.out.println("Email Pattern Matched");
	    }
	    else
	    {
	    	System.out.println("Email Pattern not Matched");
	    }
	    if(aadharcard_m5.find()) 
	    {
	    	System.out.println("aadharcard Pattern Matched");
	    }
	    else
	    {
	    	System.out.println("aadharcard Pattern not Matched");
	    }
	}

}
