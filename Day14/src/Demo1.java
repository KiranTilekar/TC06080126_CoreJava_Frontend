//multiple catch block
public class Demo1 {

	public static void main(String args[])
	{
		try {
			int a,b,c = 0;
			
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			
			c = a/b;
			
			System.out.println("Div"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter atleat 2 parameters");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Enter only integer data");
		}
		
		catch(Exception e){
			System.out.println("Exception occured...");
		}
	}
}