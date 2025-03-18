package basic;

import org.testng.annotations.Test;

public class P02_Priority {
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create account");
	}
	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 3,expectedExceptions = ArithmeticException.class)
	public void profile() {
		System.out.println("profile check");
		int i  =10/0;
	}
	@Test(priority = 4,alwaysRun = true)
	public void changePassword() {
		System.out.println("change pass");
	}
	@Test(priority = 5,enabled = false)
	public void logout() {
		System.out.println("logout");
	}
}
