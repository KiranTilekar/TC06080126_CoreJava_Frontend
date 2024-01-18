//26-12-2023
package TreeSetAssignment;

import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		
		Employee e = new Employee(1, "a");
		Employee e1 = new Employee(2, "b");
		
		TreeSet t = new TreeSet();
		
		t.add(e);
		t.add(e1);
		
		System.out.println(t);
	}
}
