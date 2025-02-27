package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P015_partialLinkText {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver= DriverConnection.getConnection(url);
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		System.out.println(links.size());
		for(WebElement l:links) {
			System.out.println(l.getText());
		}
		links.get(1).click();
		
		driver.navigate().back();
		
		driver.close();
	}
}
