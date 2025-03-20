package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class FB {
	String url = "https://www.facebook.com/";
	@Test(priority = 1)
	public void titleCheck() {
		System.out.println("title called");
		WebDriver driver = DriverConnection.getConnection(url);
		String expectedTitle = "Facebook";
	}
	
	@Test(priority = 2)
	public void login(ITestContext i) {
		System.out.println("login called");
		WebDriver driver = DriverConnection.getConnection(url);
		i.setAttribute("driver", driver);
		driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("selenium@123");
		assertEquals(driver.getTitle(), "FB");
		
	}
}
