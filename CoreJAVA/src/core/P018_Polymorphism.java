package core;

class Overload{
	public int add(int i,int j) {
		return i+j;
	}
	public int add(int i,int j,int k) {
		return i+j+k;
	}
}
class OverrideParent{
	OverrideParent(){
		System.out.println("parent cons in overriding");
	}
	public void call() {
		System.out.println("call in override, parent");
	}
	public void show() {
		System.out.println("show in override, parent");
	}
}
class OverrideChild extends OverrideParent{
	public void call() {
		super.call();
		System.out.println("call in override, child");
	}
	public void show() {
		System.out.println("show in override, child");
		super.show();
	}
}
public class P018_Polymorphism {
	public static void main(String[] args) {
		Overload a=  new Overload();
		int res1=  a.add(1, 2);
		System.out.println(res1);
		
		int res2 = a.add(1, 2, 3);
		System.out.println(res2);
		
		OverrideChild o = new OverrideChild();
		o.call();
		o.show();
	}
}
