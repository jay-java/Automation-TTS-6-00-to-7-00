package core;

import java.util.Scanner;

class Data{
	public void call() {
		System.out.println("hello call function");
	}
	public void run() {
		System.out.println("hello run in data class");
	}
}
public class P006_UserInput {
	public static void main(String[] args) {
		int i=1,j=12;
		System.out.println(i+j);
		Data d = new Data();
		d.run();
		d.call();
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println("enter double = ");
		double d1 = sc.nextDouble();
		System.out.println(d1);
	}
	
}
