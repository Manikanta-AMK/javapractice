package collections.queInterface;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class arrayDeque {

	public static void main(String[] args) {
		
		LinkedList<String> dq = new LinkedList<>();
		dq.add("apple");
		dq.add("banana");
		dq.addFirst("dryruit");
		dq.offer("kiwi");
		dq.offerFirst("goa");
		dq.addLast("pineapple");
		dq.offerLast("graps");
		
		//output is:  goa, dryruit, apple, banana, kiwi, pineapple, graps
		System.out.println(dq);
		
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.removeLast());
		System.out.println(dq);
		System.out.println(dq.poll());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		System.out.println(dq.size());
	}
}
