
public class Employee extends Object
{
	private int id;
	private String name;
	
	public Employee() {}
	
	public Employee(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "Employee[id="+id+", name="+"]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		Employee e = (Employee)o;
		if((this.id==e.id) && (this.name.equals(name)))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Rahul");
		Employee e2 = new Employee(111,"Rahul");
		
		if(e1==e2) //checking references 
		{
			System.out.println("Equal");
		}
		else
			System.out.println("not equal");
		
		
		if(e1.equals(e2))
		{
			System.out.println("Objects Equal");
		}
		else
			System.out.println("Objects Not equal");
		
		/*Hashcode:
			It is method of object class having return type integer
			It gives similar values only if hashcode methode is overriden */
		
		
		
	}
	
	
}
