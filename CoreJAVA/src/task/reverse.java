package task;

public class reverse {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println(a.length);
		for(int index=0;index<a.length;index++) {
			System.out.println(a[index]);
		}
		
		System.out.println("reverse");
		for(int index=a.length-1;index>=0;index--) {
			System.out.println(a[index]);
		}
		
	}
}
