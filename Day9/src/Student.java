import java.util.Scanner;
public class Student 
{
	private int roll;
	private String name;
	private int m1,m2,m3;
	
	public Student() {}
	
	public Student(Student s[])
	{
		
		
	}
	
	public String toString()
	{
		return "str";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size =sc. nextInt();
		Student s[] = new Student[size];
		int roll,m1,m2,m3;
		String name;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter roll:");
			roll = sc.nextInt();
			System.out.println("Enter name");
			name = sc.next();
			System.out.println("Enter m1=");
			m1 = sc.nextInt();
			System.out.println("Enter m2=");
			m2 = sc.nextInt();
			System.out.println("Enter m3=");
			m3 = sc.nextInt();
			
		}
		
		s[0]=new Student(roll,name,m1,m2,m3);
	}
}
