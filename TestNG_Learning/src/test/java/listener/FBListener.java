package listener;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBListener implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("fun called : "+result);
		WebDriver driver = (WebDriver)result.getTestContext().getAttribute("myDriver");
		String path = "D:\\screenshot\\"+result.getName()+".png";
		TakesScreenshot ss = (TakesScreenshot)driver;
		System.out.println(ss);
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
