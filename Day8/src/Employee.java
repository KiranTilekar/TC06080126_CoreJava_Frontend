
public class Employee 
{
	private int empID;
	private String empName;
	private Date dt_of_joining;
	
	public Employee() {}
	
	public Employee(int empID,String empName,Date dt_of_joining)
	{
		this.empID=empID;
		this.empName=empName;
		this.dt_of_joining=dt_of_joining;
	}
	
	public String toString()
	{
		return "Employee [empID="+empID+",empName="+empName+",dt_of_joining="+dt_of_joining+"]";
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(11,"Kiran",new Date(19,10,2023));
		System.out.println(e);
	}
}

/*
 * Que1:
 * Create a class MathOperation with two data member X and Y to store the operand and third data member R to store
 * result of operation.
 * Create method members:
 * 1.init - to input X and Y from user 
 * 2.add - to add X and Y and store in R
 * 3.multiply - to multiply X and Y store in R
 * 4.power - to calculate X^Y and store in R
 * 5.display - to display result R
 * 
 * ----------------------------------------------------------------------------
 * Que2:
 * Create a class MathOperation containing method Multiply to calculate multiplication of following arguments
 * a.two integers
 * b.three float
 * c.all elements of array
 * d.one double and one integer
 * 
 * ----------------------------------------------------------------------------
 * Que3:
 * Create a class Person with properties (name and age) with following features
 * a.default age of person should be 18
 * b.a person object can be initialized with name and age
 * c.method to display name and age of person
 */
