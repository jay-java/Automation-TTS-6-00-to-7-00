package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calc.Calculate;

public class P03_CalcTest {
	@Test
	public void addTest() {
		Calculate c = new Calculate();
		int actualRes = c.add(34,16);
		int expectedRes = 50;
		assertEquals(expectedRes, actualRes);
	}
}
