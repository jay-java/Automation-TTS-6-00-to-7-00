package core;
//Assignment -> =,+=,-=,*=,/=

//Arithmetic -> +,-,*,/,%(modulo)
//Unary -> ++,--
//Relational -> < ,>, <= ,>= 
//equality -> == ,!=
//Logical -> &&, ||

public class P003_Operators {
	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
		// 10
		i += 20; // i = i+20;
		System.out.println(i);
		// 30
		i -= 12;
		System.out.println(i);
		// 18
		i *= 2;
		System.out.println(i);
		i /= 3;
		System.out.println(i);

		int length = 13;
		int breadth = 4;
		System.out.println("area of rectangle = " + (length * breadth));

		double radius = 13.45;
		System.out.println("area of traingle = " + (Math.PI * radius * radius));

	}
}