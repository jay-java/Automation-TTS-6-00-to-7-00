package shopping;

import org.testng.annotations.Test;

public class Cart {
	@Test(groups = "checkUPI")
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test
	public void manageCart() {
		System.out.println("manage cart");
	}
	@Test
	public void removeFromCart() {
		System.out.println("remove from cart");
	}
}
