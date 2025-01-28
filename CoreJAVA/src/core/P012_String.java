package core;

public class P012_String {
	public static void main(String[] args) {
		char[] c = { 'j', 'a', 'v', 'a' };
		System.out.println(c);
		String c1 = "java is awesome tech to learn in@# 2025";
		System.out.println(c1);
		System.out.println(c1.length());
		System.out.println(c1.charAt(12));
		String s1 = "java";
		String s2 = " technology";
		System.out.println(s1.concat(s2));
		String s3 = "java";
		String s4 = "jaVa";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		String s5 = "        j ava      ";
		System.out.println(s5);
		System.out.println(s5.trim());
	}
}
