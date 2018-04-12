import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test_fine {
	
	private Fine penalty;
	
	@Before
	public void test_setup() throws Exception
	{
		penalty = new Fine(10, true);
	}
	
	@Test
	public void test_result()
	{
		double amount = penalty.getAmount();
		assertEquals(10, amount,0.01);
		assertTrue(penalty.getStatus());
	}

}
