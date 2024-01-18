//26-12-2023
package TreeSetAssignment;

import java.util.Comparator;

public class MyComparator1 implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
	    return -s1.compareTo(s2);
		
	}

	
}
