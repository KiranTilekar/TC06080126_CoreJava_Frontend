
public class D extends c
{
	public D()
	{
		//super()  if we do not write super() it is bt default there
		System.out.println("Child Default");
	}
	
	public D(int a)
	{
		super(10);
		System.out.println("Child Parameterized");
	}
	
	public static void main(String[] args) {
		D d = new D();
		D d1 = new D(10);
		
	}
}
