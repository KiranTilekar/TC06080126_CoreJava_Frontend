// 21-12-2023

//collection -> interface , collections -> class 
//Boxing,Unboxing,auto boxing,unboxing


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		int no = 10;
		Integer i = new Integer(no);
		
		int a = i.intValue();
		
		int b = 100;
		Integer m = b;
		int c = m;
		
		List<Integer> l = new ArrayList<Integer>(); //generic version with restricted data type
		l.add(10);
		l.add(56);
		l.add(10);
		//l.add("abc")
		l.add(null);
		
		System.out.println(l);
		
		l.add(2, 88);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		System.out.println(l.contains(100));
		
		List l1 = Collections.synchronizedList(l);
		
	}
	
}
