package core;

final class ABC{
	final int i = 100;
	final public void change() {
		i++;
		System.out.println("change in parent : "+i);
	}
}
class ABC1 extends ABC{
	public void change() {
		System.out.println("change in child");
	}
}
public class P020_FinalKeyword {
	public static void main(String[] args) {
		ABC a = new ABC();
		a.change();
	}
}
