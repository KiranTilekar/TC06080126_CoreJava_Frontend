
public class Date
{
	private int dd,mm,yy;
	
	public Date() {}
	
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public String toString()
	{
		return "[dd="+dd+",mm="+mm+",yy="+yy+"]";
	}
	
	public static void swap(Date d1,Date d2)
	{
		Date temp;
		temp = d1;
		d1=d2;
		d2=temp;
	}
	
	public static void main(String[] args) {
		Date d1 = new Date(20,10,23);
		Date d2 = new Date(22,11,23);
		
		System.out.println("Before swap---");
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		Date.swap(d1, d2);
		System.out.println("After swap---"); //this is printed outside swap function hence that local variable and 
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		
	}
}


