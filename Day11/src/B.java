
public class B extends A
{
	B get()
	{
		return this; //this keyword : current object value
	}
	
	void msg()
	{
		System.out.println("Hello...");
	}   
	public static void main(String[] args) {
		new B().get().msg();
	}
}
