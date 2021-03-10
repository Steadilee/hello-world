package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LikedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<String> a = new LinkedHashSet<>();
		
		a.add("서태웅");
		a.add("강백호");
		a.add("채치수");
		a.add("권준호");
		
		System.out.println(a);
		
//		Object[] b = a.toArray();
//		
//		for(Object c : b) {
//			System.out.println(c);
//		}
		
		Iterator aIter = a.iterator();
		
		while(aIter.hasNext()) {
			System.out.println(aIter.next());
		}

		
		//오름차순 정렬
		TreeSet<String> c = new TreeSet<>(a);
		System.out.println(c);
	}
	
	
	
	
	
	
}
