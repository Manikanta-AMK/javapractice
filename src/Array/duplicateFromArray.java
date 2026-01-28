package Array;

import java.util.HashSet;

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
	}
}
