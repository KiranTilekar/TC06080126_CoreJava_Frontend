//28-12-2023
public class Test {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup("FirstGroup");
		System.out.println(g1.getParent().getName());
		
		ThreadGroup g2 = new ThreadGroup(g1, "SecondGroup");
		System.out.println(g2.getParent().getName());
		
//		System.out.println(Thread.currentThread());
//		System.out.println(Thread.currentThread().getThreadGroup());
	}
}

//we have "main" thread and this main thread have "main" ThreadGroup and this main ThreadGroup have parent "system"
