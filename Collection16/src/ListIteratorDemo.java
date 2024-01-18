//22-12-2023

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Kiran");
		l.add("Kalyani");
		l.add("Mayuri");
		l.add("Shubhangi");
		l.add("Gokul");
		
//		System.out.println(l);
		
		ListIterator<String> i = l.listIterator();
		
		while(i.hasNext())
		{
			String s = i.next();
			
			if(s.equals("Kiran"))
			{
				i.set("Tilekar");
			}
			
			if(s.equals("Mayuri"))
			{
				i.add("Priyanka");
			}
		}
		
//		System.out.println("Next    "+l);
		
		while(i.hasPrevious())
		{
			String s = i.previous();
			
			if(s.equals("Kiran"))
			{
				i.set("Tilekar");
			}
			
			
			if(s.equals("Mayuri"))
			{
				i.add("Priyanka");
			}
			
			System.out.println("after set"+s);
			
		}
		
//		System.out.println("prev    "+l);
}
}