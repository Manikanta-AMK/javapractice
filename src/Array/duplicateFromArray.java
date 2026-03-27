package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateFromArray {

	public static void main(String[] args) {
		
		int[] numbers  =  {1,5,7,8,4,13,1,4,5,7,9,6,3,13,8}; 
		
		HashSet<Integer> uniq =  new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();
		
		for(int number : numbers)
		{
			if(!uniq.add(number))
			{
				duplicate.add(number);
			}
		}
		System.out.println("uniqnumbers are: "+uniq);
		System.out.println("duplicate numbers are: "+duplicate);
		
		List<Integer> Arraylist = Arrays.asList(10,50,10,20,10,20,10,50,30);
		
		Set<Integer> unique1 = new HashSet<>();
		Set<Integer> dup = new HashSet<>();
		
		for(Integer number1: Arraylist)
		{
			if(!unique1.add(number1))
			{
				dup.add(number1);
			}
		}
		System.out.println("unique number is: "+unique1);
		System.out.println("duplicate number is: "+dup);
		
		List<Integer> list = Arrays.asList(10, 20, 30, 10, 40, 20, 50);

		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (Integer num : list) {
		    if (!seen.add(num)) {
		        duplicates.add(num);
		    }
		}

		System.out.println("seen: " + seen);
		System.out.println("Duplicates: " + duplicates);
		
		
	}
}
