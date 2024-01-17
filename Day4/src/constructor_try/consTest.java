package constructor_try;

public class consTest 
{
	//use to initialize member method & variable
	//constructor should be public and not have return type but implicitly return object
	
	int id;
	String name;
	float salary;
	
	public consTest(int id,String name,float salary)  // should be public
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void showData()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}
