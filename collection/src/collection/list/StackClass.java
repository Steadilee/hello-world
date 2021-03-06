package collection.list;

import java.util.Stack;

public class StackClass {
	
	public static void main(String[] args) {
		
		Stack<Integer> a = new Stack();
		
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		
		System.out.println(a);
		
		a.add(0, 0);
		System.out.println(a);
		
		a.set(5, 6);
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
//		a.clear();
//		System.out.println(a);

		System.out.println(a.search(4));
		
		System.out.println("구분");
		System.out.println(a.get(0));
		System.out.println(a.peek());
		System.out.println(a.peek());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		
	}
}
