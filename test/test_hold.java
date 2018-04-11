import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test_hold {
	
	private Hold hold;
	private Student student = new Student("Sinith", "Leng", "123");
	
	@Before
	public void setUp() 
	{
		hold = new Hold();
	}
	
	@Test
	public void test_set_and_get_number_of_holds()
	{
		hold.setNumberOfHolds(10);
		assertEquals(10, hold.getNumberOfHolds());
	}
	
	@Test
	public void test_set_and_get_hold_student()
	{
		hold.setStudent(student);
		assertEquals("Sinith", hold.getStudent().getFName());
		assertEquals("123", hold.getStudent().getId());
	}
}
