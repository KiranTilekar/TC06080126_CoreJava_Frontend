//26-12-2023
package ComparatorDemo;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
			
			TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
			
			t.add(10);
			t.add(0);
			t.add(15);
			t.add(2);
			
			System.out.println(t);
		}
}
