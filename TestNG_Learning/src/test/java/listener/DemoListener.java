package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListener implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test fail");
	}
}
