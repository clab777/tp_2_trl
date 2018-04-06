
public class Student extends Patron{


	private String id;
    private String name;
    private Hold hold;
    private Fine fine;

	public Student(String name, String id) {
		super(name, id);
		this.name = name;
		this.id = id;
	}


    public Fine getFine() {
		return fine;
	}

	public void setFine(Fine fine) {
		this.fine = fine;
	}

	public Hold getHold() {
		return hold;
	}

	public void setHold(Hold hold) {
		this.hold = hold;
	}


    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Students can only borrow 2 books at a time, for
     * 14 days each. If either of these conditions is
     * exceeded, the student cannot borrow books.
     * @param borrowTime Number of time per semester a Student can borrow 
     * *@param bookCount Number of books allowed to borrowed per semester.
     */ 
    public Boolean allowBorrow(int borrowTime, int bookCount){
      if(borrowTime >= 2 || bookCount >= 4)
        return false;
      else
        return true;
    }


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hold=" + hold + ", fine=" + fine + "]";
	}
    
    

 }
