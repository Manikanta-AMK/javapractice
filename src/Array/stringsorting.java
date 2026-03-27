package Array;

import java.util.Arrays;

public class stringsorting {

	public static void main(String[] args) {
		
		String s[]= {"Chanti","Manikanta","amk","Arige Manikanta","A Manikanta"};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(s));
		
		
		Arrays.sort(s);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(s));
		
//		String[] names = {"a", "A"," b", "B", "c", "D"," C"};
//		System.out.println("befor sorting n: "+ Arrays.toString(names));
//		Arrays.sort(names);
//		System.out.println("After sorting n: "+Arrays.toString(names));
		
		String[] names = {"a", "A"," b", "B", "c", "D"," C"};

		System.out.println("Before sorting: " + Arrays.toString(names));

		Arrays.sort(names);

		System.out.println("After sorting: " + Arrays.toString(names));
		
		
		
	}
}
