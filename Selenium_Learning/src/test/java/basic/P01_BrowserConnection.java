package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P01_BrowserConnection {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		//2. for edge
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
		
		//1.for chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.sendKeys("seleenium@gmail.com");
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.sendKeys("selenium@123");
		WebElement loginBTN = driver.findElement(By.name("login"));
		loginBTN.click();
//		driver.close();
	}
}
