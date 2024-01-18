//28-12-2023
public class MyThread2 {

	private static final int MAX_PRIORITY = 0;

	public void run()
	{
		//resource -- running
//		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();//born state
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setName("one");
		t2.setName("two");
		t3.setName("three");
		
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(5);
		
//		t1.setPriority(MAX_PRIORITY);
		
		t1.start(); //runnable state - waiting in queue
		//in order to acquire resources
		t2.start();
		t3.start();
		
	}
}
