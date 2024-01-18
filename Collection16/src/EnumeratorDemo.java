//22-12-2023
//
import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

public static void main(String[] args) {
		
		Vector <Integer>v = new Vector<Integer>();
		System.out.println("Capacity="+v.capacity());
		
		for(int i=1;i<=11;i++)
		{
			v.addElement(i);
		}
		
		System.out.println("Capacity="+v.capacity());
		
		System.out.println("Size="+ v.size());
		
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements())
		{
			int i = e.nextElement();
			
			if(i%2==0)
			{
				System.out.println(i);
			}
//			else
//			{
//				e.remove(i);
//				v.remove(i);
//			}
			
		}
		System.out.println(v);
}
}