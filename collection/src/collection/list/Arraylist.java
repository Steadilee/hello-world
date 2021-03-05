package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	
	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		
		//기본생성자 호출
		System.out.println(alist);
		
		//다형성 확인
		List alist2 = new ArrayList();
		Collection alist3 = new ArrayList();
		
		alist.add("이해승");
		alist.add(100);
		alist.add(7.6);
		alist.add(new Date());
		
		System.out.println("alist : " + alist);
		System.out.println("요소의 갯수 : " + alist.size());
		
		for(int i = 0; i < alist.size(); i++ ) {
			System.out.println(i + " : "  + alist.get(i));
		}
		
		alist.add("apple");
		System.out.println("apple 추가 확인 : " + alist);
		
		alist.add(1, "1번추가");
		System.out.println("추가확인 : " + alist);
		
		
		alist.set(2, "book");
		System.out.println("2번 수정 확인 : " + alist);

		alist.remove(1);
		System.out.println("1번 삭제 확인");
		System.out.println("삭제확인 : " + alist);
		
		alist.clear();
		System.out.println("전체 삭제 확인 : " + alist);
		
		//ArrayList 정렬
		List<Integer> intList = new ArrayList();
		intList.add(100);
		intList.add(176);
		intList.add(32);
		intList.add(291);
		intList.add(17);
		
		System.out.println("intList 입력확인 : " + intList);
		
		Collections.sort(intList);
		System.out.println("오름차순 정렬 확인 : " + intList);
		
		//내림차순
		intList = new LinkedList<>(intList);
		
		Iterator<Integer> dIter = ((LinkedList<Integer>)intList).descendingIterator();
		
		ArrayList arr = new ArrayList();
		while(dIter.hasNext()) {
			arr.add(dIter.next());
		}
		
		System.out.println("내림차순 확인 : " + arr);
	}
}
