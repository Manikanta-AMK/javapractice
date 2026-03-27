package collections.listInterface;

import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		
		//creation of Vector class or list
		Vector<String> v = new Vector<>();
		
		//adding the elements in to vector object
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("e");
		v.add(1, "f");
		//printing all elements in object
		System.out.println(v);
		
		//fetching all elements from object
		for(Object v1:v)
		{
			System.out.println(v1);
		}
		//created second class to add in to first object
		Vector<String> v2 = new Vector<>();
		v2.add("g");
		v2.add("hj");
		System.out.println(v2);
		//second object is added to first object without index
		v.addAll(v2);
		//second object is added to first object without index
		v.addAll(0, v2);
		System.out.println(v);
		
		//performing the actions for object one
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains("c"));
//		System.out.println(v.hashCode());
		System.out.println(v.remove(3));
		System.out.println(v.get(2));
		System.out.println(v.lastIndexOf("c"));
		v.removeAll(v2);
		System.out.println(v);
		v.set(1, "m");
		System.out.println(v);
		v.clear();
	}
}
