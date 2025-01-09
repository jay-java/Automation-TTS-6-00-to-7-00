package core;

//for(initialize,condition,incre,decre)
//while(condition){body}
//do{body} while(condition);
//for each
public class P007_Loops {
	public static void main(String[] args) {
		System.out.println("for loop increment");
		for (int i = 11; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("for loop decrement");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("while loop increment");
		int j = 11;
		while (j <= 10) {
			System.out.println(j);
			j++;
		}
		System.out.println("do while loop increment");
		int k = 11;
		do {
			System.out.println(k);
			k++;
		} while (k <= 10);

	}
}
