//static inner class
public class Outer1
{
	private int i = 100;
	private static int a = 1;
	
	static class Inner
	{
		int no = 111;
		
		public void get()
		{
			System.out.println("no="+no);
			System.out.println("a="+a);
//			System.out.println("i="+i);  //only static mem can be accessed in static inner class
		}
	}
	
	public static void main(String[] args) {
		Outer1.Inner o = new Outer1.Inner();
		o.get();
	}
}
