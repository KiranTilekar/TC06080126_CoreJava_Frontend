//Assignment

public class Employee {
	private int empNo,salary;
	private static int totalSalary;
	private static int count;
	private int temp=0;
	
	Employee(int salary)
	{
		this.salary=salary;
		totalSalary+=salary;
		count++;
	}
	
	public static void getCount()
	{
		System.out.print("Count="+count);
	}
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee(5000);
		Employee e2 = new Employee(1000);
		
		Employee.getCount();
		System.out.println("  Total Salary = "+totalSalary);
		
		
	}

}
