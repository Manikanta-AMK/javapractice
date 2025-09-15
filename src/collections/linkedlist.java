package collections;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> ls = new LinkedList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(0, 2);
		ls.addFirst(5);
		ls.add(1);
		
		System.out.println(ls);
		
		for(Integer list:ls)
		{
			System.out.print(list+" ");
		}
		
		System.out.println(ls.remove(1));
		System.out.println(ls);
		System.out.println(ls.contains(5));
		System.out.println(ls.hashCode());
		System.out.println(ls.isEmpty());
//		System.out.println(ls.);
	}
}
