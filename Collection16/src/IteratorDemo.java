//22-12-2023

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

public static void main(String[] args) {

		
		List<Integer> l = new ArrayList<Integer>(); //generic version with restricted data type
		l.add(10);
		l.add(56);
		l.add(10);
		l.add(31);
		l.add(11);
		
		System.out.println(l);
		
		Iterator<Integer> i = l.iterator();
		
		while(i.hasNext())
		{
			int n = i.next();
			
			if(n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				i.remove();
			}
		}
		System.out.println(l);
}
}