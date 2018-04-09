
@SuppressWarnings("serial")
public class LibraryTextbookRentatlException extends Exception {

	private final ErrorCode code;

	public LibraryTextbookRentatlException(ErrorCode code) {
		super();
		this.code = code;
	}

	public LibraryTextbookRentatlException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}

	public LibraryTextbookRentatlException(String message, ErrorCode code) {
		super(message);
		this.code = code;
	}

	public LibraryTextbookRentatlException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}

	public ErrorCode getCode() {
		return this.code;
	}

}
