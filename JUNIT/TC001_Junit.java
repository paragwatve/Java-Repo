package JUNIT;

import org.junit.Test;

public class TC001_Junit {
	private String firstname;
	private String lastname;
	
	public TC001_Junit(String fname,String lname)
	{
		if (fname==null && lname==null)
		{
			throw new IllegalArgumentException("Both names cannot be null");
		}
		this.firstname=fname;
		this.lastname=lname;
	}
	public String getfullname()
	{
		String first=(this.firstname !=null)?this.firstname:"?";
		String last=(this.lastname !=null)?this.lastname:"?";
		return first +" "+last;
	}
	public String getfirstname()
	{
		return this.firstname;
	}
	public String getlastname()
	{
		return this.lastname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TC001_Junit j = new TC001_Junit("Parag","Watve");
		System.out.println(j.getfirstname());
		System.out.println(j.getlastname());
		System.out.println(j.getfullname());

	}

}
