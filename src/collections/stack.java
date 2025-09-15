package collections;

import java.util.Stack;

public class stack {

	 public static void main(String[] args) {
		
		 Stack<String> s = new Stack<>();
		 s.push("Manikanta");
		 s.push("AMK");
		 s.push("Arige");
		 System.out.println(s);
		 
		 System.out.println("last element in object is: "+s.peek());
		 System.out.println("stack object stored manikanta name: "+s.contains("Manikanta"));
		 System.out.println("stack object is not empty: "+s.empty());
		 System.out.println("index of the name is: "+s.indexOf("Arige"));
		 System.out.println("last element is: "+s.lastElement());
		 System.out.println("capacity of the object is: "+s.capacity());
		 System.out.println("revmove the last element from object: "+s.pop());
		 System.out.println("update the name: "+s.set(0, "Manikanta"));
		 System.out.println("index 2 is: "+s.get(1));
		 System.out.println("search the index of element: "+s.search("AMK"));
		 System.out.println(s);
	}
}
