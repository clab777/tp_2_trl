
@SuppressWarnings("serial")
public class LibraryTextbookRentalException extends Exception {

	private final ErrorCode code;

	public LibraryTextbookRentalException(ErrorCode code) {
		super();
		this.code = code;
	}

	public LibraryTextbookRentalException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}

	public LibraryTextbookRentalException(String message, ErrorCode code) {
		super(message);
		this.code = code;
	}

	public LibraryTextbookRentalException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}

	public ErrorCode getCode() {
		return this.code;
	}

}
