import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test_teacher {
	
	private Teacher teacher;
	
	@Before
	public void test_setup() {
		teacher = new Teacher("Eric", "Level", "123");
	}
	
	@Test
	public void test_getFirstname() {
		assertEquals("Eric", teacher.getFName());
	}
	
	@Test
	public void test_getLastName() {
		assertEquals("Level", teacher.getLName());
	}
	
	@Test
	public void tes_AllBorrow()
	{
		assertTrue(teacher.allowBorrow(5, 7));
	}

}
