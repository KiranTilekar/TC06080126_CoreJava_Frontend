package p1;

public class B
{
	public static void main(String[] args) 
	{
		A a = new A();
//		System.out.println("num="+a.num);  // will give error,private member not accessible outside class
		System.out.println("sal="+a.sal);  //accessible coz it is public 
		System.out.println("sal="+a.roll); //accessible coz within package
		System.out.println("sal="+a.id);
	}
}
