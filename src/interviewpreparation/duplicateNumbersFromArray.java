package interviewpreparation;

import java.util.LinkedHashSet;

public class duplicateNumbersFromArray {

	public static void main(String[] args) {
		
		int[] numbers = {1,5,8,3,2,4,8,8,45,5,4,5};
		
		LinkedHashSet<Integer>uniq = new LinkedHashSet<>();
		LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();
		
		for(int number: numbers)
		{
			if(!uniq.add(number))
			{
				duplicate.add(number);
			}
		}
	
		System.out.println("uniq numbers are: "+uniq);
		System.out.println("duplicates numbers are: "+duplicate);
	
	}
}
