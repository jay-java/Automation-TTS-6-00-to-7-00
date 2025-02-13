package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P003_WebTable {
	public static void main(String[] args) {
		String url =  "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver  = DriverConnection.getConnection(url);
		
		WebElement ele = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[3]/td[3]"));
		System.out.println(ele.getText());
	}
}
