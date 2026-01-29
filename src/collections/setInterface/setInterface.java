package collections.setInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setInterface {

	public static void main(String[] args) {
		
		//  HashSet --> HashMap --> Array nodes(key, value)
		// HashSet will store the value in hashmap internally
		//hashmap will take he inputs from hashset as keys and for values i will create dummy objects -- new Object()
		//creation of Set Interface
//		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		Set<Integer> hs = new HashSet<>();
		
		//addition of  elements
		hs.add(2);
		hs.add(52);
		hs.add(85);
		hs.add(565656);
		hs.add(525);
		hs.add(850);
		hs.add(565);
		System.out.println("set interface object: "+hs);
//		//remove of the elements
//		System.out.println(hs.remove(52));
//		
//		//retrieve all elements
//		for(Integer element: hs)
//		{
//			System.out.println(element);
//		}
//		
//		System.out.println(hs);
		
		//treeset
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(12);
		ts.add(5);
		ts.add(8);
		ts.add(7);
		ts.add(4);
		ts.add(1);
		ts.add(0);
		ts.add(99);
		System.out.println("treeset interface object: "+ts);
		System.out.println(ts.first());
		System.out.println(ts.last()); 
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
//		System.out.println(ts.iterator());
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.pollLast());
//		Iterator<Integer> it = ts.iterator();
//		System.out.println(it);
		System.out.println("treeset interface object: "+ts);
		System.out.println(ts.contains(12));
		System.out.println(ts.hashCode());
		System.out.println(ts.toString());
		System.out.println(ts.ceiling(100));
		System.out.println(ts.floor(100));
		System.out.println(ts.descendingSet());
		System.out.println(ts.comparator().compare(12, 99));
		
		
		
		
		
		
		
	}
}
