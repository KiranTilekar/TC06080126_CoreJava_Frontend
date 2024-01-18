//27-12-2023

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("Kiran", 100);
		h.put("Kalyani", 200);
		h.put("Gokul", 300);
		h.put("Shubhangi", 400);
		
		System.out.println(h);
		
		System.out.println(h.put("Kiran",500));
		System.out.println(h);
		
		Set s = h.keySet();
		System.out.println(s);
		
		Collection c = h.values();
		System.out.println(c);
		
		Set s1 = h.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + " "+m1.getValue());
			if(m1.getKey().equals("Kalyani"))
			{
				m1.setValue(900);
			}
		}
		System.out.println(h);
	}
}
