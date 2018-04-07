package unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.books;

public class books_test {

	@Test
	public void test_create()
	{
		books book1 = new books();
	}
	
	@Test
	public void test_add_bookID()
	{
		books book1 = new books();
		book1.setBookID(123);
		assertEquals(123, book1.getBookID());
	}
	
	@Test
	public void test_add_bookDescription()
	{
		books book1 = new books();
		book1.setDescription("This is a test");
		assertEquals("This is a test", book1.getDescription());
	}
	
	@Test
	public void test_bookTitle()
	{
		books book1 = new books();
		book1.setTitle("Black Magic");
		assertEquals("Black Magic", book1.getTitle());
	}
	
	@Test
	public void test_loanerID()
	{
		books book1 = new books();
		book1.setLoanerID(123);
		assertEquals(123, book1.getLoanerID());
	}
	
	@Test
	public void test_loanDate()
	{
		books book1 = new books();
		book1.setLoanDate("04/12/2018");
		assertEquals("04/12/2018", book1.getLoanDate());
	}
	
	@Test
	public void test_returnDate()
	{
		books book1 = new books();
		book1.setReturnDate("06/12/2018");
		assertEquals("06/12/2018", book1.getReturnDate());
	}
	
	@Test
	public void test_bookCondition()
	{
		books book1 = new books();
		book1.setCondition("bad");
		assertEquals("bad", book1.getCondition());
	}
	
	@Test
	public void test_overloadfunction()
	{
		books book1 = new books(123, "This is a test", "Black Magic", 456, "01/01/2018","09/09/2018","good");
		assertEquals(123, book1.getBookID());
		assertEquals("This is a test", book1.getDescription());
		assertEquals("Black Magic", book1.getTitle());
		assertEquals(456, book1.getLoanerID());
		assertEquals("01/01/2018", book1.getLoanDate());
		assertEquals("09/09/2018", book1.getReturnDate());
		assertEquals("good", book1.getCondition());
	}
}
