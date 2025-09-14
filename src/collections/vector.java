package collections;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("e");
		v.add(1, "f");
		System.out.println(v);
		for(Object v1:v)
		{
			System.out.println(v1);
		}
		
		Vector v2 = new Vector();
		v2.add("g");
		v2.add("hj");
		System.out.println(v2);
		v.addAll(v2);
		v.addAll(0, v2);
		System.out.println(v);
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains("c"));
//		System.out.println(v.containsAll(v));
		System.out.println(v.hashCode());
		System.out.println(v.remove(3));
		System.out.println(v.get(2));
		System.out.println(v.lastIndexOf("c"));
		
		v.clear();
	}
}
