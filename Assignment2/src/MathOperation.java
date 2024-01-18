import java.util.Scanner;
import java.math.*;

public class MathOperation 
{
	private int x,y,r;
	
	public void init()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		x = sc.nextInt();
		System.out.println("Enter y:");
		y = sc.nextInt();
	}
	
	public void Add()
	{
		r = x+y;
	}
	
	public void Multiplication()
	{
		r = x*y;
	}
	
	public void Power()
	{
		r = (int) Math.pow(x, y);
	}
	
	public void Display()
	{
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		MathOperation m = new MathOperation();
		m.init();
		m.Add();
		System.out.print("Add=");
		m.Display();
		m.Multiplication();
		System.out.print("Mul=");
		m.Display();
		m.Power();
		System.out.print("Pow=");
		m.Display();
	}
}
