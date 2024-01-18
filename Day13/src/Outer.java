//method local inner class
public class Outer 
{
	private int a = 10;
	
	public void get()
	{
		class Inner
		{
			int no = 111;
			
			public void get()
			{
				System.out.println("InnerNo="+no);
				System.out.println("OuterNo="+a);
			}
		}
		Inner i = new Inner();
		i.get();
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.get();
	}
}
