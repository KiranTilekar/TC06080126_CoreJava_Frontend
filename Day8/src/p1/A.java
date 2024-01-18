package p1;

public class A 
{
	private int num = 10; //private mem accessible within class
	public int sal = 11;  //public mem accessible everywhere
	int roll=1; //default accessible in package
	protected int id = 3; // protected mem accessible within pkg n for outside pkg by inheritance
	
	private void getNum()
	{
		System.out.println("num="+num);
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		System.out.println("num="+a.num);
		a.getNum();
		System.out.println("sal="+a.sal);
		System.out.println("sal="+a.roll);
		System.out.println("sal="+a.id);
		
	}
}
