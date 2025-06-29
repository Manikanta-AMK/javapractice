package practice;

import java.util.HashSet;

public class duplicatefromarray {

	public static void main(String[]args)
	{
		int[] numbers = {1,5,9,7,6,2,5,4,5,2,4,7,5,4,7,};
		
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		
		for(int num : numbers)
		{
			if(!seen.add(num))
			{
				duplicates.add(num);
			}
		}
		System.out.println("duplicate numbers are removed " + duplicates);
	}
}
