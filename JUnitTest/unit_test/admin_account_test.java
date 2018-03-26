package unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.admin_account;

public class admin_account_test {
	
	@Test
	public void test_getAdmin_userID()
	{
		admin_account admin = new admin_account();
		assertEquals(0, admin.getPassWord());
		admin.getUserID("sinith");
		assertEquals(1, admin.getPassWord());
	}

}
