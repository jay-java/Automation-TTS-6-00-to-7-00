package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P011_Calender {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = DriverConnection.getConnection(url);

		WebElement iFrame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(iFrame);

		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();

		String myDate = "26";
		String myMonth = "June";
		String myYear = "2029";

		WebElement currentYear = driver.findElement(By.className("ui-datepicker-year"));
		System.out.println(currentYear.getText());
		String cy = currentYear.getText();
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(cy);

		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if (y1 > y2) {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if (y1 > y2) {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}

		List<WebElement> dates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for (WebElement date : dates) {
			if (myDate.equals(date.getText())) {
				date.click();
			}
		}

	}
}
