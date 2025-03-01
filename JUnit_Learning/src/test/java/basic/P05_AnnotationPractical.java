package basic;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverConnection.DriverConnection;

public class P05_AnnotationPractical {

	static String url = "https://www.facebook.com/";
	static WebDriver driver=  null;
	@BeforeClass
	public static void openBrowser() {
		driver = DriverConnection.getConnection(url);
	}
	
	@Test
	public void titleTest() {
		String expectedTitle = "Facebook";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
	}
	
	@Test
	public void login() {
		driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("s@123");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
