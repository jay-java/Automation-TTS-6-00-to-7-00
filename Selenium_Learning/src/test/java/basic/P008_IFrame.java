package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P008_IFrame {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/frames";
		WebDriver driver = DriverConnection.getConnection(url);
		WebElement iFrame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iFrame);
		Thread.sleep(2000);
		WebElement text= driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
	}
}
