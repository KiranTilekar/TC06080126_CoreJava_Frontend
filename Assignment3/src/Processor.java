
public abstract class Processor 
{
	private int data;
	
	public void showData()
	{
		System.out.println("Data="+data);
	}
	
	public abstract void process();
}
