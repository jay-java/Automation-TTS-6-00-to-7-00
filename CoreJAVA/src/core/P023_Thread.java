package core;

public class P023_Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		long startTime = System.currentTimeMillis();
		for(int i=1;i<=5;i++) {
			System.out.println(t+" : "+i);
			Thread.sleep(2000);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time taken to run process : "+(endTime-startTime));
	}
}
