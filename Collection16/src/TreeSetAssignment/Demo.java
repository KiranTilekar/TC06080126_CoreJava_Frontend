//26-12-2023
package TreeSetAssignment;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>(new MyComparator1());
		
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("D");
		
		System.out.println(t);
	}
}
