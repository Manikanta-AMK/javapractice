package Array;

import java.util.Arrays;

public class numbersorting {

	public static void main(String[]args)
	{
		int a[]= {20,10,30,80,50,40,60,90,70,10};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("after sorting");	
		System.out.println(Arrays.toString(a));
	}
}
