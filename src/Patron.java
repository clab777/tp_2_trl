public abstract class Patron {
	private String firstName;
	private String lastName;

	private String Id;

	// Constructor. Params for name and Id
	public Patron(String fName, String lName, String id) {
		this.firstName = fName;
		this.lastName = lName;
		this.Id = id;
	}
	public abstract Boolean allowBorrow(int time, int books);

	@Override
	public String toString() {
		return "Patron [firstName=" + firstName + ", lastName=" + lastName + ", Id=" + Id + "]";
	}

}
