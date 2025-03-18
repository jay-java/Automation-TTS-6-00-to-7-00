package shopping;

import org.testng.annotations.Test;

public class Customer {

	@Test
	public void CA() {
		System.out.println("create account");
	}
	@Test(groups = {"checkUPI","smoke"})
	public void login() {
		System.out.println("login");
	}
	@Test
	public void CP() {
		System.out.println("change pass");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
}
