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
		
	}
}
