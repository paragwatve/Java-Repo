package JUNIT;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Lab1_1date {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Lab1_Date d1 = new Lab1_Date(15,9,2015);
		System.out.println(d1.toString());
		assertEquals("Date [Day=15, Month=9, Year=2015]",d1.toString());
	}

}
