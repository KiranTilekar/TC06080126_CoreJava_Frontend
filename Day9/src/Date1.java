

public class Date1
{
	private int dd,mm,yy;
	
	public Date1() {}
	
	public Date1(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public String toString()
	{
		return "[dd="+dd+",mm="+mm+",yy="+yy+"]";
	}
	
	public static void swap(Date1 d[])
	{
		Date1 temp;
		temp = d[0];
		d[0]=d[1];
		d[1]=temp;
	}
	
	public static void main(String[] args) {
		Date1 d[] = new Date1[2];
		d[0] = new Date1(20,10,23);
		d[1] = new Date1(22,11,23);
		
		System.out.println("Before swap---");
		System.out.println("d1="+d[0]);
		System.out.println("d2="+d[1]);
		Date1.swap(d);
		System.out.println("After swap---");
		System.out.println("d1="+d[0]);
		System.out.println("d2="+d[1]);
		
	}
}
/*
 * make class student
 * init data mem -> roll,name,{m1,m2,m3}
 * generate default n parameterised constructors
 * generate getters n toString method
 * stud array s[5]
 * for loop i=0;i<s.length;i++
 * read data mem from user
 */
