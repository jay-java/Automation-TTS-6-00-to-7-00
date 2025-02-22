package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P010_DragDrop {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = DriverConnection.getConnection(url);

		WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(2000);
		
		WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		System.out.println(img1);
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions action  = new Actions(driver);
		
		action.clickAndHold(img1).moveToElement(trash).release().build().perform();
		
		
		

	}
}
