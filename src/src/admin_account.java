package src;

import java.util.HashMap;

public class admin_account 
{
	private String userID;
	private int password;
	
	HashMap<String, Integer> map = new HashMap<>();
	
	public admin_account()
	{
		map.put("sinith", 1);
	}
	
	public void getUserID(String id)
	{
		 this.userID = id;
		 password = map.get(this.userID);
	}
	
	public int getPassWord()
	{
		return password;
	}
}
