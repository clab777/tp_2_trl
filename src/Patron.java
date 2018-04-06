public abstract class Patron{
  private String name;
  private String Id;
  
  //Constructor. Params for name and Id 
  public Patron(String name, String id){
    this.name = name;
    this.Id = id;
  }
  
  public abstract Boolean allowBorrow(int time, int books);
}
