
public abstract class LibraryItem {
	String title;
	String location;

	public LibraryItem(String isbn, String author, String title, String location) {
		this.title = title;
		this.location = location;
	}

	// check whether item has a given title
	public boolean hasTitle(String atitle) {
		return this.title.equals(atitle);
	}

	public String toString() {
		return "Obj:" + this.title;
	}
}
