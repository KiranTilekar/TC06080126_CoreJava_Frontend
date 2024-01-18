
public class Test1 {

	public static void main(String[] args) {
		
		ThreadGroup g1 = new ThreadGroup("tg");
		Thread t1 = new Thread(g1,"First Thread");
		Thread t2 = new Thread(g1,"Second Thread");
		System.out.println("bef g1="+g1.getMaxPriority());
		System.out.println("bef t1="+t1.getPriority());
		System.out.println("bef t2="+t2.getPriority());
		
		g1.setMaxPriority(3);
		
		Thread t3 = new Thread(g1,"Third Thtead");
		
		System.out.println("aft g1="+g1.getMaxPriority());
		System.out.println("aft t1="+t1.getPriority());
		System.out.println("aft t2="+t2.getPriority());
		System.out.println("aft t3="+t3.getPriority());
	}
}
