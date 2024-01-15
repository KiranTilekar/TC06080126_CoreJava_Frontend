
public class A 
{
	final int a;
	
	public A()
	{
		a = 10;
	}
	
	public void get() //final meth0d
	{
		System.out.println("In get() of A");
	}
	
	public void display()
	{
		//a = 12; // final var cant be changed
	}
}
