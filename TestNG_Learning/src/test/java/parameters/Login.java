package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class Login {

	@Parameters({ "email", "pass" })
	@Test
	public void userLogin(String email, String password) {
		WebDriver driver = DriverConnection.getConnection("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
}
