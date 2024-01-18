//22-12-2023

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector <Integer>v = new Vector<Integer>();
		System.out.println("Capacity="+v.capacity());
		
		for(int i=1;i<=11;i++)
		{
			v.addElement(i);
		}
		
		System.out.println("Capacity="+v.capacity());
		
		System.out.println("Size="+ v.size());
	}
}
