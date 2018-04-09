import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TRLApp {

	private static final String TITLE = "Object Oriented Software Engineering Practical Software Development using UML and Java";
	private static final String LOCATION = "2115 Summit Ave, St. Paul, MN 55105";
	private static int NB_BOOKS = 2;
	private static int NB_TIME = 1;

	private static Library library = null;
	private static LibraryHelper helper = null;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		//------ Initialization -----//
		initLibrary();

		//-------- Welcome message -------//
		helper.displayWelcomeMessage();
		
		//-------- Display Library options -------//
		helper.displayMenuOptions();
		
		String option = scan.nextLine();
		
		// Logic for options.
		if ("1".equals(option)) {
			helper.displayPatronOptions();
			option = scan.nextLine();

			if ((option.toUpperCase()).equals("C")) {
				
				helper.displayNameParam();
				
				String name = scan.nextLine();
				
				startNewCheckoutSession(name);

			} else if ((option.toUpperCase()).equals("R")) {
				helper.displayPlaceHolderMessage();
			}
		} else if ("2".equals(option)) {
			helper.displayWorkerOptions();
			System.exit(0);
		}
	}
	
	/**
	 * <code>startNewCheckoutSession</code>. Starts a new Checkout Session
	 * @param name Patron
	 * @throws Exception. Not found exception if fail to locate ID in the database.
	 */
	private static void startNewCheckoutSession(String name) throws Exception{
		//------ Creating student Object: i.e. scanning ID Card -----//
		Patron p = library.findBorrower(name);

		if(p == null){
			ErrorCode error = new ErrorCode("400");			
			throw new LibraryTextbookRentalException("Sorry your Patron ID is not in Library database.", error);
		}
		
		//------ Checkout -----//
		checkOut(p);
	}

	private static void startNewCheckinSession(String patronID){
		//TODO
	}

	/**
	 * <code>initLibrary</code>. Library initialization method.
	 */
	private static void initLibrary(){
		
		library = new Library();
		helper = new LibraryHelper();
		
		//load catalog
		library.setBooks(loadCatalog());
		
		//load Students
		library.setStudents(loadStudents());
		
		//load Teachers
		library.setTeachers(loadTeachers());
	}

	/**
	 * <code>checkOut</code>. Checkout book to a patron
	 * @param p Patron
	 * @return Textbook 
	 */
	private static Book checkOut(Patron p){
		Book b = library.checkoutBook(TITLE, p, NB_TIME, NB_BOOKS); // Checkout book
		return b;
	}

	
	/**
	 * <code>loadBooks</code> Initialization method to load Library catalog
	 * @return bookArrays. List of available books in the Library
	 */
	private static List<Book> loadCatalog() {
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

	/**
	 * <code>loadBooks</code> Initialization method to load Students into Library data store
	 * @return students. Student List
	 */
	private static List<Student> loadStudents() {
		List<Student> students = new ArrayList<Student>();
		Student student = new Student("Christophe", "Labarere", "123");
		students.add(student);

		student = new Student("Sinith", "Leng", "345");
		students.add(student);

		student = new Student("Robert", "Roy", "678");
		students.add(student);

		student = new Student("Surjan", "Kshetri", "901");
		students.add(student);

		return students;
	}

	/**
	 * <code>loadBooks</code> Initialization method to load Teachers into Library data store
	 * @return teachers. Teachers List
	 */
	private static List<Teacher> loadTeachers() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		Teacher teacher = new Teacher("Eric", "Level", "SEIS-635");
		teachers.add(teacher);

		teacher = new Teacher("Ali", "Naqvi", "SEIS-625");
		teachers.add(teacher);

		teacher = new Teacher("Ted", "Wallerstedt", "SEIS-663");
		teachers.add(teacher);

		return teachers;
	}

}
