package core;
interface inter1{
	public void interface1();
	public static void staticInterface1() {
		System.out.println("static interface 1");
	}
}
interface inter2 extends inter1{
	public void interface2();
	public static void staticInterface2() {
		System.out.println("static interface 2");
	}
}
interface inter3{
	public void interface3();
	public static void staticInterface3() {
		System.out.println("static interface 3");
	}
}
class InterfaceCall implements inter2,inter3 {

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}	
	
}
public class P021_Interface {
	public static void main(String[] args) {
		InterfaceCall i = new InterfaceCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.staticInterface1();
		inter2.staticInterface2();
		inter3.staticInterface3();
		
	}
}
