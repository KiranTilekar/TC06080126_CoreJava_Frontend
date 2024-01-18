package cloneDemo;

public class Employee implements Cloneable {  //need to implement interface 
	
	private int id;
	private String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "[id="+id+",name="+name+"]";
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee(11,"Kiran");
		System.out.println(e1);
		
		Employee e2 = (Employee) e1.clone(); //clone is of object type,we need to type cast to employee
		System.out.println(e2);
	}

}
