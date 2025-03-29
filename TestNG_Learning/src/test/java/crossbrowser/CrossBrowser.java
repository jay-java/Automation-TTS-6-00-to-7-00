package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Parameters("browser")
	@Test
	public void test(String browser) {
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\user\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("https://www.facebook.com/");
	}
}
