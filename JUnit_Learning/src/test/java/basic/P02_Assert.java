package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class P02_Assert {

	@Test
	public void test1() {
		System.out.println("test1 function");
//		assertEquals(12, 12);
		assertTrue(false);
	}

	@Test
	public void test2() {
		System.out.println("test2 function");
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4,5};
		assertArrayEquals(a, b);
	}

	@Test
	public void test3() {
		System.out.println("test3 function");
	}

}
