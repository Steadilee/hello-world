package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetClass {
	
	public static void main(String[] args) {
		
		HashSet<String> a = new HashSet<>();
		
		a.add("강백호");
		a.add(new String("채치수"));
		a.add(new String("정대만"));
		a.add(new String("서태웅"));
		a.add("송태섭");
		
		System.out.println(a);
		
		a.add("강백호");
		System.out.println(a);
		a.add("채치수");
		System.out.println(a);
		
		//값 꺼내기
		//방법1. toArray(); 활용
		Object[] aArr = a.toArray();
		for(Object b : aArr) {
			System.out.println(b);
		}

		//방법2. iterator(); 활용
		Iterator<String> aIter = a.iterator();
		
		while(aIter.hasNext()) {
			System.out.println(aIter.next());
		}
		
		a.remove("채치수");
		System.out.println(a);
		
		
		
	}
}
