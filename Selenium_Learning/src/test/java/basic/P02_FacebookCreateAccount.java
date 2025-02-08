package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P02_FacebookCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getConnection(url);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		
		driver.findElement(By.name("lastname")).sendKeys("testers");
		
		//by index
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByIndex(14);
		//by visible text
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("May");
		//by value
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByValue("2011");
		
		List<WebElement> gender = driver.findElements(By.id("sex"));
		System.out.println(gender.size());
		for(WebElement e:gender) {
			gender.get(1).click();
		}
	}
}
