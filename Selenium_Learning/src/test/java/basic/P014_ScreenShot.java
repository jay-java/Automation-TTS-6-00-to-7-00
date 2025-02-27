package basic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverConnection.DriverConnection;

public class P014_ScreenShot {
	
	public static void getScreenShot(WebDriver driver,String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String url  ="https://www.facebook.com/";
		WebDriver driver = DriverConnection.getConnection(url);
		
		driver.findElement(By.name("email")).sendKeys("sele@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("s@123");
		driver.findElement(By.name("login")).click();
		
		getScreenShot(driver, "D:\\screenshot\\err.png");
	}
}
