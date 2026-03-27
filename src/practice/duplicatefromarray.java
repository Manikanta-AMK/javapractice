package practice;

import java.util.HashSet;

public class duplicatefromarray {

	public static void main(String[]args)
	{
		int[] numbers = {1,5,9,7,6,2,5,4,5,2,4,7,5,4,7,};
		
		HashSet<Integer> uniqeNumber = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		
		for(int num : numbers)
		{
			if(!uniqeNumber.add(num))
			{
				duplicates.add(num);
			} 
		}
		System.out.println("duplicate numbers are removed " + duplicates);
		System.out.println("unique numbers "+ uniqeNumber);
	
		
		HashSet<Integer> uniq = new HashSet<Integer>();
		HashSet<Integer> dup = new HashSet<Integer>();
		
		for(int num: numbers)
		{
			if(!uniq.add(num))
			{
				dup.add(num);
			}
		}
		System.out.println("uniq number: "+ uniq);
		System.out.println("dup number: "+ dup);
	
	
	
	
	
	
	
	
	
	
	
	}
}
