package core;

import java.sql.Date;
import java.util.Scanner;

class AA {
	// without return type without parameter
	public void call() {
		System.out.println("call function in AA class");
	}

	// without return type with parameter
	public void setData(int i, String name, double d) {
		System.out.println("this function will get accept int value : " + i);
	}

	// with return type without parameter
	public boolean getData() {
		System.out.println("get data with return type");
		return true;
	}
	//with return type with parameter
	public String login(String email,String pass) {
		System.out.println("fun with return with para : ");
		return "user data";
	}
	public boolean checkEmail(String email) {
		System.out.println("email : "+email);
		return false;
	}
	public int printSqaure(int num) {
		return num*num;
	}
}

public class P011_Functions {
	public static void main(String[] args) {
		System.out.println("main function started");
		AA a = new AA();
		a.call();

		a.setData(1, "java", 3.21);

		boolean value = a.getData();
		System.out.println("return by function : "+value);
		
		boolean res = a.checkEmail("user@gmail.com");
		if(res == true) {
			System.out.println("user will get OTP");
		}
		else {
			System.out.println("account does not exist");
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num : ");
		int num = sc.nextInt();
		int square = a.printSqaure(num);
		System.out.println("square of "+num+" is : "+square);
	}
}
