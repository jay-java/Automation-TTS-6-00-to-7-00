package core;

import java.util.Scanner;

public class P008_Programs {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num : ");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
	}
}
