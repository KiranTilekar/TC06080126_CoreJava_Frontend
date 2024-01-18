package p1.p2;

import p1.A; //to access public member outside package

public class C extends A // extends coz to access protected mem
{
	public static void main(String[] args) {
		A a = new A();
		System.out.println("num="+a.num); //private and outside package
		System.out.println("sal="+a.sal); //public hence accessible
		System.out.println("roll="+a.roll); //default not outside pkg
		System.out.println("id="+a.id);  //protected n outside package
		
		C c = new C(); // for protected mem outside pkg
		System.out.println("id="+c.id);
	}
}
