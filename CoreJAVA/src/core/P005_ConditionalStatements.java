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
		int age = 65;
		if (age > 18) {
			if (age < 55) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 55");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// else if ladder
		int marks = 84;
		if (marks < 35) {
			System.out.println("fail");
		} else if (marks >= 35 && marks <= 60) {
			System.out.println("pass class");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("C grade");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("B grade");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("A grade");
		} else if (marks >= 91 && marks <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		System.out.println("enter your choice : ");
		System.out.println("1.English");
		System.out.println("2.Hindi");
		System.out.println("3.Gujarati");
		int choice = 2;

		switch (choice) {
		case 1:
			System.out.println("you selected english");
			break;

		case 2:
			System.out.println("you selected hindi");
			break;

		case 3:
			System.out.println("you selected gujarati");
			break;

		default:
			System.out.println("invalid input");
		}

		double radius = 13;
		double height = 23;
		double area = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
		System.out.println("surface area of cylinder = " + area);
		System.out.println(
				"surface area of cylinder = " + ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius)));

		int age1 = 17;
		boolean haveElectionCard = true;
		if (haveElectionCard && age1 > 18) {
			System.out.println("yes have an e-card and can vote");
		} else if (haveElectionCard && age1 < 18) {
			System.out.println("yes have an e-card but not greater than 18");
		} else {
			System.out.println("don't have an e-card");
		}
	}
}
