package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class Parameterized_TestNG {

	static WebDriver driver = null;

	@BeforeMethod
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getConnection(url);
	}

	@Test(dataProvider = "dp")
	public void login(String email,String pass) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pass);
	}

	@DataProvider(name = "dp")
	public static Object[][] data() {
		Object[][] o = new Object[4][2];
		o[0][0] = "correct@gmail.com";
		o[0][1] = "correct";

		o[1][0] = "correct@gmail.com";
		o[1][1] = "correct";

		o[2][0] = "correct@gmail.com";
		o[2][1] = "correct";

		o[3][0] = "correct@gmail.com";
		o[3][1] = "correct";
		return o;
	}
}
