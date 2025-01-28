package core;

class Student{
	static {
		System.out.println("static block in student class");
	}
	int enroll_no;
	String name;
	long contact;
	static String cname="TOPS";
	public Student(int enroll_no, String name, long contact) {
		super();
		this.enroll_no = enroll_no;
		this.name = name;
		this.contact = contact;
	}
	public void showData() {
		System.out.println("enroll_no : "+enroll_no+" name : "+name+" contact: "+contact+" cname : "+cname );
	}
	public static void call() {
		System.out.println("static call in student class");
	}
	
}
public class P017_StaticKeyword {
	static {
		System.out.println("before main static block will executes");
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "java",98645321);
		s1.showData();
		Student.call();
	}
}
