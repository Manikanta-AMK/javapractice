package StringProgramsPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicateWords {

	public static void main(String[] args) {
		
		String name = "Big black bug bit a big black dog on his big black nose";
		String[] nameSplit = name.toLowerCase().split(" ");
		
		LinkedHashSet<String> unique = new LinkedHashSet<>();
		LinkedHashSet<String> duplicates = new LinkedHashSet<>();
		
		for(String words: nameSplit )
		{
			if(!unique.add(words))
			{
				duplicates.add(words);
			}
		}
		System.out.println("unique words are printed: "+ unique); 
		System.out.println("unique words are printed: "+String.join(" ", unique));
		System.out.println("duplicates words are printed: "+String.join(" ", duplicates));
	}
}
