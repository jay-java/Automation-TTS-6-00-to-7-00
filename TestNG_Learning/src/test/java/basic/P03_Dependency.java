package basic;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class P03_Dependency {
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create account");
	}

	@Test(priority = 2,dependsOnMethods = "createAccount")
	public void login() {
		assertFalse(true);
		System.out.println("login");
	}

	@Test(priority = 3,dependsOnMethods = "login")
	public void profile() {
		System.out.println("profile check");
	}

	@Test(priority = 4,dependsOnMethods = "login")
	public void changePassword() {
		System.out.println("change pass");
	}

	@Test(priority = 5,dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout");
	}
}
