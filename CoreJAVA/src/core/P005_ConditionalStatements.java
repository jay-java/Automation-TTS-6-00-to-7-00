package core;

public class P005_ConditionalStatements {
	public static void main(String[] args) {
		// 1.simple if
		int a = 30, b = 20;
		if (a > b) {
			System.out.println("a is greater than b");
		}

		// 2.if else
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// nested if
		int age = 43;
		if (age > 18) {
			if (age < 55) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 55");
			}
		} else {
			System.out.println("age is less than 18");
		}
	}
}
