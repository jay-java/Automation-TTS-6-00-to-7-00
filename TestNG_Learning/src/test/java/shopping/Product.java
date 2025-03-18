package shopping;

import org.testng.annotations.Test;

public class Product {
	@Test(groups = "smoke")
	public void uploadProduct() {
		System.out.println("upload pro");
	}
	@Test
	public void mangeProduct() {
		System.out.println("manage pro");
	}
	@Test
	public void removeProducrt() {
		System.out.println("delete pro");
	}
	@Test(groups = {"checkUPI","smoke"})
	public void saerchPr() {
		System.out.println("search prodcut");
	}
	@Test
	public void comparePro() {
		System.out.println("compare pro");
	}

}
