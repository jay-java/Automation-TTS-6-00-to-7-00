package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P006_Alerts {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getConnection(url);
		
		//1.alert
//		WebElement alertButton1 = driver.findElement(By.id("alertButton"));
//		alertButton1.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		
		//2.alert
//		WebElement alertButton2 = driver.findElement(By.id("timerAlertButton"));
//		alertButton2.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		
		
		//3.alert
//		WebElement alertButton3 = driver.findElement(By.id("confirmButton"));
//		alertButton3.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.dismiss();
		
		//4.alert
		WebElement alertButton3 = driver.findElement(By.id("promtButton"));
		alertButton3.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("selenium");
		alert.accept();
	}
}
