package core;

class A{//parent,base
	public void classA() { 
		System.out.println("class A");
	}
}
class B extends A{//child,derived
	public void classB() {
		System.out.println("class B");
	}
}
class C extends B{
	public void classC() {
		System.out.println("class C");
	}
}

class D extends A{
	public void classD() {
		System.out.println("class D");
	}
}
public class P014_Inheritance {
	public static void main(String[] args) {
		A a = new A();
		a.classA();
		
		B b = new B();
		b.classA();
		b.classB();
		
		C c = new C();
		c.classA();
		c.classB();
		c.classC();
		
		
		D d = new D();
		d.classA();
		d.classD();
	}
}
