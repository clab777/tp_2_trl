package src;

public class books 
{
	private int id;
	private String description;
	private String title;
	private int loanerID;
	private String loanDate;
	private String returnDate;
	private String bookCondition;
	
	public books()
	{
		id = 0;
		description = "";
		title = "";
		loanerID = 0;
		loanDate = "";
		returnDate = "";
		bookCondition = "";
	}
	public books(int bookId, String bookDescription, String bookTitle, int id, String loan_date, String return_date, String condition)
	{
		this.id = bookId;
		this.description = bookDescription;
		this.title = bookTitle;
		this.loanerID = id;
		this.loanDate = loan_date;
		this.returnDate = return_date;
		this.bookCondition = condition;
	}
	
	public void setBookID(int id_num)
	{
		this.id = id_num;
	}
	
	public int getBookID()
	{
		return this.id;
	}
	
	public void setDescription(String bookDescription)
	{
		this.description = bookDescription;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setTitle(String name)
	{
		this.title = name;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setLoanerID(int id)
	{
		this.loanerID = id;
	}
	
	public int getLoanerID()
	{
		return this.loanerID;
	}
	
	public void setLoanDate(String Date)
	{
		this.loanDate = Date;
	}
	
	public String getLoanDate()
	{
		return this.loanDate;
	}
	
	public void setReturnDate(String date)
	{
		this.returnDate = date;
	}
	
	public String getReturnDate()
	{
		return this.returnDate;
	}
	
	public void setCondition(String condition)
	{
		this.bookCondition = condition;
	}
	
	public String getCondition()
	{
		return this.bookCondition;
	}
}
