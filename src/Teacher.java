public class Teacher extends Patron {
	private String firstName;
	private String lastName;
	private String teacherID;

	public Teacher(String fName, String lName, String Id) {
		super(fName, lName, Id);
		firstName = fName;
		lastName = lName;
		teacherID = Id;
	}

	/**
	 * Students can only borrow 2 books at a time, for 14 days each. If either
	 * of these conditions is exceeded, the student cannot borrow books.
	 * 
	 * @param borrowTime
	 *            Number of time per semester a Teacher can borrow *@param
	 *            bookCount Number of books allowed to borrowed per semester.
	 */
	public Boolean allowBorrow(int borrowTime, int bookCount) {
		if (borrowTime >= 6 || bookCount >= 12)
			return false;
		else
			return true;
	}

	@Override
	public String toString() {
		return "Teacher [firstName=" + firstName + ", lastName=" + lastName + ", teacherID=" + teacherID + "]";
	}

	public String getFName() {
		return firstName;
	}
}
