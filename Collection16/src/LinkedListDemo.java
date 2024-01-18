// 22-12-2023

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Kiran");
		l.add(40);
		l.add(null);
		l.add(40);
		
		System.out.println(l);
		
		l.set(0, "Kalyani");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(40);
		System.out.println(l);
		
		l.add(0, "Tilekar");
		System.out.println(l);
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		
		l.remove();                //1st ele
		System.out.println(l);
		
		l.remove(1);               //remove ele at index
		System.out.println(l);
		
		l.remove("Kiran");         // remove particular obj
		System.out.println(l);
		
	}
}
