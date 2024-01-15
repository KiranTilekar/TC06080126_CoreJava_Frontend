
public class Person 
{
	int id;
	String name;
	
	public Person() {}
	
	public Person(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	
	public void getData()
	{
		System.out.println("ID="+id+" name="+name);
	}
	
}
