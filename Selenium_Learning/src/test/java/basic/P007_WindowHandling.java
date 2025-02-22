package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P007_WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getConnection(url);
		
		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();
		
		Thread.sleep(2000);
		
		String mainWin = driver.getWindowHandle();
		
		Set<String> allWind= driver.getWindowHandles();
		
		for(String s:allWind) {
			if(!s.equals(mainWin)) {
				driver.switchTo().window(s);
				
				driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.quit();
	}
}
