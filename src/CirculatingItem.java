
public abstract class CirculatingItem extends LibraryItem implements IBorrowable {
	  int timesOut = 0;
	  boolean isAvailable = true;
	  
	  public CirculatingItem(String isbn, String author, String title, String location) {
	    super(isbn, author, title, location);
	  }
	  
	  // mark an item as checked out of the library
	  public LibraryItem checkOut() {
	    this.isAvailable = false;
	    this.timesOut = this.timesOut + 1;
	    return this;
	  }
	  
	  // mark an item as checked in at the library
	  public LibraryItem checkIn() {
	    this.isAvailable = true;
	    return this;
	  }
	}
