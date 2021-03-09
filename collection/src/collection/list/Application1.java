package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application1 {
	public static void main(String[] args) {
		
		List<String> aList = new ArrayList();
		
		aList.add("apple");
		aList.add("grape");
		aList.add("pineapple");
		aList.add("banana");
		aList.add("mango");
		
		System.out.println(aList);
		
		Collections.sort(aList);
		System.out.println(aList);
		
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(i + " : " + aList.get(i));
		}
		
		List<String> bList = new LinkedList(aList);
		
		Iterator<String> ib = ((LinkedList)bList).descendingIterator();
		
		List<String> cList = new ArrayList();
		while(ib.hasNext()) {
			
			cList.add(ib.next());
			
		}
		
		System.out.println(cList);
		
		
		
		
	}
}
