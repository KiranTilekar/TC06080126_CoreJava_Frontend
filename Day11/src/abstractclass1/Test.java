package abstractclass1;

public class Test
{
	public static void main(String [] args)
	{
//		Bank b = new Bank(); CTE coz abstract class can't be instantiated
		Bank b1 = new SBI();
		System.out.println("SBI="+b1.getROI());
	}
}
