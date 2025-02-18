package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P005_WebTableTheadTBody {
	public static void main(String[] args) {
		String url ="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getConnection(url);
		
		List<WebElement> thead = driver.findElements(By.xpath("//div[@class='separator']/div[1]/div[5]/table/thead/tr/th"));
		System.out.println(thead.size());
		//table header
		for(int index=1;index<=thead.size();index++) {
			WebElement data =  driver.findElement(By.xpath("//div[@class='separator']/div[1]/div[5]/table/thead/tr/th["+index+"]/span"));
			System.out.print(data.getText()+" | ");
		}
		System.out.println();
		
		//table body
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tbody/tr"));
		for(int index=1;index<=rows.size();index++){
			List<WebElement> th = driver.findElements(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tbody/tr["+index+"]/th"));
			
			//th from column 1
			for(int th_index=1;th_index<=th.size();th_index++) {
				WebElement span_text = driver.findElement(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tbody/tr["+index+"]/th["+th_index+"]/span"));
				System.out.println(span_text.getText());
			}
			
			//td from row
			List<WebElement> td = driver.findElements(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tbody/tr["+index+"]/td"));
			for(int td_index=1;td_index<=td.size();td_index++) {
				WebElement span_text = driver.findElement(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tbody/tr["+index+"]/td["+td_index+"]/span"));
				System.out.println(span_text.getText());
			}
		
		
		
		}
	}
}
