package practice2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicates {

	public static void main(String[] args) {
		
		int [] numbers  = {1,5,8,7,8,6,9,4,2,6,45,12};
		
		HashSet<Integer> uniq = new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();
		
		for(int number: numbers)
		{
			if(!uniq.add(number))
			{
				duplicate.add(number);
			}
		}
		System.out.println("the uniq numbers are: "+uniq);
		System.out.println("the duplicate numbers are: "+duplicate);
		
		String name  = "Mani, Manikanta, chanti, Manikanta, chanti, AMK";
		String[] words = name.split(",\\s* ");
		
		Set<String> uniqword = new HashSet<String>();
		Set<String> duplicateword = new HashSet<String>();
		
		for(String word: words)
		{
			if(!uniqword.add(word))
			{
				duplicateword.add(word);
			}
		}
		System.out.println("uniq words are: "+String.join(" ", uniqword));
		System.out.println("duplicate words are: "+String.join(" ", duplicateword));
	}
	
}
