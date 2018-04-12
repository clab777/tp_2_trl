public class LibraryHelper {
	private static final String LOCATION = "2115 Summit Ave, St. Paul, MN 55105";
	private static final String OFFICE_HOURS = "Hours: Mon - Fri: 9am - 11:59pm";


	public void displayWelcomeMessage(){
		//----------------------------------------
		// Welcome Message:
		//----------------------------------------
    	StdOut.println("***************************************************************************"); 
		StdOut.println("Welcom to ACME Library!");
		StdOut.println(LOCATION);
		StdOut.println(OFFICE_HOURS);
    	StdOut.println("***************************************************************************"); 
	}
	
	public void displayMenuOptions(){
		//----------------------------------------
		// Display Library options:
		//----------------------------------------
		StdOut.println("-------------------------------");
		StdOut.println("Please enter your option: ");
		StdOut.println("-------------------------------");
		StdOut.println("\tOption: 1) for a borrower (Patron)");
		StdOut.println("\tOption: 2) for a librarian (Worker)");

	}
	public void displayPatronOptions(){
		//----------------------------------------
		// Display Patron options:
		//----------------------------------------
		StdOut.println("-------------------------------");
		StdOut.println("Please select:");
		StdOut.println("-------------------------------");
		StdOut.println("\tC). Checkout Copies");
		StdOut.println("\tR). Return a Copies");
	}
	
	public void displayPlaceHolderMessage(){
		StdOut.println(">>>>> Features not yet implemented...........");
	}

	public void displayWorkerOptions(){
		//----------------------------------------
		// Display Worker/Librarian options:
		//----------------------------------------
		StdOut.println("-------------------------------");
		StdOut.println("Please select:");
		StdOut.println("-------------------------------");
		StdOut.println("\tA). Enter a new book");
		StdOut.println("\tB). Remove a book");
		StdOut.println("\tC). Check borrowing history of a book.");
		StdOut.println("\tD). Manage overdue textbooks.");
		StdOut.println("");
		displayPlaceHolderMessage();
	}

	public void displayNameParam(){
		//----------------------------------------
		// Display Patron options:
		//----------------------------------------
		StdOut.println("-------------------------------");
		StdOut.println("Please enter your name:");
		StdOut.println("-------------------------------");
	}
	
}
