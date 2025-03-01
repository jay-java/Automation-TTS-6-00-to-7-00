package basic;

import org.junit.Ignore;
import org.junit.Test;

public class P01_First {

	@Test
	public void test1() {
		System.out.println("test1 function");
	}

	@Test
	@Ignore
	public void test2() {
		System.out.println("test2 function");
	}

	@Test
	public void test3() {
		System.out.println("test3 function");
	}

}
