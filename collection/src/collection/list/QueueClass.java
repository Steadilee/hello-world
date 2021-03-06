package collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	public static void main(String[] args) {
		
		Queue<String> a = new LinkedList();
		
		a.offer("하나");
		a.offer("둘");
		a.offer("셋");
		a.offer("넷");
		a.offer("다섯");
		
		System.out.println(a.peek());
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a.poll());
		
		a.add("여섯");
		System.out.println(a);
		a.remove();
		System.out.println(a);
		a.remove();
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
	}

}
