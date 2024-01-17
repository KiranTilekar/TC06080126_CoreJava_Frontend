package first;
import java.util.Scanner;
public class Student {
	private int id;
	private String name;  //no access specifier hence it is default:available within pakage
	
	
	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id:");
		id = sc.nextInt();
		System.out.print("Enter name:");
		name = sc.next();
	}
	
	public void displaydata()
	{
		System.out.print(id+" "+name);
	}
	
}
