package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P004_DynamicWebTable {
	public static void main(String[] args) {
		String url =  "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver  = DriverConnection.getConnection(url);
		
		String name ="Convertible Mark";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
//		System.out.println(rows.size());
		for(int i=1;i<=rows.size();i++){
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td"));
//			System.out.println(cols.size());
			for(int j=2;j<=cols.size();j++) {
				WebElement data = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(data.getText()+" | ");
				if(name.equals(data.getText())) {
					System.out.println("true");
				}
			}
			System.out.println();
		}
		
	}
}
