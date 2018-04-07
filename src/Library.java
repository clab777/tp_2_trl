import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books = new ArrayList<Book>(); // Holds all books.
	private List<Teacher> teachers = new ArrayList<Teacher>(); // Holds all teachers.
	private List<Student> students = new ArrayList<Student>(); // Holds all students.

	// Prints out the contents of the Library.
	public void displayBooks() {
		for (int i = 0; i < books.size(); i++) {
			StdOut.println(books.get(i));
		}
	}

	// Prints out the teachers.
	public void displayTeachers() {
		for (int i = 0; i < teachers.size(); i++) {
			StdOut.println(teachers.get(i));
		}
	}

	// Prints out the students.
	public void displayStudents() {
		for (int i = 0; i < students.size(); i++) {
			StdOut.println(students.get(i));
		}
	}

	/*
	 * Method to mark a book as checkout if it is available. Params: Title or
	 * isbn of a book and the name of the borrower.
	 */
	public Book checkoutBook(String title, Student patron, int nbTimes, int nbBooks) {
		Book book = findBook(title);
		if (book != null && patron.allowBorrow(nbTimes, nbBooks) && patron.getHold() == null) {
			book.makeBorrowed();
		}
		StdOut.println("---------------------------------------------------------------------------------------------------------------");
		StdOut.println("Checking out: " +book +"\n\t  checkedout to: " +patron.toString());
		StdOut.println("---------------------------------------------------------------------------------------------------------------");
		
		StdOut.println("\n");
		displayBooks();
		
		return book;
	}

	/*
	 * Method to mark a book as returned if possible.
	 */
	public Book checkinBook(String title, String borrower) {
		Book book = findBook(title);
		if (book != null) {
			book.makeReturned();
		}
		//TODO: remove Book from Patron's record.............
		StdOut.println("---------------------------------------------------------------------------------------------------------------");
		StdOut.println("Checking in: " +book +"\n\t  checkedout to: " +borrower);
		StdOut.println("---------------------------------------------------------------------------------------------------------------");
		
		StdOut.println("\n");
		displayBooks();
		return book;
	}

	/*
	 * Finds book object based on String. Basically converts from String to
	 * Book.
	 */
	public Book findBook(String input) {
		for (int i = 0; i < books.size(); i++) {
			String str = (books.get(i)).getTitle();
			String isbn = (books.get(i)).getIsbn();
			if (input.equals(str) || input.equals(isbn))
				return books.get(i);
		}
		return null;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> list) {
		this.books = list;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> list) {
		this.teachers = list;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> list) {
		this.students = list;
	}

}