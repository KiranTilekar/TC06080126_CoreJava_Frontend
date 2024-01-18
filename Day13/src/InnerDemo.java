//member inner class
public class InnerDemo 
{
	private int no=100;
	
	protected class Inner
	{
		int no = 1000;
		
		public void getNo()
		{
			
			System.out.println("No="+no);
			int no = 10;
			System.out.println("Num="+no);
			System.out.println("Outer="+InnerDemo.this.no);
		}
		
	}
//	
//	public void get() //alternate method to access inner class member
//	{
//		Inner i = new Inner();
//		i.getNo();
//	}
	
	public static void main(String[] args) {
		InnerDemo o = new InnerDemo();
		Inner i = o.new Inner();
		i.getNo();
//		o.get();
		
		/*another way access inner class member
		 Inner i = new Outer().new Inner();
		 i.getNo();
		*/
	}
	
	
}
