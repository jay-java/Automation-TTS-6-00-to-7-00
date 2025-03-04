package basic;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import calc.Calculate;
@RunWith(Parameterized.class)
public class P07_Parameterized {
	int a;
	int b;
	int expectedRes;
	public P07_Parameterized(int a, int b, int expectedRes) {
		this.a = a;
		this.b = b;
		this.expectedRes = expectedRes;
	}
	@Test
	public void addTest() {
		Calculate c = new Calculate();
		int actualRes = c.add(a, b);
		assertEquals(expectedRes, actualRes);
	}
	@Parameters
	public static List<Object[]> getData() {
		Object obj[][] = new Object[4][3];

		obj[0][0] = 12;
		obj[0][1] = 34;
		obj[0][2] = 45;

		obj[1][0] = 10;
		obj[1][1] = 30;
		obj[1][2] = 40;

		obj[2][0] = 120;
		obj[2][1] = 340;
		obj[2][2] = 450;

		obj[3][0] = 124;
		obj[3][1] = 346;
		obj[3][2] = 457;

		return Arrays.asList(obj);
	}
}
