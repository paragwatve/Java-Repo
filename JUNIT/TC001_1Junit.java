package JUNIT;

import org.junit.Test;

public class TC001_1Junit {
	@Test
	public void test1()
	{
		TC001_Junit j = new TC001_Junit("Parag","Watve");
		System.out.println(j.getfirstname());
		System.out.println(j.getlastname());
		System.out.println(j.getfullname());

	}

}
