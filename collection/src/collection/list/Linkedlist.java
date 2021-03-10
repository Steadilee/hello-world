package collection.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		
		List<String> alist = new LinkedList();
		
		alist.add("서태웅");
		alist.add("강백호");
		alist.add("채치수");
		alist.add("정대만");
		alist.add("송태섭");
		
		System.out.println(alist);
		
		for(String arr : alist ) {
			System.out.println(arr);
		}
		
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		alist.add(3, "권준호");
		System.out.println(alist);
		
		alist.set(3, "안경선배");
		System.out.println(alist);
		
		alist.remove(3);
		System.out.println(alist);
		
		Collections.sort(alist);
		System.out.println(alist);
		
		alist.clear();
		System.out.println(alist);
		
		
		
		
	}
	
}
