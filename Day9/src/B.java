
public class B extends A
{
	public void m1()
	{
		System.out.println("In m1 of B");
	}
	
	public void m2()
	{
		System.out.println("In m2 of B");
	}
	
	
	public static void main(String[] args) {
		B b = new B();
		A b1 = new B();
		
		b.m1();
		b1.m1();
		((B) b1).m2();
		
		//instanceof : to check if it is instance of other ot not
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
	}
}
