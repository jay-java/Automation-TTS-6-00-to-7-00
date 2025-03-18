package shopping;

import org.testng.annotations.Test;

public class Payment {
	@Test
	public void COD() {
		System.out.println("COD");
	}

	@Test
	public void creditCard() {
		System.out.println("credit card");
	}

	@Test
	public void debitCard() {
		System.out.println("debit card");
	}

	@Test(groups = "checkUPI")
	public void UPI() {
		System.out.println("UPI");
	}
}
