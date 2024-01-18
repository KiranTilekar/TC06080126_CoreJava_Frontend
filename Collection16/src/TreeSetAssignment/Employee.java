//26-12-2023
package TreeSetAssignment;

import java.util.Comparator;

public class Employee implements Comparator{

	int id;
	String name;
	
	public Employee(int a,String b)
	{
		id = a;
		name = b;
	}

	@Override
	public int compare(Object o1, Object o2) {
		
		return 0;
	}

	
}
