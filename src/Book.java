
public class Book extends CirculatingItem {

	private String title;
	private String author;
	private String isbn;
	private Boolean isAvailable = true;

	// Creates a new Book
	public Book(String isbn, String author, String bookTitle, String location) {
		super(isbn, author, bookTitle, location);
		this.isbn = isbn;
		this.author = author;
		this.title = bookTitle;
	}

	// Marks the book as not rented
	public void returned() {
		// Implement this method
	}

	// Returns true if the book is rented, false otherwise
	private boolean isBorrowed() {
		if(!isAvailable){
			return true;
		}else{
			return false;
		}
	}

	// Returns the title of the book
	public String getTitle() {
		return this.title;
	}

	// Modifier method to mark book as unavailible.
	public void makeBorrowed() {
		this.isAvailable = false;
		isBorrowed();
	}

	// Modifier method to mark a book as availible.
	public void makeReturned() {
		isAvailable = true;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", borrowed=" + isBorrowed()
				+ ", isAvailable=" + isAvailable + "]";
	}

	@Override
	public double lateFee(int daysOver) {
		return daysOver * .75;
	}

}
