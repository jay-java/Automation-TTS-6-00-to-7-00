package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P04_Annotations {

	@BeforeClass
	public static void beforeCLass() {
		System.out.println("before class");
	}
	
	@Test
	public void test() {
		System.out.println("test fun");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	
	
	@AfterClass
	public static void afterCLass() {
		System.out.println("after class");
	}
	
	
}
