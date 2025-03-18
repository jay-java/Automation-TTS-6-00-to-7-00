package shopping;

import org.testng.annotations.Test;

public class Sller {
	@Test
	public void CA() {
		System.out.println("create account");
	}
	@Test(groups = "smoke")
	public void login() {
		System.out.println("login");
	}
	@Test(groups = "checkUPI")
	public void CP() {
		System.out.println("change pass");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
}
