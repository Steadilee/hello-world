package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetClass {
	
	public static void main(String[] args) {
		
		TreeSet<String> a = new TreeSet<>();
		
		a.add("apple");
		a.add("grape");
		a.add("banna");
		
		System.out.println(a);
		
//		Object[] b = a.toArray();
//		
//		for(int i = 0; i < a.size(); i++) {
//			System.out.println(i + " : "  + b[i]);
//		}
		
		Iterator<String> c = a.iterator();
		
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		
		
		
	}
	
	
}
