package core;

class User {
	int id;
	String name;

	User() {
		System.out.println("defualt cons");
	}

	User(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("in cons id : " + id + " name : " + name);
	}

	public void call() {
		System.out.println("call in user");
	}

	public void showData() {
		System.out.println("in function id : " + id + " name : " + name);
	}
}

public class P013_Constructor {
	public static void main(String[] args) {
		User u = new User();
		u.call();

		User u1 = new User(12, "java");
		u1.showData();
	}
}
