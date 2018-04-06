
public interface IBorrowable {
	  // computes late fee assess given how many days overdue the item is
	  public double lateFee(int daysOver);
	  // check an item out of the library, updating availability
	  public LibraryItem checkOut();
	 // check an item into of the library, updating availability
	  public LibraryItem checkIn();
}
