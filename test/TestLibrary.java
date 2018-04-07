import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestLibrary {

	private static final String TITLE = "Object Oriented Software Engineering Practical Software Development using UML and Java";
	private static int NB_BOOKS = 2;
	private static int NB_TIME = 1;
	private static final String LOCATION = "2115 Summit Ave, St. Paul, MN 55105";

	private Library library;

	@Before
	public void setUp() {
		/*
		 * Method run at the start of the program. Determines the user to be a
		 * borrower or librarian and presents them with their options. Selected
		 * options call methods accordingly.
		 */
		library = new Library();
		library.setBooks(loadBooks());
		library.setStudents(loadStudents());
		library.setTeachers(loadTeachers());

		//---------------------------------------
		// Display Books, Students and Teachers 
		//---------------------------------------
		StdOut.println("---------------------------");
		StdOut.println("---- Library Catalog ------");
		StdOut.println("---------------------------");

		library.displayBooks();
		
		StdOut.println("---------------------------");
		StdOut.println("---- Students ----");
		StdOut.println("---------------------------");

		library.displayStudents();

		StdOut.println("---------------------------");
		StdOut.println("---- Teachers ----");
		StdOut.println("---------------------------");

		library.displayTeachers();

		StdOut.println("");
		StdOut.println("*******************************************");
		StdOut.println("Welcome to Library Management System (LMS)!");
		StdOut.println("*******************************************");
		
	}
	
	
	@Test
	public void testCheckout() {

		Book b = library.checkoutBook(TITLE, library.getStudents().get(0), NB_TIME, NB_BOOKS); // Checkout book
		assertTrue(b != null && b.getIsbn() != null);
	}
	
	@Test
	public void testCheckin() {

		Book b = library.checkinBook(TITLE, library.getStudents().get(0).getName()); // Return book.
		assertTrue(b != null && b.getIsbn() != null);
	}
	
	private static List<Book> loadBooks() {
		List<Book> bookArrays = new ArrayList<Book>();
		Book b = new Book("978-0131489066", "Craig Larman", "Object Oriented Software Engineering Practical Software Development using UML and Java", LOCATION);
		bookArrays.add(b);

		b = new Book("978-0131111554", "Craig Larman", "Agile and Iterative Development: A Manager's Guide", LOCATION);
		bookArrays.add(b);

		b = new Book("978-0735679665", "Karl Weigers", "Software Requirements (3rd Edition) (Developer Best Practices)", LOCATION);
		bookArrays.add(b);

		b = new Book("978-0073019338", "Roger S. Pressman", "Software Engineering: A Practitioner's Approach", LOCATION);
		bookArrays.add(b);

		return bookArrays;
	}

	private static List<Student> loadStudents() {
		List<Student> students = new ArrayList<Student>();
		Student student = new Student("Christophe Labarere", "123");
		students.add(student);

		student = new Student("Sinith Leng", "345");
		students.add(student);

		student = new Student("Robert, M Roy", "678");
		students.add(student);

		student = new Student("Surjan Kshetri", "901");
		students.add(student);

		return students;
	}

	private static List<Teacher> loadTeachers() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		Teacher teacher = new Teacher("Eric Level", "SEIS-635");
		teachers.add(teacher);

		teacher = new Teacher("Ali Naqvi", "SEIS-625");
		teachers.add(teacher);

		teacher = new Teacher("Ted Wallerstedt", "SEIS-663");
		teachers.add(teacher);

		return teachers;
	}
}
