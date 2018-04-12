import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test_student {

	private Student theStudent;
	
	@Before
	public void test_setup() throws Exception
	{
		theStudent = new Student("Robert", "Roy", "12345");
	}
	
	@Test
	public void test_first_name() {
		
		assertEquals("Robert", theStudent.getFName());
		theStudent.setName("John");
		assertEquals("John", theStudent.getFName());
	}
	
	@Test
	public void test_student_id() {
		
		assertEquals("12345", theStudent.getId());
		theStudent.setId("67890");
		assertEquals("67890", theStudent.getId());
	}
	
	@Test
	public void test_fine() {
		Fine testFine = new Fine(10.0, true);
		Fine testGetFine = theStudent.getFine();
				
		assertTrue(testGetFine == null);

		theStudent.setFine(testFine);
		testGetFine = theStudent.getFine();
		assertTrue(testGetFine != null);
		assertTrue(10.0 == testGetFine.getAmount());
	}
	
	@Test
	public void test_hold() {
		Hold testHold = new Hold();
		Hold testGetHold = theStudent.getHold();
				
		assertTrue(testGetHold == null);

		testHold.setNumberOfHolds(1);
		
		theStudent.setHold(testHold);
		
		testGetHold = theStudent.getHold();
		assertTrue(testGetHold != null);
		assertTrue(1 == testGetHold.getNumberOfHolds());
	}
		

}
