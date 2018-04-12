import static org.junit.Assert.*;

import org.junit.Test;

public class test_book {

	@Test
	public void test_setup() 
	{
		Book book = new Book("1234", "sinith", "black magic", "saint paul");
		assertEquals("sinith", book.getAuthor());
		assertEquals("black magic", book.getTitle());
		assertEquals("1234", book.getIsbn());
	}
	
	@Test
	public void test_set_function()
	{
		Book book = new Book("1234", "sinith", "black magic", "saint paul");
		book.makeBorrowed();
		book.setAuthor("james");
		book.setIsbn("234");
		book.setTitle("magic");
		assertEquals("james", book.getAuthor());
		assertEquals("magic", book.getTitle());
		assertEquals("234", book.getIsbn());
		book.toString();
	}
	
	@Test
	public void test_lateFee()
	{
		Book book = new Book("1234", "sinith", "black magic", "saint paul");
		assertEquals(7.5, book.lateFee(10), 0.01);
	}

}
