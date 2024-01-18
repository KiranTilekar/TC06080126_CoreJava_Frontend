package interfaceclass;

public class Calculations extends CompareCal implements StaticCal,Factorial
{

	@Override
	public int Fact(int a) {
		// TODO Auto-generated method stub
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f*=i;
		}
		return f;
	}

	@Override
	public int avg(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b)/2;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subs(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	public static void main(String[] args) {
		
		Calculations c = new Calculations();
		System.out.println("Addition = "+c.add(10, 20));
		System.out.println("Substraction = "+c.subs(5, 1));
		System.out.println("Average = "+c.avg(5, 2));
		System.out.println("Factorial = "+c.Fact(5));
	}
	
}
