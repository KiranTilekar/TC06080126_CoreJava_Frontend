//26-12-2023

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("M");

		
//		t.add(10);
//		t.add(null);
		
//		System.out.println(t);
		
		
		//StringBuilder and StringBuffer not implement comparable interface
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("A"));
		System.out.println(t);
		
	}
}
