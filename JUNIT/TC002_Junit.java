package JUNIT;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC002_Junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is after");
	}

	@Test
	public void test() {
		System.out.println("This is the test");
	}

}
