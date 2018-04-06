public class Teacher extends Patron{
  private String teacherName;
  private String teacherID;
  
  public Teacher(String name, String Id){
    super(name, Id);
    teacherName = name;
    teacherID = Id;
  }
  

  /**
   * Students can only borrow 2 books at a time, for
   * 14 days each. If either of these conditions is
   * exceeded, the student cannot borrow books.
   * @param borrowTime Number of time per semester a Teacher can borrow 
   * *@param bookCount Number of books allowed to borrowed per semester.
   */ 
  public Boolean allowBorrow(int borrowTime, int bookCount){
    if(borrowTime >= 6 || bookCount >= 12)
      return false;
    else
      return true;
  }
  
  public String toString(){
        return teacherName + ", " + teacherID;
    }
}
